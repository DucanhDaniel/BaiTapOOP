package Slide8.Ex6;

public class ElectronicDevice extends Goods implements GoodsInterface {
    private String warrantyPeriod;
    private double voltage;
    private double wattage;
    public ElectronicDevice(){}
    public ElectronicDevice(
            String productName,
            String id,
            String producerName,
            double price,
            String warrantyPeriod,
            double voltage,
            double wattage
    ) {
        super(productName, id, producerName, price);
        this.warrantyPeriod = warrantyPeriod;
        this.voltage = voltage;
        this.wattage = wattage;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
    public double getVoltage() {
        return voltage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }
    public double getWattage() {
        return wattage;
    }

    @Override
    public double calculateTax(int amount, double totalDiscount) {
        return super.getPrice()*amount*(1 - totalDiscount/100);
    }

    @Override
    public void showInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Product type: Electronic device");
        super.showInfo();
        System.out.println("Warranty period: " + warrantyPeriod);
        System.out.println("Voltage: " + voltage + "V");
        System.out.println("Wattage: " + wattage + "W");
        System.out.println("----------------------------------------");
    }

}
