package com.zyp.designmode.chain;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("FileLogger : "+ message);
    }
}
