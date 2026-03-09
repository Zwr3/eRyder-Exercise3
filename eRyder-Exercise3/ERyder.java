public class ERyder {
    private String bikeID;
    private int batteryLevel;
    private boolean isAvailable;
    private double kmDriven;

    public ERyder() {
        bikeID = "default-001";
        batteryLevel = 0;
        isAvailable = false;
        kmDriven = 0.0;
    }

    public ERyder(String bikeID, int batteryLevel, boolean isAvailable, double kmDriven) {
        this.bikeID = bikeID;
        this.setBatteryLevel(batteryLevel);
        this.isAvailable = isAvailable;
        this.kmDriven = kmDriven;
    }

    public void ride() {
        boolean canRide = batteryLevel > 0 && isAvailable;
        if (canRide) {
            System.out.println("The bike is available for riding.");
        } else {
            System.out.println("The bike is not available for riding.");
        }
    }

    public void printBikeDetails() {
        System.out.println("===== Bike Details =====");
        System.out.println("Bike ID: " + bikeID);
        System.out.println("Battery Level: " + batteryLevel + "%");
        String availableText = isAvailable ? "Yes" : "No";
        System.out.println("Is Available: " + availableText);
        System.out.println("Total KM Driven: " + this.kmDriven + " km");
        System.out.println("========================");
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Invalid battery level! Must be 0-100. Set to 0 by default.");
            this.batteryLevel = 0;
        }
    }

    public String getBikeID() {
        return bikeID;
    }

    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(double kmDriven) {
        this.kmDriven = kmDriven;
    }
}