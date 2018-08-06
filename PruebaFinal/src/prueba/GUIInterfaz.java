package prueba;


import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class GUIInterfaz extends javax.swing.JFrame {

   
    /**
     * Creates new form GUIImplements
     */
    
    ArrayList<Triangulo> listaTriangulos = new ArrayList();
    DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
    boolean esTriangulo = false;
    boolean esIsoceles = false;
    boolean esEscaleno = false;
    boolean esEquilatero = false;
    
    
    public GUIInterfaz() {
        initComponents();
        //Area triangulo: Bse*altura / 2
        //aREA CUADRADO: LADO*LADO
        //Area circulo: Pi*r*r
        //Area rectangulo: base*altura
        
        
        modeloComboBox.addElement("Rectángulo");
        modeloComboBox.addElement("Isóceles");
        modeloComboBox.addElement("Escaleno");
        modeloComboBox.addElement("Equilátero");
        comboBoxFigura.setModel(modeloComboBox);
        
        /* noPanelTriangulo();
        noPanelRectangulo();
        noPanelCirculo();
        noPanelCuadrado();*/
        
        this.setLocationRelativeTo(null);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFigura = new javax.swing.JLabel();
        comboBoxFigura = new javax.swing.JComboBox<>();
        panelTRectangulo = new javax.swing.JPanel();
        textLado1 = new javax.swing.JTextField();
        labelLado = new javax.swing.JLabel();
        labelLado2 = new javax.swing.JLabel();
        textLado2 = new javax.swing.JTextField();
        labelLado3 = new javax.swing.JLabel();
        textLado3 = new javax.swing.JTextField();
        panelTriangulo = new javax.swing.JPanel();
        labelLado4 = new javax.swing.JLabel();
        labelLado5 = new javax.swing.JLabel();
        textLado4 = new javax.swing.JTextField();
        textLado5 = new javax.swing.JTextField();
        panelCirculo = new javax.swing.JPanel();
        labelLado6 = new javax.swing.JLabel();
        textLado6 = new javax.swing.JTextField();
        labelLado7 = new javax.swing.JLabel();
        textLado7 = new javax.swing.JTextField();
        labelLado8 = new javax.swing.JLabel();
        textLado8 = new javax.swing.JTextField();
        panelRectangulo = new javax.swing.JPanel();
        labelLado9 = new javax.swing.JLabel();
        labelLado10 = new javax.swing.JLabel();
        textLado9 = new javax.swing.JTextField();
        textLado10 = new javax.swing.JTextField();
        labelLado11 = new javax.swing.JLabel();
        textLado11 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        buttonCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelFigura.setText("Elije una figura:");

        comboBoxFigura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        panelTRectangulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Triángulo Rectángulo"));
        panelTRectangulo.setMinimumSize(new java.awt.Dimension(0, 0));

        labelLado.setText("Lado:");

        labelLado2.setText("Lado:");

        labelLado3.setText("Lado:");

        javax.swing.GroupLayout panelTRectanguloLayout = new javax.swing.GroupLayout(panelTRectangulo);
        panelTRectangulo.setLayout(panelTRectanguloLayout);
        panelTRectanguloLayout.setHorizontalGroup(
            panelTRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTRectanguloLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(labelLado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(panelTRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTRectanguloLayout.createSequentialGroup()
                        .addComponent(labelLado2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTRectanguloLayout.createSequentialGroup()
                        .addComponent(labelLado3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textLado3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTRectanguloLayout.setVerticalGroup(
            panelTRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTRectanguloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelTRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLado2)
                    .addComponent(textLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLado3)
                    .addComponent(textLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTriangulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Triangulo-Isoceles"));
        panelTriangulo.setMinimumSize(new java.awt.Dimension(100, 100));
        panelTriangulo.setPreferredSize(new java.awt.Dimension(134, 157));

        labelLado4.setText("Lado:");

        labelLado5.setText("Lado:");

        javax.swing.GroupLayout panelTrianguloLayout = new javax.swing.GroupLayout(panelTriangulo);
        panelTriangulo.setLayout(panelTrianguloLayout);
        panelTrianguloLayout.setHorizontalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLado5)
                    .addComponent(labelLado4))
                .addGap(18, 18, 18)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textLado4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLado5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelTrianguloLayout.setVerticalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLado4)
                    .addComponent(textLado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLado5)
                    .addComponent(textLado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        panelCirculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Triangulo Escaleno"));
        panelCirculo.setMinimumSize(new java.awt.Dimension(100, 100));
        panelCirculo.setPreferredSize(new java.awt.Dimension(134, 157));

        labelLado6.setText("Lado:");

        labelLado7.setText("Lado:");

        labelLado8.setText("Lado:");

        javax.swing.GroupLayout panelCirculoLayout = new javax.swing.GroupLayout(panelCirculo);
        panelCirculo.setLayout(panelCirculoLayout);
        panelCirculoLayout.setHorizontalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCirculoLayout.createSequentialGroup()
                        .addComponent(labelLado6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(textLado6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCirculoLayout.createSequentialGroup()
                        .addComponent(labelLado8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textLado8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCirculoLayout.createSequentialGroup()
                        .addComponent(labelLado7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textLado7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCirculoLayout.setVerticalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLado6)
                    .addComponent(textLado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLado7)
                    .addComponent(textLado7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLado8)
                    .addComponent(textLado8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelRectangulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Triangulo Equilatero"));
        panelRectangulo.setMinimumSize(new java.awt.Dimension(100, 100));
        panelRectangulo.setPreferredSize(new java.awt.Dimension(134, 157));

        labelLado9.setText("Lado:");

        labelLado10.setText("Lado:");

        labelLado11.setText("Lado:");

        javax.swing.GroupLayout panelRectanguloLayout = new javax.swing.GroupLayout(panelRectangulo);
        panelRectangulo.setLayout(panelRectanguloLayout);
        panelRectanguloLayout.setHorizontalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelRectanguloLayout.createSequentialGroup()
                            .addComponent(labelLado9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textLado9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelRectanguloLayout.createSequentialGroup()
                            .addComponent(labelLado10)
                            .addGap(18, 18, 18)
                            .addComponent(textLado10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRectanguloLayout.createSequentialGroup()
                        .addComponent(labelLado11)
                        .addGap(18, 18, 18)
                        .addComponent(textLado11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelRectanguloLayout.setVerticalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLado9)
                    .addComponent(textLado9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLado10)
                    .addComponent(textLado10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLado11)
                    .addComponent(textLado11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Respuesta:");

        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(labelFigura)
                .addGap(18, 18, 18)
                .addComponent(comboBoxFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(buttonCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(panelTRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(panelTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFigura)
                    .addComponent(buttonCalcular))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(panelTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(panelRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(panelTRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
        // TODO add your handling code here:
        verificarTriangulo1();
    
        if(esTriangulo == true){
            
            String itemSeleccionado = (String) comboBoxFigura.getSelectedItem();
            if(itemSeleccionado.equals("Rectángulo")){
                PanelTriangulo();
                
                String lado1 = textLado1.getText();
                String lado2 = textLado2.getText();
                String lado3 = textLado3.getText();
                
                double lado1Double = Double.parseDouble(lado1);
                double lado2Double = Double.parseDouble(lado2);
                double lado3Double = Double.parseDouble(lado3);

                Triangulo miTrinagulo = new Rectangulo(lado1Double,lado2Double, lado3Double );
                
                System.out.println("Area del triangulo rectangulo: "+miTrinagulo.calcularArea());
                System.out.println("Permietro del triangulo rectangulo: "+miTrinagulo.calcularPerimetro());
                System.out.println("Altura del triangulo rectangulo: "+miTrinagulo.calcularAltura());
                
                
            }else if(itemSeleccionado.equals("Isóceles")){
                verificarTrianguloIsoceles();
                if(esIsoceles == true){
                    
                    String lado4 = textLado4.getText();
                    String lado5 = textLado5.getText();

                    double lado4Double = Double.parseDouble(lado4);
                    double lado5Double = Double.parseDouble(lado5);
                    
                    Triangulo miTriangulo = new Isoceles(lado4Double,lado5Double );
                    
                    System.out.println("Area del triangulo Isoceles: "+miTriangulo.calcularArea());
                    System.out.println("Altura del triangulo Isoceles: "+miTriangulo.calcularAltura());
                    System.out.println("Perimetro del triangulo Isoceles: "+miTriangulo.calcularPerimetro());
                
                }
            
  
            }else if(itemSeleccionado.equals("Escaleno")){
                verificarTrianguloEscaleno();
                
                if(esEscaleno = true){
                
                     
                    String lado6 = textLado6.getText();
                    String lado7 = textLado7.getText();
                    String lado8 = textLado8.getText();

                    double lado6Double = Double.parseDouble(lado6);
                    double lado7Double = Double.parseDouble(lado7);
                    double lado8Double = Double.parseDouble(lado8);
                    
                    Triangulo miTriangulo = new Escaleno(lado6Double,lado7Double, lado8Double);
                    
                    System.out.println("Area del triangulo Escaleno: "+miTriangulo.calcularArea());
                    System.out.println("Altura del triangulo Escaleno: "+miTriangulo.calcularAltura());
                    System.out.println("Perimetro del triangulo Escaleno: "+miTriangulo.calcularPerimetro());
                
                }
                /*
                Figuras f = new Triangulo(4,2); //Para calcilar Area
                Figuras f2 = new Triangulo(4,4,4); //Para calcular Perímetro
                
                f.calcularArea();
                f2.calcularPerimetro();
                */
            }else if(itemSeleccionado.equals("Equilátero")){
                 verificarTrianguloEquilatero();
                 
                 
                  if(esEquilatero = true){
                      
                       
                    String lado9 = textLado9.getText();
                    String lado10 = textLado10.getText();
                    String lado11 = textLado11.getText();

                    double lado9Double = Double.parseDouble(lado9);
                    double lado10Double = Double.parseDouble(lado10);
                    double lado11Double = Double.parseDouble(lado11);
                    
                    Triangulo miTriangulo = new Equilatero(lado9Double,lado10Double, lado11Double);
                    
                    System.out.println("Area del triangulo Escaleno: "+miTriangulo.calcularArea());
                    System.out.println("Altura del triangulo Escaleno: "+miTriangulo.calcularAltura());
                    System.out.println("Perimetro del triangulo Escaleno: "+miTriangulo.calcularPerimetro());
                  
                  }
           
                
            }
            
        }
        

        
       
       
        
    }//GEN-LAST:event_buttonCalcularActionPerformed

    public void verificarTriangulo1(){
    
        String lado1 = textLado1.getText();
        String lado2 = textLado2.getText();
        String lado3 = textLado3.getText();
        
        double lado1Double = Double.parseDouble(lado1);
        double lado2Double = Double.parseDouble(lado2);
        double lado3Double = Double.parseDouble(lado3);
        
   
        if((lado1Double+lado2Double) > lado3Double ){
            if((lado2Double+lado3Double) > lado1Double){
                if((lado1Double+lado3Double) > lado2Double){
                    
                    esTriangulo = true;
                    
                }
                
            }
    
        }
        
        if(esTriangulo == false){
        
            int iconoError = JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Esos lados no forman un triagulo!"+"\n"+"Prueba con otros..", "ERROR", iconoError);
        }
     
      
    }
    
    public void verificarTrianguloIsoceles(){
    
        String lado4 = textLado4.getText();
        String lado5 = textLado5.getText();
        
        double lado4Double = Double.parseDouble(lado4);
        double lado5Double = Double.parseDouble(lado5);
        
        if(lado4Double == lado5Double){
        
            esIsoceles = true;
        
        }
        
        if(esIsoceles == false){
        
            int iconoError = JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Esos 2 lados no son iguales!"+"\n"+"No es un trnauglo Isóceles..", "ERROR", iconoError);
       
            
        }
    }
    
    public void verificarTrianguloEscaleno(){
    
        String lado6 = textLado6.getText();
        String lado7 = textLado7.getText();
        String lado8 = textLado8.getText();
        
        double lado6Double = Double.parseDouble(lado6);
        double lado7Double = Double.parseDouble(lado7);
        double lado8Double = Double.parseDouble(lado8);
        
        if((lado6Double != lado7Double) || (lado7Double != lado8Double) || (lado6Double != lado8Double)){
        
            esEscaleno = true;
        
        }
        
        if(esEscaleno == false){
        
            int iconoError = JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Esos 2 lados son iguales!"+"\n"+"No es un trnauglo Escaleno..", "ERROR", iconoError);
       
            
        }
    }
    public void verificarTrianguloEquilatero(){
    
        String lado9 = textLado9.getText();
        String lado10 = textLado10.getText();
        String lado11 = textLado11.getText();
        
        double lado9Double = Double.parseDouble(lado9);
        double lado10Double = Double.parseDouble(lado10);
        double lado11ouble = Double.parseDouble(lado11);
        
        if((lado9Double == lado10Double) && (lado9Double == lado11ouble)){
        
            esEquilatero = true;
        
        }
        
        if(esEquilatero == false){
        
            int iconoError = JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Esos lados no son iguales!"+"\n"+"No es un trnauglo Equilatero..", "ERROR", iconoError);
       
            
        }
    }
    
    private void PanelTriangulo(){
        
        panelTriangulo.setEnabled(true);
        labelLado.setEnabled(true);
        labelLado2.setEnabled(true);
        labelLado3.setEnabled(true);
        textLado1.setEnabled(true);
        textLado2.setEnabled(true);
        textLado3.setEnabled(true);
        
    
    }
    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JComboBox<String> comboBoxFigura;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelFigura;
    private javax.swing.JLabel labelLado;
    private javax.swing.JLabel labelLado10;
    private javax.swing.JLabel labelLado11;
    private javax.swing.JLabel labelLado2;
    private javax.swing.JLabel labelLado3;
    private javax.swing.JLabel labelLado4;
    private javax.swing.JLabel labelLado5;
    private javax.swing.JLabel labelLado6;
    private javax.swing.JLabel labelLado7;
    private javax.swing.JLabel labelLado8;
    private javax.swing.JLabel labelLado9;
    private javax.swing.JPanel panelCirculo;
    private javax.swing.JPanel panelRectangulo;
    private javax.swing.JPanel panelTRectangulo;
    private javax.swing.JPanel panelTriangulo;
    private javax.swing.JTextField textLado1;
    private javax.swing.JTextField textLado10;
    private javax.swing.JTextField textLado11;
    private javax.swing.JTextField textLado2;
    private javax.swing.JTextField textLado3;
    private javax.swing.JTextField textLado4;
    private javax.swing.JTextField textLado5;
    private javax.swing.JTextField textLado6;
    private javax.swing.JTextField textLado7;
    private javax.swing.JTextField textLado8;
    private javax.swing.JTextField textLado9;
    // End of variables declaration//GEN-END:variables
}
