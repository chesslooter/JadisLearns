package test;

//This is a comment. They all start with two slashes.

public class test { //Basically saying the file name
	public static void main(String[]args){ //Saying that this is the main class
		test2 subFunctionTester = new test2(); //This is a java thing, saying hey, here's another function that we can use, and we should call it subFunctionTester.
		int base=3;
		
		int result = subFunctionTester.powerMe(base); //Calls the function powerMe in test2
		System.out.println(result); //Prints  out the value of result
		subFunctionTester.setPower(6); //Calls the function setPower in test2
		result=subFunctionTester.powerMe(base); //Calls powerMe again.
		System.out.println(result); //Prints result.
	}
}
