
package geometria;


public class pruebapunto {

    public static void main (String [] args){
        
        
        punto punto1=new punto(1,3);
        /*aqui estamos creandoe l punto umo y lo mostramos */
        System.out.println("las coordenadas son:"+ punto1.getX()+" "+punto1.getY());
        punto punto2=new punto(); punto punto2Aux=punto2;
        /*aqui estamos creando el punto dos y lo mostramos en consola    */
        System.out.println(punto2Aux.getX()+","+punto2Aux.getY());
        punto punto3Aux=new punto (punto1);
        punto punto3= punto3Aux; 
        System.out.println(punto3.getX()+","+punto3.getY());
        /*el punto tres se le asigno el valor de una copia de punto 1 */
        punto2Aux.setX(5);punto2Aux.setY(4);
        punto punto4=punto2Aux;
        System.out.println("coordenadas de punto 2 :"+punto2.getX()+","+punto2.getY());
        System.out.println("coordenadas de punto 4 :"+punto4.getX()+","+punto4.getY());
        /*se modifico el valor del punto 2 y el punto 4 fue creado a partir de los valoeres de punto 2 */
        
    }
    
    
    
    
}
