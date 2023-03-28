class p6
{
 public static void main(String args[])
 {
	int no1=5,no2=6,no3=7;
	if(no1%2==0)
	{
	System.out.println("No1 is even");
	}
	else
	{
	System.out.println("No1 is odd");
	}
	switch(no2%2)
	{
	case 0: System.out.println("No2 is even");
	break;
	case 1: System.out.println("No1 is odd");
	break;
	}
	System.out.println(no3%2==0?"No3 is even":"No3 is odd");
 }
}