package aplicacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author HP
 */


public class Principal {

    public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
		String numeroPlaca = "";
		    
  
		  
		  
		  
		    System.out.print("Ingrese el número de placa: ");
		     numeroPlaca = scanner.nextLine();

		    if (buscarVehiculoPorPlaca(numeroPlaca) != null) {
		        System.out.println("Ya existe un vehículo registrado con esa placa. No se puede registrar.");
		        return;
		    }
		    
		    
		    
		    
		    
		    else {
		            System.out.println("La placa " + numeroPlaca + " no es valida");
		        }
		    System.out.print("Ingrese la marca del vehículo: ");
		    String marca = scanner.nextLine();

		    System.out.print("Ingrese la línea del vehículo: ");
		    String linea = scanner.nextLine();

		    System.out.print("Ingrese el modelo del vehículo: ");
		    String modelo = scanner.nextLine();

		    System.out.print("Ingrese el color del vehículo: ");
		    String color = scanner.nextLine();

		    System.out.print("Ingrese el NIT del propietario: ");
		    String nitPropietario = scanner.nextLine();

		    System.out.print("Ingrese el estado del registro (1 = Activo, 2 = Inactivo): ");
		    int estado = scanner.nextInt();

		    try {
		        FileWriter fileWriter = new FileWriter("vehiculos.txt", true);
		        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		      try (PrintWriter printWriter = new PrintWriter(bufferedWriter)) {
		          printWriter.println(numeroPlaca + "," + marca + "," + linea + "," + modelo + "," + color + "," + nitPropietario + "," + estado);
		      }
		        System.out.println("Vehículo registrado correctamente.");
		    } catch (IOException e) {
		        System.out.println("Error al registrar el vehículo: " + e.getMessage());
		    }
	}
    
  }  
    private static String buscarVehiculoPorPlaca(String numeroPlacaBuscar) {
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader("vehiculos.txt"))) {
                String currentLine;
                
                while ((currentLine = reader.readLine()) != null) {
                    String[] vehiculoData = currentLine.split(",");
                    String numeroPlaca = vehiculoData[0];
                    
                    if (numeroPlaca.equals(numeroPlacaBuscar)) {
                        reader.close();
                        return currentLine;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al buscar el vehículo: " + e.getMessage());
        }

        return null;
    }
}




