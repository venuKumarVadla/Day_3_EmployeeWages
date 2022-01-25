
public class EmployeeWages {

	static void EmployeeSalary() {

		//Declaring Variables
		String employeeName = "Venu Kumar";
		int employee_Hour_Wages = 20 ; 
		int full_Time_Hours = 8 ;
		int part_Time_Hours = 4;

		int day_Salary ;
		int part_Time_Salary;


		day_Salary = employee_Hour_Wages * full_Time_Hours;
		System.out.println("Employee Name:"  + employeeName + ", " +"  Salary : " + day_Salary);


		employeeName = "Raghu";
		part_Time_Salary = employee_Hour_Wages * part_Time_Hours;	
		System.out.println("Employee Name:"+employeeName + " ,"  + "  Salary:  " + part_Time_Salary);

		int hours = 4;
		switch (hours) {
		case 1 :
			System.out.println("Employee Worked 4 hours Only");
			break;
		case 2:
			System.out.println("Employee Worked  Full Time");
			break;
		case 3:
			System.out.println( "Employee Employee Abscent");
			break;

		}
	}

	//===========================Employee Monthly Salary =========================//

	static void EmployeMonthLySalary() {

		int employee_Hour_Wages = 20 ; 
		int monthly_Employee_Salary;
		int employee_WorkingDays = 20;
		String employeeName = "JamesCamaran";

		//Employee Daily Salary (Wages)
		int hours = 4;

		System.out.println("===================Employee Monthly Salary=================");

		hours = 50;   
		if (hours <=80)
		{
			monthly_Employee_Salary = hours * employee_Hour_Wages;
			System.out.println("Employee Name:"  + employeeName +",  " + "Employee Type : Part time" );
			System.out.println("Employee Salary :" + monthly_Employee_Salary);
		}
		else if (hours  >= 100)
		{
			monthly_Employee_Salary = hours * employee_Hour_Wages;
			System.out.println("Employee Name:"  + employeeName +"Employee Type : Full time " );
			System.out.println("Employee Salary :" + monthly_Employee_Salary);

		}else {
			System.out.println("Employee Name : " + employeeName + "Employee Working Status: Not Working(Abscent)");
		}

	}


	public static void main(String[] args) {
		// Intitilizing the Variable 
		int is_Full_Time = 1;

		System.out.println("=======================Employee Attendance ==========================");
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == is_Full_Time) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Abscent");

		}

		System.out.println("====================Employee One Day Salary ====================");
		EmployeeSalary();
		//===========================Employee Monthly Salary =========================//

		EmployeMonthLySalary();

	}
	

}

