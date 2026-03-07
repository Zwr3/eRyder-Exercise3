public class Main {
    // 独立的Main类，包含程序入口main()方法（作业要求）
    public static void main(String[] args) {
        // 1. 用默认构造创建对象，直接调用printBikeDetails()
        ERyder bike1 = new ERyder();
        System.out.println("--- Bike 1 (Default Constructor) ---");
        bike1.printBikeDetails();

        // 2. 用全参构造创建对象，先调用ride()，再调用printBikeDetails()
        // 示例参数：ID=EB-2026，电池80%，可用=true，行驶156.8km（可自行修改）
        ERyder bike2 = new ERyder("EB-2026", 80, true, 156.8);
        System.out.println("\n--- Bike 2 (Parameterized Constructor) ---");
        bike2.ride(); // 先调用骑行方法
        bike2.printBikeDetails(); // 再打印详情

        // 可选：测试电池setter的校验功能（如设置120，会提示并赋0）
        // bike2.setBatteryLevel(120);
        // bike2.printBikeDetails();
    }
}
