//employee part time
import java.util.Random;
public class empwagebuilder {
	public static final int full_time=2;
	public static final int part_time=1;
	public static final int emp_rate_per_hr=20;
public static void main(String[] args) {
	int emphrs=0;	//variables
	int empwage=0;
	Random randnum = new Random(); //random class instance
	int empcheck = randnum.nextInt(3);
	switch (empcheck) {
		case full_time:
		System.out.println("Employee is Present");
		emphrs=8;
		break;
		case part_time:
		System.out.println("Employee is present part-time");
		emphrs=4;
		break;
		default:
		System.out.println("Employee is absent");
		emphrs=0; }
	empwage = emphrs*emp_rate_per_hr;
	System.out.println("Employee daily wage: " + empwage);
	}
}
