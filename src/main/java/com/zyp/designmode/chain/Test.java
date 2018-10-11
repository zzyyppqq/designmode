package com.zyp.designmode.chain;

public class Test {
    public static void main(String[] args) {

        AbstractLogger chainOfLoggers = getChainOfLoggers();

        chainOfLoggers.logMessage(AbstractLogger.INFO,"info msg");
        System.out.println();
        chainOfLoggers.logMessage(AbstractLogger.DEBUG,"debug msg");
        System.out.println();
        chainOfLoggers.logMessage(AbstractLogger.ERROR,"error msg");



    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
