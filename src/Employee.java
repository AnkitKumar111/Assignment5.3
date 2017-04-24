public abstract class Employee {
	//properties
	int empId;
	String empName;
	int total_leaves;
	double total_salary;
	
	//methods
	abstract void calculate_balance_leaves();
	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
	abstract void calculate_salary();
}
