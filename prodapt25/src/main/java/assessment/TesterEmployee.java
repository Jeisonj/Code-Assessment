package assessment;

public class TesterEmployee{
	public static void main(String[] args)
	{
			Employee emp1=new Employee("jeison",21,"Software developer");
			Employee emp2=new Employee("santhosh",20,"Software developer");
			Employee emp3=new Employee("gowthams",21,"Software developer");
			Employee emp4=new Employee("seethu",18,"Software developer");
			Employee emp5=new Employee("yogesh",21,"Software developer");
			
			HrManager e1=new HrManager();
			e1.processRecords(emp1.name,emp1.age,emp1.designation);
			e1.processRecords(emp2.name,emp2.age,emp2.designation);
			e1.processRecords(emp3.name,emp3.age,emp3.designation);
			e1.processRecords(emp4.name,emp4.age,emp4.designation);
			e1.processRecords(emp5.name,emp5.age,emp5.designation);
            e1.process(emp1);
            e1.process(emp2);
	}

}

