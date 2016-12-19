package spring.remoting.rmi;

public class CalculationImpl implements Calculation {

	public int cube(int number) {
		System.out.println("call from client with argument : " + number);
		return number * number * number;
	}

}
