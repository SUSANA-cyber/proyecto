import java.util.Scanner;

public class TotalPrecio{

public static void main(String [] args){

Scanner scanner = new Scanner(System.in);

double precio,totalDescuento,precioFinal;
final double iva = 0.12;
final double descuento = 0.20;

System.out.print("muestre la cantidad a cobrar: ");
precio = scanner.nextDouble();

totalDescuento = precio * (1-0.20);
//mostrar el monto final del descuento
//descunto final 
//fin codigo
precioFinal = totalDescuento * (0.12);

System.out.println("Precio descuento:" + totalDescuento);

System.out.println("Precio final con IVA:" + precioFinal);
}
}