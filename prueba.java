import java.util.Scanner;
import java.util.Arrays;
class test {
public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);
   

     System.out.println("Entre el número de filas del array: ");
     int row=sc.nextInt();
     System.out.println("Entre el número de columnas del array: ");
     int column=sc.nextInt();
     int a[][]=new int[row][column];
     System.out.print("Introduzca " + row*column + " los elementos del array :\n");
     int[] diagoPrincipal = new int[a.length];
     for (int i = 0; i < row; i++)
     {
         for(int j = 0; j < column; j++)
         {
                 a[i][j] = sc.nextInt();
               
                 if(i==j)
                 {
                    diagoPrincipal[i] = a[i][j];
                 }
           
         }  
     }
     System.out.println("La matriz creada es:");
     
     for (int i = 0; i < row; i++)
     {
         for(int j = 0; j < column; j++)
         {
            System.out.print(a[i][j]+"    ");
        
         }
         System.out.print("\n");

     }  
   
     System.out.println("\nDiagonal Principal");
     for (int i = 0; i < row; i++)
     {
        System.out.println(diagoPrincipal[i]);   
     } 
    }
}

