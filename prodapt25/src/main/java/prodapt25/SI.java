package prodapt25;

public class SI {
	void SimpleInterest(int p,int n,int r)
	{
		int i=(p*n*r)/100;
		int y=p+i;
		System.out.println("Interest is "+i);
		System.out.println("The amount to be paid is "+(p+i));
	}

}
