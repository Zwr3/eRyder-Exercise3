public class Main {
    public static void main(String[] args) {
        ERyder bike1 = new ERyder();
        System.out.println("Testing bike1:");
        bike1.ride();
        bike1.printBikeDetails();
        System.out.println();

        ERyder bike2 = new ERyder("EB-2026", 85, true, 120.5);
        System.out.println("Testing bike2:");
        bike2.ride();
        bike2.printBikeDetails();
        System.out.println();

        ERyder bike3 = new ERyder("EB-9999", 150, false, 50.0);
        System.out.println("Testing bike3 before change:");
        bike3.ride();
        
        bike3.setBatteryLevel(70);
        bike3.setAvailable(true);
        bike3.setKmDriven(60.8);
        
        System.out.println("Testing bike3 after change:");
        bike3.ride();
        bike3.printBikeDetails();
    }
}