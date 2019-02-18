package empSalaryC;

import java.util.Scanner;
public class DemoProjectC {
	public static void main(String[] args){
		int id,salary, sales;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter data Employee : ");
		id = input.nextInt();
		name = input.next();
		salary = input.nextInt();
		sales = input.nextInt();
		inputProjectC in = new inputProjectC(id,name,salary,sales);
		processProjectC cess = new processProjectC(in);
		outputProjectC out = new outputProjectC(in,cess);
	}
}