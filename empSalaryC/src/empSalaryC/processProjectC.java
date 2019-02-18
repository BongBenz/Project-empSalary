package empSalaryC;

public class processProjectC {
	private int sum;
	public processProjectC() {
		
	}
	public processProjectC(inputProjectC in) {
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
		//--project C--//
		if((in.getSalary()<15000) && (in.getSales()>10000)){
			this.sum = this.sum + 5000; 
		}


	}             
	public int getSum(){
		return this.sum;
	}
	public void setSum(int sum){
		this.sum = sum;
	}
}