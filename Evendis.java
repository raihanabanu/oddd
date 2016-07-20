# oddd
import java.util.Scanner;
public class Evendis {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
int k=s.nextInt();
int j=s.nextInt();
if(k%2==0){
	for( int a=k;a<=j;a++){
int h=a+1;
	int f=h+2;
	System.out.println(h);
	System.out.println(f);
	a=a+2;
	a++;
	
	}
	}
else
{
	for(int i=k+1;i<=j;i++)
		{
		int h=i+1;
		int f=h+2;
	 System.out.println(h);
		System.out.println(f);
		i=i+2;
		i++;
		}
}
}
}


