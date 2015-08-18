package cn.zhaiyifan.logger.utils;

import android.util.Pair;

public class ArrayUtils {

    public static int getArrayDimension(Object objects) {
        int dim = 0;
        for (int i = 0; i < objects.toString().length(); ++i) {
            if (objects.toString().charAt(i) == '[') {
                ++dim;
            } else {
                break;
            }
        }
        return dim;
    }

    public static Pair<Pair<Integer, Integer>, String> arrayToObject(Object object) {
        StringBuilder builder = new StringBuilder();
        int cross = 0, vertical = 0;
        if (object instanceof int[][]) {
            int[][] ints = (int[][]) object;
            cross = ints.length;
            vertical = cross == 0 ? 0 : ints[0].length;
            for (int[] ints1 : ints) {
                builder.append(arrayToString(ints1).second + "\n");
            }
        } else if (object instanceof byte[][]) {
            byte[][] ints = (byte[][]) object;
            cross = ints.length;
            vertical = cross == 0 ? 0 : ints[0].length;
            for (byte[] ints1 : ints) {
                builder.append(arrayToString(ints1).second + "\n");
            }
        } else if (object instanceof short[][]) {
            short[][] ints = (short[][]) object;
            cross = ints.length;
            vertical = cross == 0 ? 0 : ints[0].length;
            for (short[] ints1 : ints) {
                builder.append(arrayToString(ints1).second + "\n");
            }
        } else if (object instanceof long[][]) {
            long[][] ints = (long[][]) object;
            cross = ints.length;
            vertical = cross == 0 ? 0 : ints[0].length;
            for (long[] ints1 : ints) {
                builder.append(arrayToString(ints1).second + "\n");
            }
        } else if (object instanceof float[][]) {
            float[][] ints = (float[][]) object;
            cross = ints.length;
            vertical = cross == 0 ? 0 : ints[0].length;
            for (float[] ints1 : ints) {
                builder.append(arrayToString(ints1).second + "\n");
            }
        } else if (object instanceof double[][]) {
            double[][] ints = (double[][]) object;
            cross = ints.length;
            vertical = cross == 0 ? 0 : ints[0].length;
            for (double[] ints1 : ints) {
                builder.append(arrayToString(ints1).second + "\n");
            }
        } else if (object instanceof boolean[][]) {
            boolean[][] ints = (boolean[][]) object;
            cross = ints.length;
            vertical = cross == 0 ? 0 : ints[0].length;
            for (boolean[] ints1 : ints) {
                builder.append(arrayToString(ints1).second + "\n");
            }
        } else if (object instanceof char[][]) {
            char[][] ints = (char[][]) object;
            cross = ints.length;
            vertical = cross == 0 ? 0 : ints[0].length;
            for (char[] ints1 : ints) {
                builder.append(arrayToString(ints1).second + "\n");
            }
        } else {
            Object[][] objects = (Object[][]) object;
            cross = objects.length;
            vertical = cross == 0 ? 0 : objects[0].length;
            for (Object[] objects1 : objects) {
                builder.append(arrayToString(objects1).second + "\n");
            }
        }
        return Pair.create(Pair.create(cross, vertical), builder.toString());
    }
    public static Pair arrayToString(Object object) {
        StringBuilder builder = new StringBuilder("[");
        int length = 0;
        if (object instanceof int[]) {
            int[] ints = (int[]) object;
            length = ints.length;
            for (int i : ints) {
                builder.append(i + ",\t");
            }
        } else if (object instanceof byte[]) {
            byte[] bytes = (byte[]) object;
            length = bytes.length;
            for (byte item : bytes) {
                builder.append(item + ",\t");
            }
        } else if (object instanceof short[]) {
            short[] shorts = (short[]) object;
            length = shorts.length;
            for (short item : shorts) {
                builder.append(item + ",\t");
            }
        } else if (object instanceof long[]) {
            long[] longs = (long[]) object;
            length = longs.length;
            for (long item : longs) {
                builder.append(item + ",\t");
            }
        } else if (object instanceof float[]) {
            float[] floats = (float[]) object;
            length = floats.length;
            for (float item : floats) {
                builder.append(item + ",\t");
            }
        } else if (object instanceof double[]) {
            double[] doubles = (double[]) object;
            length = doubles.length;
            for (double item : doubles) {
                builder.append(item + ",\t");
            }
        } else if (object instanceof boolean[]) {
            boolean[] booleans = (boolean[]) object;
            length = booleans.length;
            for (boolean item : booleans) {
                builder.append(item + ",\t");
            }
        } else if (object instanceof char[]) {
            char[] chars = (char[]) object;
            length = chars.length;
            for (char item : chars) {
                builder.append(item + ",\t");
            }
        } else {
            Object[] objects = (Object[]) object;
            length = objects.length;
            for (Object item : objects) {
                builder.append(ObjectUtils.objectToString(item) + ",\t");
            }
        }
        return Pair.create(length, builder.replace(builder.length() - 2, builder.length(), "]").toString());
    }
}
