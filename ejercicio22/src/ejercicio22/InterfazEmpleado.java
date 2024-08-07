package ejercicio22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazEmpleado {

    private JFrame frame;
    private JTextField txtNombre;
    private JTextField txtSalarioPorHora;
    private JTextField txtHorasTrabajadas;
    private JTextArea txtOutput;

    public InterfazEmpleado() {
       
        frame = new JFrame("Información del Empleado");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        
        JLabel lblNombre = new JLabel("Nombre del empleado:");
        JLabel lblSalarioPorHora = new JLabel("Salario por hora:");
        JLabel lblHorasTrabajadas = new JLabel("Horas trabajadas:");

        txtNombre = new JTextField();
        txtSalarioPorHora = new JTextField();
        txtHorasTrabajadas = new JTextField();

        JButton btnCalcular = new JButton("Calcular y Mostrar");
        txtOutput = new JTextArea();
        txtOutput.setEditable(false);

        
        frame.add(lblNombre);
        frame.add(txtNombre);
        frame.add(lblSalarioPorHora);
        frame.add(txtSalarioPorHora);
        frame.add(lblHorasTrabajadas);
        frame.add(txtHorasTrabajadas);
        frame.add(new JLabel()); 
        frame.add(btnCalcular);
        frame.add(new JLabel()); 
        frame.add(new JScrollPane(txtOutput));

        
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularYMostrar();
            }
        });

       
        frame.setVisible(true);
    }

    private void calcularYMostrar() {
        try {
           
            String nombre = txtNombre.getText();
            double salarioPorHora = Double.parseDouble(txtSalarioPorHora.getText());
            int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());

           
            Empleado empleado = new Empleado(nombre, salarioPorHora, horasTrabajadas);

            
            txtOutput.setText(empleado.mostrarDatos());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, ingrese datos válidos.",
                                          "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazEmpleado());
    }
}
