import java.util.Random;
public class empwagebuilder {
	public static final int full_time=2;
	public static final int part_time=1;
	public static final int emp_rate_per_hr=20;
	public static final int num_work_days=20;
	public static final int max_hrs_in_month=100;
public static void main(String[] args) {
	//variables
	int emphrs=0, empwage=0, totalempwage=0, totalemphrs=0, totalworkdays=0;
	Random randnum = new Random(); //random class instance
	while (totalemphrs <= max_hrs_in_month && totalworkdays < num_work_days) {
	int empcheck = randnum.nextInt(3);
	totalworkdays++;
	switch (empcheck) {
		case full_time:
			emphrs=8;
			System.out.println("Employee is present fulltime:");
			break;
		case part_time:
			emphrs=4;
			System.out.println("Employee is present part-time:");
			break;
		default:
			emphrs=0;
			System.out.println("Employee is Absent:");
			 }
	totalemphrs += emphrs;
	empwage = emphrs*emp_rate_per_hr;
	totalempwage += empwage;
	System.out.println("Day"+totalworkdays+" wage: " + empwage);
	 }
	System.out.println("\nTotal working hours: " + totalemphrs );
	System.out.println("Total employee monthly wage: " + totalempwage);
	}
}
