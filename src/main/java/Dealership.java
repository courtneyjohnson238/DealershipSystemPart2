import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;
    public List<Vehicle> getAllVehicles(){

        return inventory;
    }
    public List<Vehicle> getVehiclesByPrice(double min, double max){
        return null;
    }
    public List<Vehicle> getVehiclesByMakeModel(String make, String model ){
        return null;
    }
    public List<Vehicle> getVehiclesByYear(int min, int max ){

        return null;
    }
    public List<Vehicle> getVehicleByColor(String color) {
        return null;
    }
    public List<Vehicle> getVehicleByMileage(int min, int max) {
        return null;
    }
    public List<Vehicle> getVehicleByType(String vehicleType) {
        return null;
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);

    }
    public void removeVehicles(Vehicle vehicle){

    }
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>();

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
