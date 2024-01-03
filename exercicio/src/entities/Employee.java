package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double NetSalary() {
		return (this.grossSalary - this.tax);		
	}

	public double IncreaseSalary(double percentage){
		double newSalary;
		newSalary = ((this.grossSalary * percentage)/100);
		return newSalary += this.grossSalary - this.tax;			
	}
}
