package Practice2ObjectOriented;

public class ResourcePractice2ObjectOriented {
    private String brand;
    private String price;
    private String color;

    public ResourcePractice2ObjectOriented() {}

    public ResourcePractice2ObjectOriented(String brand, String price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
