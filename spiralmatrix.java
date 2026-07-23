import java.util.*;
public class spiralmatrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        int m = sc.nextInt();
        int matrix [][] =  new int[n][m];
        for(int i = 0; i<n; i++)
            {
             for(int j = 0; j<m; j++)
                 {
                matrix[i][j] = sc.nextInt();
             }
        }
        System.out.println(" the spiral order matrix ");
        int rowstart = 0;
        int rowend = n-1;
        int colstart = 0;
        int colend = m-1;
        while(rowstart<=rowend  && colstart<=colend)
            {
            for(int col= colstart; col<= colend; col++)
            {
                System.out.print(matrix[rowstart][col] + " ");
            }
            rowstart++;
            for(int row= rowstart; row<=rowend; row++)
            {
                System.out.print(matrix[colend][row] + " ");
            }
            colend--;
        }
        for(int col = colend; col>=colstart; col--)
        {
            System.out.print(matrix[rowend][col] + " ");
        }
        rowend--;
        for(int row = rowend; row>= rowstart; row++)
        {
            System.out.print(matrix[row][colstart]);
        }
        colstart++;
        System.out.println();
    }
    
}
