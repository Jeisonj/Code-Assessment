package assessment;

public class HrManager {
	void processRecords(String name,int age,String designation)
	{
		System.out.println("\n Employee name :"+name);
		System.out.println("\n Employee age :"+age);
		System.out.println("\n Employee designation :"+designation);

	}
	public void process(Employee obj)
	{
		System.out.println(obj.name+ obj.age+obj.designation);
	}

}
