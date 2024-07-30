package Slide8.Ex6;

public class Entry {
    public static void main(String[] args) {
        Goods electronicsDevice = new ElectronicDevice(
                "Samsung Galaxy S20",
                "100102321",
                "Samsung",
                1000000,
                "1 year",
                20,
                20
        );
        Goods crocery = new Crocery(
                "Porcelain plate",
                "200102981",
                "BatTrang village",
                1000,
                "Porcelain"
        );
        Goods food = new Food(
                "Spicy noodles",
                "300103001",
                "AceCook",
                100,
                "12/03/2022",
                "12/03/2025"
        );
        electronicsDevice.showInfo();
        crocery.showInfo();
        food.showInfo();

    }
}
