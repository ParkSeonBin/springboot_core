package com.hello.core.singleton;

public class StatefulService {
    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        return price;
    }

    /* 이렇게 하면 상태를 유지하기 때문에 ㅁㅐ우 위험
    private int price; //상태를 유지하는 필드
    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price; //여기가 문제!
    }
    public int getPrice() {
        return price;
    } */
}
