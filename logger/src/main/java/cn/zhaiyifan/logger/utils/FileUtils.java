package cn.zhaiyifan.logger.utils;

import java.io.File;
import java.io.FileFilter;

public class FileUtils {
    /**
     * Delete corresponding path, file or directory.
     *
     * @param file path to delete.
     */
    public static void delete(File file) {
        delete(file, false);
    }

    /**
     * Delete corresponding path, file or directory.
     *
     * @param file      path to delete.
     * @param ignoreDir whether ignore directory. If true, all files will be deleted while directories is reserved.
     */
    public static void delete(File file, boolean ignoreDir) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }

        File[] fileList = file.listFiles();
        if (fileList == null) {
            return;
        }

        for (File f : fileList) {
            delete(f, ignoreDir);
        }
        // delete the folder if need.
        if (!ignoreDir) file.delete();
    }

    /**
     * Delete corresponding path, file or directory.
     *
     * @param file   path to delete.
     * @param filter filter to determine which file should be deleted, null for all files.
     */
    public static void delete(File file, FileFilter filter) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            // delete file if need.
            if (filter == null || filter.accept(file)) {
                file.delete();
            }
            return;
        }

        File[] fileList = file.listFiles();
        if (fileList == null) {
            return;
        }

        for (File f : fileList) {
            delete(f, filter);
        }
        // delete the folder if need.
        if (filter == null || filter.accept(file)) {
            file.delete();
        }
    }

    /**
     * Create directory if incoming directory not exists or is a file (delete before create it).
     *
     * @param dir Directory to create.
     * @return {@code true} if corresponding directory exists or is created sucessfully.
     */
    public static boolean mkdirs(File dir) {
        if (dir.exists()) {
            if (dir.isDirectory()) {
                return true;
            } else {
                // delete file.
                delete(dir);
            }
        }
        return dir.mkdirs();
    }
}
