public class BillingSystem {
    public static void main(String[] args) {
        double waterUsage = 120.0;
        double ratePerUnit = 5.0;
        double bill = waterUsage * ratePerUnit;

        System.out.println("Water Billing System");
        System.out.println("Water Usage: " + waterUsage + " units");
        System.out.println("Total Bill: Rs." + bill);
    }
}