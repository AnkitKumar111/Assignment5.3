public class PermanentEmp extends Employee {
	//properties
	int paid_leave, sick_leave, casual_leave;
	double basic, hra,pfa;
	
	//Parameterized constructor.
	public PermanentEmp(int empId, String empName, double basic) {
		this.empId=empId;
		this.empName=empName;
		this.basic = basic;
		paid_leave=10;
		sick_leave=4;
		casual_leave=5;
		total_leaves=10+4+5;//19
		// different type of leaves are set to each employee
	}

	//overrides the methods of employee class
	@Override
	void calculate_balance_leaves() {
		System.out.println("Total avalable leaves are: "+(paid_leave+sick_leave+casual_leave));
		
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		if (type_of_leave=='p'){
			if(paid_leave-no_of_leaves>=0){
				total_leaves-=no_of_leaves;
				paid_leave-=no_of_leaves;
				return true;
			}
			else { System.out.println("You can't get leave!! ");
				return false;
			}
		}
		else if(type_of_leave=='s'){
			if(sick_leave-no_of_leaves>=0){
				total_leaves-=no_of_leaves;
				sick_leave-=no_of_leaves;
				return true;
			}
			else{ System.out.println("You can't get leave!! ");
			return false;
		}
		}
		else if(type_of_leave=='c'){
			if(casual_leave-no_of_leaves>=0){
				casual_leave-=no_of_leaves;
				total_leaves-=no_of_leaves;
				return true;
			}
				
			else{ System.out.println("You can't get leave!! ");
			return false;
		}
		}
		System.out.println("You can't get leave!! ");
		return false;
	}

	@Override
	void calculate_salary() {
		pfa = .12*basic;
		hra = .5 *basic;
		total_salary = basic + (.5 *basic)-(.12*basic);
		System.out.println("Total salary of "+this.empName+ "'s is :"+ total_salary);
		
	}
	
	void print_leave_details(){
		System.out.println("PermenantEmp [paid_leave=" + paid_leave + ", sick_leave=" + sick_leave + ", casual_leave="
				+ casual_leave + "]");
	}

}
