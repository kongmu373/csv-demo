package com.kongmu373.csvdemo;

public class Order {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    @Override
    public String toString() {
        return "Order{" +
                       "a=" + a +
                       ", b=" + b +
                       ", c=" + c +
                       ", d=" + d +
                       ", e=" + e +
                       '}';
    }

    public Order(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }
}
