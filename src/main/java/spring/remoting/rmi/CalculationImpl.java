package spring.remoting.rmi;

import spring.remoting.data.Result;

public class CalculationImpl implements Calculation {

	public Result cube(int number) {
		System.out.println("call from client with argument : " + number);
		
		Result result =  new Result();
		
		result.setName("test");
		result.setResult(number * number * number);
		
		return result;
	}

}
