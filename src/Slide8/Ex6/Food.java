package Slide8.Ex6;

public class Food extends Goods implements GoodsInterface {
    private String dateOfManufacture;
    private String expirationDate;
    public Food(){}
    public Food(
            String productName,
            String id,
            String producerName,
            double price,
            String dateOfManufacture,
            String expirationDate
    ) {
        super(productName, id, producerName, price);
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
    }

    public void setDateOfManufacture(String dateOfManufacture, String expirationDate) {
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
    }
    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }
    public String getDateOfManufacture() {
        return dateOfManufacture;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    public String getExpirationDate() {
        return expirationDate;
    }

    public double calculateTax(int amount, double totalDiscount) {
        return super.getPrice()*amount*(1 - totalDiscount/100);
    }

    public void showInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Product type: Food");
        super.showInfo();
        System.out.println("Date of manufacture: " + dateOfManufacture);
        System.out.println("Expiration date: " + expirationDate);
        System.out.println("----------------------------------------");
    }

}
