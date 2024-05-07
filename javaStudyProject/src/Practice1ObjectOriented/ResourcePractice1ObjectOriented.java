package Practice1ObjectOriented;

public class ResourcePractice1ObjectOriented {
    private String id;
    private String name;
    private String price;
    private String inventory;

    public ResourcePractice1ObjectOriented() {}
    public ResourcePractice1ObjectOriented(String id, String name, String price, String inventory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }
}
