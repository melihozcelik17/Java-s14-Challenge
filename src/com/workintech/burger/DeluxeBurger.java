package com.workintech.burger;

public class DeluxeBurger extends Hamburger {
    private String drink;
    private String cips;


    public DeluxeBurger() {
        super("DeluxBurger", 19.1, BreadRollType.DOUBLE_BURGER);
        super.setMeat("Double");

    }

    @Override
    public void addAddition(String additionName, double price) {
        System.out.println("Deluxe burger ek malzeme alamaz");
    }
}

    //    @Override
//    public void addHamburgerAddition1(String addition, double price) {
//        super.addHamburgerAddition1(addition, price);
//        System.out.println("Deluxe burger ek malzeme alamaz");
//    }
//
//    @Override
//    public void addHamburgerAddition2(String addition, double price) {
//        super.addHamburgerAddition2(addition, price);
//        System.out.println("Deluxe burger ek malzeme alamaz");
//    }
//
//    @Override
//    public void addHamburgerAddition3(String addition, double price) {
//        super.addHamburgerAddition3(addition, price);
//        System.out.println("Deluxe burger ek malzeme alamaz");
//    }
//
//    @Override
//    public void addHamburgerAddition4(String addition, double price) {
//        super.addHamburgerAddition4(addition, price);
//        System.out.println("Deluxe burger ek malzeme alamaz");
//    }

