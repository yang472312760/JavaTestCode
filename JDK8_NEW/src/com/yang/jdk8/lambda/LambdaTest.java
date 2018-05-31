package com.yang.jdk8.lambda;

public class LambdaTest {

	public static void main(String[] args) {

		LambdaTest test = new LambdaTest();
		// 类型声明
		MathOperation operation1 = (int a, int b) -> a + b;
		// 不用类型声明
		MathOperation operation2 = (a, b) -> a - b;
		// 大括号中的返回语句
		MathOperation operation3 = (int a, int b) -> {
			return a * b;
		};
		// 没有大括号及返回语句
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + test.operate(10, 5, operation1));
		System.out.println("10 - 5 = " + test.operate(10, 5, operation2));
		System.out.println("10 * 5 = " + test.operate(10, 5, operation3));
		System.out.println("10 / 5 = " + test.operate(10, 5, division));

		// 不用括号
		GreetingService greetService1 = message -> System.out.println("Hello " + message);

		// 用括号
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

		greetService1.sayMessage("Runoob");
		greetService2.sayMessage("Google");

	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

}
