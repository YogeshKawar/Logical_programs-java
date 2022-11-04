package Array;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ar=new String[5];	//compile time error occurs if 1]syntax is not proper
		ar[0]="Asha";
		ar[1]="Akshay";
		ar[2]="Shourya";
		ar[3]="Dipali";
		ar[4]="Jyoti";
		
		//System.out.println(ar[3]);
		for(int i=0;i<=4;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
