package prueba;

/**
 *
 * @author ESFOT
 */
public class Isoceles implements Triangulo{
    
    private double lado1;
    private double lado2;

    //Constructor
    public Isoceles(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularPerimetro() {
        
        double perimetro = ((2*lado1)+lado2);
            
        return perimetro;
    
    }

    @Override
    public double calcularArea() {
      
        double area = ((lado2)*Math.sqrt((lado1*lado1)-((lado2*lado2)/4.0))/2.0);
    
        return area;
    }

    @Override
    public double calcularAltura() {
     
        double altura = Math.sqrt((lado1*lado1)-((lado2*lado2)/4.0));
        
        return altura;
    }
    
    
    
    
}
