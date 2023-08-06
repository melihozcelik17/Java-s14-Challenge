package com.workintech.burger;

public class Hamburger implements Addable {
    private String name;
    private String meat;
    private BreadRollType breadRollType;
    private double price;

    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;


    public Hamburger(String name, double price, BreadRollType breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = "normal";
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    @Override
    public void addAddition(String additionName, double price) {
        if (addition1 == null) {
            this.addition1 = new Addition(additionName, price);
        } else if (addition2 == null) {
            this.addition2 = new Addition(additionName, price);
        } else if (addition3 == null) {
            this.addition3 = new Addition(additionName, price);
        } else if (addition4 == null) {
            this.addition4 = new Addition(additionName, price);
        } else {
            System.out.println("Burger is full");
        }
    }


//    public void addHamburgerAddition1(String addition,double price) {
//        this.addition1Name = addition;
//        this.addition1Price=price;
//    }
//    public void addHamburgerAddition2(String addition,double price) {
//        this.addition2Name = addition;
//        this.addition2Price=price;
//    }
//    public void addHamburgerAddition3(String addition,double price) {
//        this.addition3Name = addition;
//        this.addition3Price=price;
//    }
//    public void addHamburgerAddition4(String addition,double price) {
//        this.addition4Name = addition;
//        this.addition4Price=price;
//    }

        public String itemize () {
            StringBuilder builder = new StringBuilder();
            builder.append("Name" + name + "\n");
            builder.append("Meat" + meat + "\n");
            builder.append("BreadRollType" + breadRollType + "\n");


            if (addition1 != null) {
                builder.append("addition1" + addition1);
                price = price + addition1.getAdditionPrice();
            }
            if (addition2 != null) {
                builder.append("addition2" + addition2);
                price = price + addition2.getAdditionPrice();
            }
            if (addition3 != null) {
                builder.append("addition3" + addition3);
                price = price + addition3.getAdditionPrice();
            }
            if (addition4 != null) {
                builder.append("addition4" + addition4);
                price = price + addition4.getAdditionPrice();
            }
            return builder.toString();
        }
        public double itemizeHamburger () {
            String explanation = itemize();
            System.out.println(explanation);
            System.out.println("Price" + getPrice());
            System.out.println("-------------");
            return getPrice();
        }



    }

