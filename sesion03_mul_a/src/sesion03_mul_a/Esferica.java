
package sesion03_mul_a;


public class Esferica {
    
    private float radio;
    private float angulo1;
    private float angulo2;

    public Esferica(float radio, float angulo1, float angulo2) {
        this.radio = radio;
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
    }

    public Esferica() {
    }

    
    public float getRadio() {
        return radio;
    }

    public float getAngulo1() {
        return angulo1;
    }

    public float getAngulo2() {
        return angulo2;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void setAngulo1(float angulo1) {
        this.angulo1 = angulo1;
    }

    public void setAngulo2(float angulo2) {
        this.angulo2 = angulo2;
    }

   
    
}
