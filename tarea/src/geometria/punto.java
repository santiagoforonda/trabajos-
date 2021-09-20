
package geometria;


public class punto {
    
    private float x,y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
   public punto( ){
       this.x=0;
       this.y=0;
   }
    public punto( punto coordenada){
        this.x=coordenada.getX();
        this.y=coordenada.getY();
    }
   public void incremento(float  x, float y){
       this.x+=x;
       this.y+=y;
   }
    

}
