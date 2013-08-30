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
    public static String checkTriType(double a,double b,double c)
    {
        if((a==0)|(b==0)||(c==0))
        {
            return "Invalid";
        }
        else if((a+b<c)||(a+c<b)||(b+c<a))
        {
            return "Invalid";
        }
        else 
        {
            if ((a==b)&&(a==c))
            {
                return "Equilateral Triangle";
            }
            else if((a==b)||(a==c)||(b==c))
            {
                return "Isosceles Triangle";
            }
            else
            {
               return "Scalene";
            }
        }
        
    }
}
