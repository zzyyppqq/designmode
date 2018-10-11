package com.zyp.designmode.chain;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("ConsoleLogger : "+ message);
    }
}
