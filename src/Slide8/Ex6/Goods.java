package Slide8.Ex6;

abstract public class Goods implements GoodsInterface{
    private String productName, id, producerName;
    private double price;

    Goods(){}
    Goods(String productName, String id, String producerName, double price) {
        this.productName = productName;
        this.id = id;
        this.producerName = producerName;
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }
    public String getProducerName() {
        return producerName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void showInfo() {
        System.out.println("Product name: " + productName);
        System.out.println("ID: " + id);
        System.out.println("Producer name: " + producerName);
        System.out.println("Price: " + price);
    }
    abstract public double calculateTax(int amount, double totalDiscount);

    public void getProductType(Goods product) {
        if (product instanceof ElectronicDevice) {
            System.out.println("Product type: Electronic device");
        }
        if (product instanceof Crocery) {
            System.out.println("Product type: Crocery");
        }
        if (product instanceof Food) {
            System.out.println("Product type: Food");
        }
    }
}
