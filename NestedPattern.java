/**
 * The `NestedPattern` class in Java takes an input number and prints a square pattern of asterisks
 * with the specified number of rows and columns.
 */
import java.util.Scanner;

public class NestedPattern 
{
    /**
     * @param args The `args` parameter in the `main` method is an array of strings that allows you to
     * pass command line arguments when running the Java program. These arguments can be accessed
     * within the program if needed.
     */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows / Columns");
        
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
