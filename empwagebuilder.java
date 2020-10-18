//employee daily wage calculator
import java.util.Random;
public class empwagebuilder {

	public static void main(String[] args) {
	int full_time=1; int emp_rate_per_hr=20; //constants
	int emphrs=0; int empwage=0;	//variables
	Random randnum = new Random(); //random class instance
	int empcheck = randnum.nextInt(2);
	
	if (empcheck == full_time) {
		System.out.println("Employee is Present");
		emphrs=8; }
	else {
		System.out.println("Employee is absent");
		emphrs=0; }
	empwage = emphrs*emp_rate_per_hr;
	System.out.println("Employee daily wage: " + empwage);
	}
}
