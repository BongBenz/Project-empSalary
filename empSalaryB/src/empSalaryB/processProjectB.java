package empSalaryB;

public class processProjectB {
	private int sum;
	public processProjectB() {
		
	}
	public processProjectB(inputProjectB in) {
		int sum = 0;
		if(in.getSalary() < 50000){
			sum = (int)(0.05*in.getSalary());
			sum = sum + in.getSalary();
		}
		else {
			sum = (int)((0.10)*in.getSalary());
			sum = sum + in.getSalary();
		}
		this.sum = sum;
		//--project B--//
		if(this.sum < 20000) {
			this.sum = 20000;
		}

	}             
	public int getSum(){
		return this.sum;
	}
	public void setSum(int sum){
		this.sum = sum;
	}
}