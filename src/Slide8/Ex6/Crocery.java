package Slide8.Ex6;

public class Crocery extends Goods implements GoodsInterface {
    String rawMaterialType;
    Crocery(){}
    Crocery(
            String productName,
            String id,
            String producerName,
            double price,
            String rawMaterialType
    ) {
        super(productName, id, producerName, price);
        this.rawMaterialType = rawMaterialType;
    }

    public void setrawMaterialType(String rawMaterialType) {
        this.rawMaterialType = rawMaterialType;
    }
    public String getrawMaterialType() {
        return rawMaterialType;
    }

    public double calculateTax(int amount, double totalDiscount) {
        return super.getPrice()*amount*(1 - totalDiscount/100);
    }
    public void showInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Product type: Crocery");
        super.showInfo();
        System.out.println("Raw material type: " + rawMaterialType);
        System.out.println("----------------------------------------");
    }
}
