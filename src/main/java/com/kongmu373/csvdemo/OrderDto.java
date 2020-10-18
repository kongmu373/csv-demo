package com.kongmu373.csvdemo;

import java.util.ArrayList;

public class OrderDto {
    private ArrayList<Integer> as = new ArrayList<>();
    private ArrayList<Integer> bs = new ArrayList<>();
    private ArrayList<Integer> cs = new ArrayList<>();
    private ArrayList<Integer> ds = new ArrayList<>();
    private ArrayList<Integer> es = new ArrayList<>();


    @Override
    public String toString() {
        return "OrderDto{" +
                       "as=" + as +
                       ", bs=" + bs +
                       ", cs=" + cs +
                       ", ds=" + ds +
                       ", es=" + es +
                       '}';
    }

    public ArrayList<Integer> getAs() {
        return as;
    }

    public void setAs(ArrayList<Integer> as) {
        this.as = as;
    }

    public ArrayList<Integer> getBs() {
        return bs;
    }

    public void setBs(ArrayList<Integer> bs) {
        this.bs = bs;
    }

    public ArrayList<Integer> getCs() {
        return cs;
    }

    public void setCs(ArrayList<Integer> cs) {
        this.cs = cs;
    }

    public ArrayList<Integer> getDs() {
        return ds;
    }

    public void setDs(ArrayList<Integer> ds) {
        this.ds = ds;
    }

    public ArrayList<Integer> getEs() {
        return es;
    }

    public void setEs(ArrayList<Integer> es) {
        this.es = es;
    }
}
