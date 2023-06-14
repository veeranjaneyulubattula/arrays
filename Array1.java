/*given an int array length 3, if there is 2 in the array immediately 
 * followed by a 3, change the element 3 to 0 and 
 * return the changed array
 * int arr[]=new int[1,2,3];
 * 
 */
package veera;
import java.util.Arrays;
public class Array1 
{
	int[]meth1()
	{
		int arr[]= {2,3,2};
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==2 && arr[+1]==3)
			{
				arr[i+1]=0;
			}
		}
		return arr;
	}

	public static void main(String[] args) 
	{
		Array1 a=new Array1();
		int result[]=a.meth1();
		System.out.println(Arrays.toString(result));
	
	}
}
