
package detrmnistic;

import help.HelpTool;

/**
 *
 * @author Abdalla
 */
public class problemType1 {
    
    private double arivaleRate=0;
    private double serviceRate=0;
    private double inputTime=0;
    private double result=0;
     
    
     public double DDA(String strArival,String StrServise,String StrTime){
        help.HelpTool use =new HelpTool();
        
        arivaleRate = use.convertToDouble(strArival);
        serviceRate = use.convertToDouble(StrServise);
        inputTime = use.convertToDouble  ( StrTime);
        
        
         result = ((int)(arivaleRate * inputTime)) - ((int)((serviceRate* inputTime) - (serviceRate/arivaleRate)));
         
         return result;
     }
    
    

    
    
}
