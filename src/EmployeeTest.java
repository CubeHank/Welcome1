import java.util.*;
import pWdh.*;

/**
 * this is Employee Test Class.
 * */
public class EmployeeTest {
	public static void TestPrint(String[] args) {
		Manager mManager = new Manager();
		Employee[] staff = new Employee[3];

		staff[0] = mManager;// new Employee("aa", 11, 1989, 11, 1);
		staff[1] = new Employee("bb", 22, 1989, 11, 2);
		staff[2] = new Employee("cc", 33, 1989, 11, 3);

		for (Employee e : staff) {
			System.out.println("name=" + e.getName());
		}

		Manager boss = (Manager) staff[0];
		if (staff[1] instanceof Manager) {
			Manager boss1 = (Manager) staff[1];
			System.out.println("staff 1 is Manager");
		} else {
			System.out.println("staff 1 is not a Manager");
		}

	}
}
