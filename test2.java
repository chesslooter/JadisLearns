package test;

public class test2 { //The name of the file
	
	private int power=3; //Could have this be whatever, or even scan for user input.
	
	public  test2() {} //More important if you're using this object to store data, versus having functions.
		
	public int powerMe(int base){ //The function call for powerMe. Used in the main as subFunctionTester.powerMe(int).
			return (int) Math.pow( base,  power); //What the subFunction returns
		}
	
	public void setPower(int newPower) {//Function changes the value to whatever is passed in 
		power=newPower;
		return;
	}
}
