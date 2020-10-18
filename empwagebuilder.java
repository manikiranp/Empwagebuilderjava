import java.util.Random;
public class empwagebuilder {

        public static void main(String[] args) {
	System.out.println("Welcome to Employee wage builder program in Java");
	int full_time=1;
	Random randnum = new Random(); //random class instance
	int empcheck = randnum.nextInt(2);
	if(empcheck==full_time)
		System.out.println("Employee is Present");
	else
		System.out.println("Employee is absent");
	}
}
