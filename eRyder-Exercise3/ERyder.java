public class ERyder {
    public static final String COMPANY_NAME = "ERyder";
    public static final double BASE_FARE = 1.0;
    public static final double PER_MINUTE_FARE = 0.5;

    private final String LINKED_ACCOUNT;
    private final String LINKED_PHONE_NUMBER;

    private String bikeID;
    private int batteryLevel;
    private boolean isAvailable;
    private double kmDriven;
    private int totalUsageInMinutes;
    private double totalFare;

    public ERyder() {
        this.bikeID = "101";
        this.batteryLevel = 80;
        this.isAvailable = true;
        this.kmDriven = 0.0;
        this.LINKED_ACCOUNT = "default";
        this.LINKED_PHONE_NUMBER = "0000000000";
    }
    public ERyder(String bikeID, int batteryLevel, boolean isAvailable, double kmDriven) {
        this.bikeID = bikeID;
        this.batteryLevel = batteryLevel;
        this.isAvailable = isAvailable;
        this.kmDriven = kmDriven;
        this.LINKED_ACCOUNT = "default";
        this.LINKED_PHONE_NUMBER = "0000000000";
    }
    public ERyder(String bikeID, int batteryLevel, boolean isAvailable, double kmDriven,
                  String linkedAccount, String linkedPhoneNumber) {
        this.bikeID = bikeID;
        this.batteryLevel = batteryLevel;
        this.isAvailable = isAvailable;
        this.kmDriven = kmDriven;
        this.LINKED_ACCOUNT = linkedAccount;
        this.LINKED_PHONE_NUMBER = linkedPhoneNumber;
    }

    public void ride() {
        this.totalUsageInMinutes = 10;
        this.totalFare = calculateFare(this.totalUsageInMinutes);
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setKmDriven(double kmDriven) {
        this.kmDriven = kmDriven;
    }

    public void printBikeDetails() {
        System.out.println("Ride Details:");
        System.out.println("Company: " + COMPANY_NAME);
        System.out.println("Bike ID: " + bikeID);
        System.out.println("Linked Account: " + LINKED_ACCOUNT);
        System.out.println("Ride time (minutes): " + totalUsageInMinutes);
        System.out.println("Total fare: " + totalFare);
        System.out.println();
    }

    private double calculateFare(int usageInMinutes) {
        return BASE_FARE + PER_MINUTE_FARE * usageInMinutes;
    }
}