/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package svv.pkg01;

/**
 *
 * @author IC
 */
public class SVV01 {

    /**
     * @param args the command line arguments
     */
    public static void checkTriType(double a,double b,double c)
    {
        if((a==0)|(b==0)||(c==0))
        {
            System.out.println("Invalid");
        }
        else if((a+b<c)||(a+c<b)||(b+c<a))
        {
            System.out.println("Invalid");
        }
        else 
        {
            if ((a==b)&&(a==c))
            {
                System.out.println("Equilateral Triangle");
            }
            else if((a==b)||(a==c)||(b==c))
            {
            System.out.println("Isosceles Triangle");
            }
            else
            {
                System.out.println("Scalene");
            }
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("FirstTry : "); 
        checkTriType(5,5,5);
        System.out.print("SecondTry : "); 
        checkTriType(5,5,9);
        System.out.print("ThirdTry : "); 
        checkTriType(3,4,5);
        System.out.print("ForthTry : "); 
        checkTriType(5,5,500);
    }
}
