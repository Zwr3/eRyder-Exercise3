public class ERyder {
    // 电动自行车共享服务类，严格按要求命名ERyder
    // 1. 定义4个私有成员变量，封装属性
    private String bikeID; // 车辆唯一ID，用String更灵活（数字/字母组合）
    private int batteryLevel; // 电池百分比，int类型（0-100）
    private boolean isAvailable; // 是否可用，布尔类型
    private double kmDriven; // 行驶公里数，double支持小数（如12.5km）

    // 2. 无参默认构造方法（作业要求）
    public ERyder() {
        // 可默认赋值（也可空，Java会自动赋默认值：String=null/int=0/boolean=false/double=0.0）
        this.bikeID = "default-001";
        this.batteryLevel = 0;
        this.isAvailable = false;
        this.kmDriven = 0.0;
    }

    // 3. 全参构造方法（初始化所有变量，作业要求）
    public ERyder(String bikeID, int batteryLevel, boolean isAvailable, double kmDriven) {
        this.bikeID = bikeID;
        // 调用带校验的setter，避免全参构造传入非法电池值
        this.setBatteryLevel(batteryLevel);
        this.isAvailable = isAvailable;
        this.kmDriven = kmDriven;
    }

    // 4. ride()方法：校验电池和可用状态，打印结果（作业要求）
    public void ride() {
        // 条件：电池>0（有电）且车辆可用
        if (this.batteryLevel > 0 && this.isAvailable) {
            System.out.println("The bike is available for riding.");
        } else {
            System.out.println("The bike is not available for riding.");
        }
    }

    // 5. printBikeDetails()方法：打印所有车辆信息（作业要求）
    public void printBikeDetails() {
        System.out.println("===== Bike Details =====");
        System.out.println("Bike ID: " + this.bikeID);
        System.out.println("Battery Level: " + this.batteryLevel + "%");
        System.out.println("Is Available: " + (this.isAvailable ? "Yes" : "No"));
        System.out.println("Total KM Driven: " + this.kmDriven + " km");
        System.out.println("========================");
    }

    // 6. 带范围校验的batteryLevel setter（作业核心要求，必须写）
    public void setBatteryLevel(int batteryLevel) {
        // 仅允许0-100的数值，超出则赋值为0（也可加提示语句）
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Invalid battery level! Must be 0-100. Set to 0 by default.");
            this.batteryLevel = 0;
        }
    }

    // 7. 所有变量的getter方法（作业要求，按需获取属性值）
    public String getBikeID() {
        return bikeID;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getKmDriven() {
        return kmDriven;
    }
}
