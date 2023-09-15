/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compcraftsex1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CompCraftsEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String repeat = "y";
        
        while(repeat.equalsIgnoreCase("y")){
        System.out.println("What do you want to display? ");
        System.out.println("A. Right Triangle");
        System.out.println("B. Inverted Right Triangle");
        System.out.println("C. Rectangle with alternating rows");
        System.out.println("D. Rectangle with borders");
        System.out.println("E. Rectangle with alternating rows and columns");
        System.out.println("Enter the letter of your choice: ");
        
        String choice = sc.nextLine();
        
        //Right triangle 
        if(choice.equalsIgnoreCase("a")){
        
            int rTRows = 0;
            
            System.out.println("Enter the number of rows: ");
            rTRows = Integer.parseInt(sc.nextLine());
            
            
            for(int i=0;i<=rTRows;i++){
                for(int j=0; j<i;j++){
                    System.out.print("o");
                }
                System.out.printf("%n");
            }
        }
        
        //inverted right triangle
        else if(choice.equalsIgnoreCase("b")){
            
            int iRTRows = 0;
            
            System.out.println("Enter the number of rows: ");
            iRTRows = Integer.parseInt(sc.nextLine());
            
            
            for(int i=iRTRows;i>0;i--){
                for(int j=i; j>0;j--){
                    System.out.print("o");
                }
                System.out.printf("%n");
            }
        
        }
        
        
        //rectangle with alternating shapes per row
        else if(choice.equalsIgnoreCase("c")){

            System.out.println("Enter the number of rows: ");
            int altRectRow = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the number of columns: ");
            int altRectCol = Integer.parseInt(sc.nextLine());
            
            for(int i=1;i<=altRectRow;i++){
                for(int j=1;j<=altRectCol;j++){
                    
                    if(i%2==0){
                    System.out.print("O");
                    } else {
                    System.out.print("U");  
                    }
                }
                System.out.print("\n");
            }
            
        }
        
        
        //rectangle with border
        else if(choice.equalsIgnoreCase("d")){
        
            //put answer here
            
        }
        
        
        //rectangle with alternating shapes per row
        else if(choice.equalsIgnoreCase("e")){ 
        
            //put answer here
            
        }
        
        else{
            System.out.println("Choose a letter from A-E");
        }
        
        System.out.println("Again? [Y/N]: ");
        repeat = sc.nextLine();
    }
        
        
        
        
        
        
    }
    
}