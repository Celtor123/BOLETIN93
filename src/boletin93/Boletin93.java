
package boletin93;

import java.util.Scanner;


public class Boletin93 {
    
int  base;
int altura;
public int rectangulo(int base,int altura){
    int area=base*altura;
    return area;
    
}
    
    public static void main(String[] args) {
        Boletin93 as=new Boletin93();
        Scanner a= new Scanner(System.in);
        int base=a.nextInt();
        int altura=a.nextInt();
        if(base>0){
            if(altura>0){
                System.out.println(as.rectangulo(base, altura));
            }
       
        }
        
    }
    
}



/**implementa un programa que calcule o área dun rectángulo cuxa base e altura pides por teclado . 
*Asegurate que estos valores sexan positivos , para eso valida os datos .
*/