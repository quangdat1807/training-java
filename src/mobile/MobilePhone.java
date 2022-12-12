package mobile;

public class MobilePhone {
    private String Model;
    private String Manufacture;
    private int Price;
    private String Owner;
    private String Battery;
    private String Display;

    public MobilePhone(String model, String manufacture, int price, String owner, String battery, String display) {
        Model = model;
        Manufacture = manufacture;
        Price = price;
        Owner = owner;
        Battery = battery;
        Display = display;
    }

    public MobilePhone() {
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String battery) {
        Battery = battery;
    }

    public String getDisplay() {
        return Display;
    }

    public void setDisplay(String display) {
        Display = display;
    }
}
