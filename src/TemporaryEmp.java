public class TemporaryEmp extends Employee {
	
	//Parameterized constructor
	public TemporaryEmp(int empId, String empName, double total_salary) {
		this.empId=empId;
		this.empName=empName;
		this.total_salary=total_salary;
		this.total_leaves=14;
		// there is only 14 leaves available for the Temporary employees 
	}


	//overrides the methods of employee class
	@Override
	void calculate_balance_leaves() {
		System.out.println("Total available leaves are:"+total_leaves);
		
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		if (no_of_leaves<=total_leaves){
			total_leaves-=no_of_leaves;
			return true;
		}
		return false;
	}

	@Override
	void calculate_salary() {
		double total_sal = total_salary + (.5 *total_salary)-(.12*total_salary);
		System.out.println("Total salary of "+this.empName+ "'s is :"+ total_sal);		
	}

}
