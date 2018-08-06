
package prueba;

/**
 *
 * @author ESFOT
 */
public class Equilatero implements Triangulo{

    double lado1;
    double lado2;
    double lado3;

    public Equilatero(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
    }
    
    
      @Override
    public double calcularPerimetro() {
        
        double perimetro = 3*(lado1);
            
        return perimetro;
    
    }

    @Override
    public double calcularArea() {
      
      
        double area = ((Math.sqrt(3)*lado1)/2)*(lado1*lado1);
    
        return area;
    }

    @Override
    public double calcularAltura() {
     
     
        double altura = ((Math.sqrt(3)*lado1)/2);
        
        return altura;
    }
    
    
    
    
}
