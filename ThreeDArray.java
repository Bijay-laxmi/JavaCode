package Array;

import java.util.Random;
import java.util.Scanner;

public class ThreeDArray {
	
	public static void initializeArray(int[][][]array)
	{
		Random random= new Random();
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[1].length; j++)
			{
				for(int k=0; k<array[i][j].length; k++)
				{
					array [i][j][k] = random.nextInt(100);
				}
			}
		}
	}
	
	public static void displayArray(int[][][] array)
	{
		for (int i=0;i<array.length; i++)
		{
			System.out.println("Levels " +i+" :");
			for(int j=0; j<array[i].length; j++)
			{
				for (int k=0; k<array[i][j].length; k++)
				{
					System.out.print(array[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	//to calculate maximum
	public static void maximumValue(int[][][] array)
{
	int max = array[0][0][0];
	for(int i=0;i<array.length; i++)
	{
		for(int j=0;j<array[i].length; j++)
		{
			for(int k=0;k<array[i][j].length; k++)
			{
				if(array[i][j][k] > max)
				{
					max = array[i][j][k];
				}
			}
		}
	}
System.out.println("Maximum Value: "+max);
}
//to calculate average
	public static double averageValue(int[][][] array)
	{
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array[i].length; j++)
            {
                for (int k = 0; k < array[i][j].length; k++)
                {
                    sum += array[i][j][k];
                    count++;
                }
            }
            
        }

        if (count == 0) {
        return 0.0; // To avoid division by zero if the array is empty
            }

        return (double) sum / count;
        
	}

	
	public static void main(String args [])
{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number of levels:");
	int levels = sc.nextInt();
	
	System.out.print("Enter the number of rows:");
	int rows = sc.nextInt();
	
	System.out.print("Enter the number of column:");
	int cols = sc.nextInt();
	
	int [][][] threeDArray =new int[levels][rows][cols];
	
	System.out.println("Initializing 3-D Array:" );
	initializeArray(threeDArray);
	
	displayArray(threeDArray);
	maximumValue(threeDArray);
	
	System.out.println("Average Value: " + averageValue(threeDArray));
	sc.close();
	
	}
}
