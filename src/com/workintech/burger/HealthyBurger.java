package com.workintech.burger;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, price, breadRollType);
        setMeat("Tofu");

    }

    @Override
    public double itemizeHamburger() {
        String explanation = super.itemize();
        System.out.println(explanation);
        
        StringBuilder builder=new StringBuilder();
        if(healthyExtra1Name != null){
            builder.append("HealtyAddition1" + healthyExtra1Name + "\n");
        }
        if(healthyExtra2Name != null){
            builder.append("HealtyAddition2" + healthyExtra2Name + "\n");
        }
        
        return super.itemizeHamburger();
    }

    public void addHealthyAddition1(String lentils, double v) {
    }
}
    
    
    
