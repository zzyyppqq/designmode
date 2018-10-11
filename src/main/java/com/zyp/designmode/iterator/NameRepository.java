package com.zyp.designmode.iterator;

public class NameRepository implements Container {

    private String names[] = {"aaa", "bbb", "ccc"};


    public Iterator getIterator() {
        return new NameIterator();
    }


    class NameIterator implements Iterator<String> {
        private int index;

        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        public String next() {
            if (this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
