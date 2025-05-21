import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String x = JOptionPane.showInputDialog("Ingrese el primer número: ");
        int num1 = Integer.parseInt(x);
        String y = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        int num2 = Integer.parseInt(y);
        String z = JOptionPane.showInputDialog("Ingrese el tercer número: ");
        int num3 = Integer.parseInt(z);

        float promedio = (num1 + num2 + num3) / 3;
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        System.out.println("Hola " + nombre + ", Bienvenido.");

        System.out.println("El promedio es" + " = " + promedio);
        JOptionPane.showMessageDialog(null, "El promedio es" + " = " + promedio);
        
    }
}
