
class Payment{
    void Topay(int amount){
        System.out.println("payment via netbanking: " + amount);
    }
}
class Atm extends Payment{
    void Topay(int amount){
        System.out.println("payment via atm: " + amount);
    }
}
class upi extends Payment{
    void Topay(int amount){
        System.out.println("payment via upi: " + amount);
    }
}
public class PaymentProcessing{
    public static void main(String[] args) {
        Payment ac = new Payment();
        ac.Topay(3000);
        Payment ref = new Payment();
        ref.Topay(30000);
        Payment obj = new Payment();
        obj.Topay(877854);
        
    }
}
