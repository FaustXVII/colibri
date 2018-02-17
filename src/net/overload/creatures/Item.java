package net.overload.creatures;

public abstract class Item {
    private int wieght;
    private String discription;
    private int amount;

    public int getWieght() {
        return wieght;
    }

    public void setWieght(int wieght) {
        this.wieght = wieght;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
