package com.galvanize;

//class BankAccount {
//
//    private long balance = 0;
//
//    void deposit(long cents) {
//        balance += cents;
//    }
//
//    void withdraw(long cents) {
//        balance -= cents;
//    }
//
//    private long balance() {
//        return balance;
//    }
//
//    private boolean isOverDrawn() {
//        if (balance < 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "BankAccount{" +
//                "balance=" + balance +
//                '}';
//    }
//}

//public class Picture {
//    private boolean framed;
//    private int height;
//    private int width;
//
//    Picture(int height, int width) {
//        this(false, height, width);
//    }
//
//    Picture(boolean framed, int height, int width) {
//        this.framed = framed;
//        this.height = height;
//        this.width = width;
//    }
//}

public class Application {

    public static void main(String[] args) {

        for (int i = 2; i <= 6 ; i+=2) {
            System.out.println(i);
        }

    }
}
