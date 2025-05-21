import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String x = JOptionPane.showInputDialog("Ingrese el primer número: ");
        float num1 = Float.parseFloat(x);
        String y = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        float num2 = Float.parseFloat(y);
        String z = JOptionPane.showInputDialog("Ingrese el tercer número: ");
        float num3 = Float.parseFloat(z);

        float promedio = (num1 + num2 + num3) / 3;
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        System.out.println("Hola " + nombre + ", Bienvenido.");

        System.out.println("El promedio es" + " = " + promedio);
        JOptionPane.showMessageDialog(null, "El promedio es" + " = " + promedio);
        
    }
}
