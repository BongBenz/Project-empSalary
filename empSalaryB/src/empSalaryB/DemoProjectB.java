package empSalaryB;

import java.util.Scanner;
public class DemoProjectB {
	public static void main(String[] args){
		int id,salary, sales;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter data Employee : ");
		id = input.nextInt();
		name = input.next();
		salary = input.nextInt();
		sales = input.nextInt();
		inputProjectB in = new inputProjectB(id,name,salary,sales);
		processProjectB cess = new processProjectB(in);
		outputProjectB out = new outputProjectB(in,cess);
	}
}