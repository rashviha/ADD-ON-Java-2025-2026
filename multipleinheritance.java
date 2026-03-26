interface FuelCar{
    abstract void Type();
}
interface ElectricCar{
    abstract void Type();
}
class HybridCar implements FuelCar,ElectricCar{
     public void Type() {
        System.out.println("Hybrid");
    }
     public void FType() {
        System.out.println("per km");
    }
    public void EType() {
        System.out.println("per hour - km");
    }
}
public class multipleinheritance {
    public static void main(String[] args) {
        HybridCar car=new HybridCar();
        car.FType();
        car.EType();
    }

   
}