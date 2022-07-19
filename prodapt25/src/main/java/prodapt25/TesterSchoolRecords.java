package prodapt25;
import java.util.Scanner;

public class TesterSchoolRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int SchoolID=a.nextInt();
		String schoolname=a.next();
		String schoolAddress=a.next();
		SchoolRecords e=new SchoolRecords();
		e.ddRecords();
		e.dispRecords(SchoolID,schoolname,schoolAddress);

		
		
		

	}

}
