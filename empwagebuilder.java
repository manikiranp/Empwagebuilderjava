//employee part time
import java.util.Random;
public class empwagebuilder {

	public static void main(String[] args) {
	int full_time=2;	//constants
	int part_time=1;
	int emp_rate_per_hr=20;
	int emphrs=0;	//variables
	int empwage=0;
	Random randnum = new Random(); //random class instance
	int empcheck = randnum.nextInt(3);
	
	if (empcheck == full_time) {
		System.out.println("Employee is Present");
		emphrs=8; }
	else if (empcheck == part_time) {
		System.out.println("Employee is present part-time");
		emphrs=4; }
	else {
		System.out.println("Employee is absent");
		emphrs=0; }
	empwage = emphrs*emp_rate_per_hr;
	System.out.println("Employee daily wage: " + empwage);
	}
}
