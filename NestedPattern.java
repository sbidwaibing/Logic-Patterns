import java.util.Scanner;

public class NestedPattern 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the Number of Rows / Columns: ");
        
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Nested Pattern");
        NestedPattern np = new NestedPattern();
        np.nestPattern(n);

        System.out.println();

        System.out.println("Right-Angled Triangle Pattern");
        np.RightAngPattern(n);
        
        System.out.println();

        sc.close();
    }

    public void nestPattern(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void RightAngPattern(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
