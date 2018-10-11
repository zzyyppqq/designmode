package com.zyp.designmode.iterator;

public class Test {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator<String> iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("name: "+next);
        }
    }
}
