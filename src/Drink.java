public enum Drink {

    COCACOLA("Coke", 1.50),
    PEPSI("Pepsi", 1.45),
    Fanta("Fanta", 1.30),
    WATER("Water", 1.00);


    private     String mymessage;
    public String getMymessage() {
        return mymessage;
    }
    private String name;
    private double price;
     Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


