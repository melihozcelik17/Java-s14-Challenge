package com.workintech.burger;

public class Addition {
    private String additionName;
    private double additionPrice;

    public Addition(String additionName, double additionPrice) {
        additionName = additionName;
        additionPrice = additionPrice;
    }

    public String getAdditionName() {
        return additionName;
    }

    public double getAdditionPrice() {
        return additionPrice;
    }

    public void setAdditionName(String additionName) {
        additionName = additionName;
    }

    public void setAdditionPrice(double additionPrice) {
        additionPrice = additionPrice;
    }
}
