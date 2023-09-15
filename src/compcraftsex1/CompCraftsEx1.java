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
        
            //put answer here
        }
        
        //inverted right triangle
        else if(choice.equalsIgnoreCase("b")){
            
            //put answer here
        
        }
        
        
        //rectangle with alternating shapes per row
        else if(choice.equalsIgnoreCase("c")){
        
            //put answer here
            
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