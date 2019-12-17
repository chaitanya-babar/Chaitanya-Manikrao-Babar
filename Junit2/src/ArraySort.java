import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	
	public static int[] sortNumbers(int[] arr)
    {
        Arrays.sort(arr);
        return  arr;
	}
	
	public static void main()
	{
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        System.out.println("Enter the array data");
        int ar[] = new int [len];
        for (int i = 0;i<len;i++)
        {
            ar[i]=sc.nextInt();
        }
        int [] new_ar = new int [len];
        new_ar = sortNumbers(ar);
        ArraySortTest ast = new ArraySortTest();
        ast.sort_test(new_ar);
		
		
	
	}
}
