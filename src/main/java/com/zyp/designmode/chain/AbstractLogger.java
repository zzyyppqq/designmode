package com.zyp.designmode.chain;

/**
 * 责任链模式
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {//不会造成递归，因为对象不同
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
