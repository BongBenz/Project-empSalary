package empSalaryA;

import java.util.Scanner;
public class DemoProjectA {
	public static void main(String[] args){
		int id,salary, sales;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter data Employee : ");
		id = input.nextInt();
		name = input.next();
		salary = input.nextInt();
		sales = input.nextInt();
		inputProjectA in = new inputProjectA(id,name,salary,sales);
		processProjectA cess = new processProjectA(in);
		outputProjectA out = new outputProjectA(in,cess);
	}
}