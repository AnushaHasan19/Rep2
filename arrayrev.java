//revision of insertion and deletion
import java.util.Scanner;
class arrayrev
{
	public static void main(String args[])
	{
	int i,n,dig,pos;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n");
	n=sc.nextInt();
	int ar[]=new int[n+1];
	for(i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		System.out.println(ar[i]);
	}
	//binary search
	int f=0;
	int l=ar.length();
	int mid=(f+l)/2;
	int temp;
	int key;
	System.out.println("Enter element you waanna seaaaaarch");
	//in order to use binary,array should be sorted,here Iam using bubble sort
	
	/*insertion
//To insert the element
System.out.println("Enter the element you want to insert");
dig=sc.nextInt();
System.out.println("Enter the position at which you want to insert your element");
pos=sc.nextInt();
for(int j=n-1;j>pos-1;j--)
{
	ar[j]=ar[j-1];
}
ar[pos-1]=dig;
System.out.println("ARRAY IS");
for(i=0;i<n;i++)
{
	System.out.println(ar[i]);
}
//deletion
int p;
System.out.println("Enter the value you wanna delete");
p=sc.nextInt();
for(i=p;i<n-1;i++)
{
	ar[i]=ar[i+1];
}
System.out.println("NEW LIST");
for(i=0;i<n;i++)
{
	System.out.println(ar[i]);
}*/
	}
}