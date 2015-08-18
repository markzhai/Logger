package cn.zhaiyifan.logger;

/**
 * Log4j wrapper
 */
class Log4j {
    private static LoggerFile.Log4jWrapper log4j = LoggerFile.getLog4j(Constants.TAG);

    // 带 TAG 标签
    public static void v(String tag, String text) {
        log4j.trace("[" + tag + "]" + text);
    }

    public static void i(String tag, String text) {
        log4j.info("[" + tag + "]" + text);
    }

    public static void d(String tag, String text) {
        log4j.debug("[" + tag + "]" + text);
    }

    public static void w(String tag, String text) {
        log4j.warn("[" + tag + "]" + text);
    }

    public static void e(String tag, String text) {
        log4j.error("[" + tag + "]" + text);
    }

    public static void e(Exception e) {
        log4j.error(e);
    }

    // 不带TAG 标签
    public static void v(String text) {
        log4j.trace("[" + Constants.TAG + "]" + text);
    }

    public static void i(String text) {
        log4j.info("[" + Constants.TAG + "]" + text);
    }

    public static void d(String text) {
        log4j.debug("[" + Constants.TAG + "]" + text);
    }

    public static void w(String text) {
        log4j.warn("[" + Constants.TAG + "]" + text);
    }

    public static void e(String text) {
        log4j.error("[" + Constants.TAG + "]" + text);
    }
}
