
abstract class Salary{
	abstract void calculatesalary();
	
}
class display extends Salary{
	public void calculatesalary() {
		System.out.println("total sal:"+200);
	}
	
}
public class AbstractionMain {
       public static void main(String[] args) {
       display d=new display();
       d.calculatesalary();
       }
}