import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestDataGenerator {

    private static final String[] SAMPLE_PRODUCT_NAMES = {
        "Laptop", "Smartphone", "Tablet", "Headphones", "Smartwatch"
    };

    private static final String[] SAMPLE_SELLER_NAMES = {
        "TechStore", "GadgetWorld", "ElectroShop", "MobileHub", "DeviceDepot"
    };

    private static final Random RANDOM = new Random();

    public static List<String> generateSampleProducts(int count) {
        List<String> products = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String productName = SAMPLE_PRODUCT_NAMES[RANDOM.nextInt(SAMPLE_PRODUCT_NAMES.length)];
            products.add(productName + " " + (i + 1));
        }
        return products;
    }

    public static List<String> generateSampleSellers(int count) {
        List<String> sellers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String sellerName = SAMPLE_SELLER_NAMES[RANDOM.nextInt(SAMPLE_SELLER_NAMES.length)];
            sellers.add(sellerName + " " + (i + 1));
        }
        return sellers;
    }

    public static void main(String[] args) {
        List<String> sampleProducts = generateSampleProducts(5);
        List<String> sampleSellers = generateSampleSellers(5);

        System.out.println("Sample Products: " + sampleProducts);
        System.out.println("Sample Sellers: " + sampleSellers);
    }
}