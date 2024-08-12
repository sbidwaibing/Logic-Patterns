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
        System.out.println("Right-Angled Number Triangle Pattern");
        np.RightAngNumbPattern(n);

        System.out.println();
        System.out.println("Right-Angled Number 2 Triangle Pattern");
        np.RightAngNumb2Pattern(n);
        
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

    public void RightAngNumbPattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void RightAngNumb2Pattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}

//OUTPUT: 
//Enter the Number of Rows / Columns: 5

// Nested Pattern
// *****
// *****
// *****
// *****
// *****

// Right-Angled Triangle Pattern
// *
// **
// ***
// ****
// *****

// Right-Angled Number Triangle Pattern
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 

// Right-Angled Number 2 Triangle Pattern
// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5 
