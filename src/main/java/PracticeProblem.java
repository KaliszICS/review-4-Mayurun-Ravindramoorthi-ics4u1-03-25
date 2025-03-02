import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num = in.nextInt();
		String num1 = String.valueOf("5"+num);
		int num2 = Integer.parseInt(num1);
		System.out.println(num2+5);
		
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: " );
		String num = in.nextLine();
		String num1 = "4"+ num +"3";
		Double num3 = Double.parseDouble(num1);
		num3 += 3.4;
		System.out.println(num3); 



	}

	public static void q3() {
		//Write question 3 code here
		Scanner In = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		Boolean bool = In.nextBoolean();
		System.out.println(!bool);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner big = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = big.nextLine();
		String num1 = num +"3";
		int num2 = Integer.parseInt(num1);
		num2 += 2;
		System.out.println((char)num2);


	}

	public static void q5() {
		//Write question 5 code here
		Scanner bu = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = bu.nextLine();
		String num1 = num +"1";
		int num2 = Integer.parseInt(num1);
		num2 /= 2;
		System.out.println(Double.valueOf(num2));
		


	}

	public static void q6() {
		//Write question 6 code here
		Scanner bud = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num = bud.nextLine();
		String num2 = "1" + num;
		double num3 = Double.parseDouble(num2);
		System.out.println( (int)(num3));
	}

}
