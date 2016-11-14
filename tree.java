
package astrick;


public class tree {

	
	public static void main(String[] args) {
		int i,j,k;
		for(i=1; i<=5; i++)// no .of rows
		{
			for(j=4; j>=i; j--)// space from left side
			{
			System.out.print(" ");
			}
		for(k=1; k<=(2*i-1); k++) // no.of stars to print
		{
		System.out.print("*");
		}
		System.out.println("");// to print in next row
		}
		
		
		for(int l=0; l<3; l++)
		{
			for (int m=0; m<9; m++ )
			{
			if (m==3||m==4||m==5)// specific column has to print
			{
			System.out.print("*");
		
			}
			else
				System.out.print(" ");
			}
			System.out.println("");
			
			
			
		
	}
	
	

	}}


 

