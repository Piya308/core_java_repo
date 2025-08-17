package org.generics;

public class GenericException {

    public static void main(String[] args) {
        try {
            throw new DataException(123);
        } catch (DataException e) {
            System.out.println("Caught: " + e.getData());
        }

        try {
            throw new DataException("hello");
        } catch (DataException e) {
            System.out.println("Caught: " + e.getData());
        }
    }
}

 class DataException extends Exception {
    private Object data;

    public <T> DataException(T data) {
        super("Exception with data: " + data);
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
