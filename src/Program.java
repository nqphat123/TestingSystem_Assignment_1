import java.time.LocalDate;

public class Program {
	public static void main(String[] args) {
		// logic
		// create department
		Department department1 = new Department();
		department1.id = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.departmentName = "Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.departmentName = "IT";

		// create position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.DEV;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.TEST;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.SCRUM_MASTER;

		// create Group
		Group group1 = new Group();
		group1.id = 1;
		group1.groupName = "Fresher";

		Group group2 = new Group();
		group2.id = 2;
		group2.groupName = "Junior";

		Group group3 = new Group();
		group3.id = 3;
		group3.groupName = "Senior";

		// create account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "1@gmail.com";
		account1.userName = "nvA";
		account1.fullName = "Nguyen Van A";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();
		Group[] groupAcc1 = { group1, group2 };
		account1.groups = groupAcc1;

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "2@gmail.com";
		account2.userName = "nvB";
		account2.fullName = "Nguyen Van B";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = LocalDate.now();
		account2.groups = new Group[] { group3, group2 };

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "3@gmail.com";
		account3.userName = "nvC";
		account3.fullName = "Nguyen Van C";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = LocalDate.now();

		System.out.println("Thông tin các Account:");
		System.out.println("Account 1:\nID: " + account1.id + "\n" + "Email: " + account1.email + "\n" + "UserName: " + account1.userName + "\n" + "FullName: " + account1.fullName + "\n" + "Department: " + account1.department.departmentName + "\n" + "Position: " + account1.position.name + "\n" + "CreateDate: " + account1.createDate + "\n" + "Group: " + account1.groups[1].groupName );
		
		System.out.println("\n");
		System.out.println("Account 2:\nID: " + account2.id + "\n" + "Email: " + account2.email + "\n" + "UserName: " + account2.userName + "\n" + "FullName: " + account2.fullName + "\n" + "Department: " + account2.department.departmentName + "\n" + "Position: " + account2.position.name + "\n" + "CreateDate: " + account2.createDate + "\n" + "Group: " + account2.groups[1].groupName );
		
		System.out.println("\n");
		System.out.println("Account 3:\nID: " + account3.id + "\n" + "Email: " + account3.email + "\n" + "UserName: " + account3.userName + "\n" + "FullName: " + account3.fullName + "\n" + "Department: " + account3.department.departmentName + "\n" + "Position: " + account3.position.name + "\n" + "CreateDate: " + account3.createDate + "\n" + "Group: "  );
	
	}
}
