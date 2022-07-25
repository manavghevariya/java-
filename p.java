import java.util.Scanner;
class p
{ 
	public static void main(String[] args) 
	{
    		int n,flag;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your number : ");
		n = sc.nextInt();
		for(int i=2; i<=n; i++)
		{
			flag=0;
			for(int j=1; j<=i; j++)
			{
				 if(i%j==0)
				 flag++;
			}			
				if(flag==2){
					System.out.println(i);

}
}
}
}

 