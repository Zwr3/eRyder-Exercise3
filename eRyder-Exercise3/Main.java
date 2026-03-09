public class Main {
    public static void main(String[] args) {
        ERyder bike1 = new ERyder();
        System.out.println("--- Bike 1 (Default Constructor) ---");
        bike1.printBikeDetails();
        ERyder bike2 = new ERyder("EB-2026", 80, true, 156.8);
        System.out.println("\n--- Bike 2 (Parameterized Constructor) ---");
        bike2.ride(); 
        bike2.printBikeDetails(); 
    }
}
