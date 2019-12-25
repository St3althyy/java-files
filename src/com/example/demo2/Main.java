package com.example.demo2;

interface Sumable{
    int sum(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        Sumable sumable = (x, y) -> x + y;

        System.out.println(sumable.sum(12, 14));
    }
}
