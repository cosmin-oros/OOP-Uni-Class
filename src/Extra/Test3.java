package Extra;

class WorkOrder1 {
    public CarInfo carInfo;
    public CustomerInfo customerInfo;
    public OrderDetails orderDetails;

    public WorkOrder1(CarInfo carInfo, CustomerInfo customerInfo, OrderDetails orderDetails) {
        this.carInfo = carInfo;
        this.customerInfo = customerInfo;
        this.orderDetails = orderDetails;
    }
}

class CarInfo {
    public String licensePlate = "";
    public String model = "";
    public String VIN = "";
    public String MOTExpDate = "";
    public String prevMileage = "";
    public String warrantyEndDate = "";

    public CarInfo(String licensePlate, String model, String VIN, String MOTExpDate, String prevMileage, String warrantyEndDate) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.MOTExpDate = MOTExpDate;
        this.prevMileage = prevMileage;
        this.VIN = VIN;
        this.warrantyEndDate = warrantyEndDate;
    }
}

class CustomerInfo {
    public int age;
    public String name;
    public String address;
    public String phoneNr;

    public CustomerInfo(int age, String name, String address, String phoneNr) {
        this.address = address;
        this.age = age;
        this.name = name;
        this.phoneNr = phoneNr;
    }
}

class OrderDetails {

}

public class Test3 {
    public static void main(String[] args) {

    }
}
