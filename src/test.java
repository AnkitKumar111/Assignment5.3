
public class test {

	public static void main(String[] args) {
		/*creating object and performing operation on PermanentEmp and 
		  TemporaryEmp class 
		 */
		PermanentEmp p=new PermanentEmp(1, "ankit", 50000);
		p.calculate_salary();
		p.avail_leave(2, 'p');
		p.avail_leave(14, 'p');
		p.print_leave_details();
		p.calculate_balance_leaves();
		
		
		TemporaryEmp t = new TemporaryEmp(12, "Rohit", 20000);
		t.calculate_salary();
		t.avail_leave(5, 'p');
		t.calculate_balance_leaves();

	}

}
