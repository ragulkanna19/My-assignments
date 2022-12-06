
public class EmployeeDetails {
	public void printEmployeeName(String empName , int empId) {
		System.out.println(empName);
		System.out.println(empId);
	}
	public void getEmployeeAddresh(String empAddresh) {
		System.out.println(empAddresh);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println(empSalary);
	}
    public void printEmployeeMobileNumber(long mobNum) {
    	System.out.println(mobNum);
    }
    public static void main(String[] args) {
		EmployeeDetails employee=new EmployeeDetails();
		employee.printEmployeeName("shikukutoka", 1);
		employee.getEmployeeAddresh("1/25 -6, chennai");
		employee.printEmployeeSalary(11000.00);
		employee.printEmployeeMobileNumber(1234556321);
	}
}
