package lv.akurss.lesson10.lecture._1_lambda;

public class LambdaExercises {

	public static void main(String[] args) {
		
		DoWithNoArgs doWithNoArgs = new DoWithNoArgs() {
			@Override
			public String doSmth() {
				return "Hello";
			}
		};

		DoWithNoArgs doWithNoArgsLambda = () -> "Hello";

		System.out.println(doWithNoArgs.doSmth());
		System.out.println(doWithNoArgsLambda.doSmth());
		
		
		DoWithOneArg doWithOneArg = new DoWithOneArg() {
			@Override
			public String doSmth(String one) {
				return one + "Test";
			}
		};

		DoWithOneArg doWithOneArgLambda = one -> one + "Test";

		System.out.println(doWithOneArg.doSmth("Hello, "));
		System.out.println(doWithOneArgLambda.doSmth("Hello, "));
		
		DoWithTwoArgs doWithTwoArgs = (one, two) -> one + two + "Test";
		DoWithTwoArgs doWithTwoArgs2 = (one, two) -> one + two + "TestTest";
		DoWithTwoArgs doWithTwoArgs3 = (one, two) -> one + two;

		System.out.println(doWithTwoArgs.doSmth("Hello ", "Big "));
	}
	
	
}
