import java.util.*;

public class heartPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		int row=sc.nextInt();//input=6
	
		for(int i=row/2;i<=row;i+=2){
		    for(int j=1;j<row-i;j+=2){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++){
		        System.out.print("*");
		    }
		    for(int j=1;j<=row-i;j++){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++){
		        System.out.print("*");
		    }
		    System.out.println(" ");
		}
		
		for(int i=row;i>=1;i--){
		    for(int j=1;j<=row-i;j++){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=(i*2)-1;k++){
		        System.out.print("*");
		    }
		    System.out.println(" ");
		}
	}
}
