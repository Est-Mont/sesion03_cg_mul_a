
package sesion03_mul_a;


public class Cilindrica {
    private float radio;
    private float angulo;
    private float z;

    public Cilindrica(float radio, float angulo, float z) {
        this.radio = radio;
        this.angulo = angulo;
        this.z = z;
    }

    public Cilindrica() {
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getRadio() {
        return radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public float getZ() {
        return z;
    }
    
    
}
