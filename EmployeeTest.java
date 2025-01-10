import java.time.*;
public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Tejas Sood",125000,2025,2,5);
		staff[1] = new Employee("Tejas Sood1",225000,2025,2,5);
		staff[2] = new Employee("Tejas Sood2",325000,2025,2,5);
		
		for (Employee e : staff)
			e.raiseSalary(5);
		for (Employee e : staff)
			System.out.println("Name = " + e.getName() + " Salary = " + e.getSalary() + " ,HireDay = " + e.getHireDay());


	}

}
