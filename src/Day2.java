import java.util.Arrays;
import java.util.Scanner;

public class Day2
{
    public static void Reverse_Array(int[] arr)
    {
        int start =0,end = arr.length-1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void Min_Max(int[] arr)
    {
        int min =arr[0],max = arr[0];
        for(int num :arr)
        {
            if(num>max) max = num;
            if(num<min) min = num;
        }

        System.out.println("Min of Array = "+min);
        System.out.println("Max of Array = "+max);
    }
    public static void Sum_Of_Array(int[] arr)
    {
        int sum =0;
        for (int i:arr)
        {
            sum += i;
        }
        System.out.println("The Sum of Array is = "+sum);
    }
    public static void Count_Even_Odd(int[] arr)
    {
        int count = 0,count1 = 0;
        for(int i : arr)
        {
            if(i%2 ==0) count++;
            else count1++;
        }
        System.out.println("The Even Numbers Count is "+count);
        System.out.println("The Odd Numbers Count is "+count1);
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in); 
            System.out.println("Enter the Size of an Array :- ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            //int[] arr = {1,2,3,4,5,6,7,8,9};
            System.out.println("Enter the values for the "+n+" Size Array .");
            for(int i = 0;i<n;i++)
            {
                arr[i] =  sc.nextInt();
            }
        Reverse_Array(arr);
        System.out.println("Reversed Array -"+Arrays.toString(arr));
    
        Min_Max(arr);           
    
}
}