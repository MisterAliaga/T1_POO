/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UCB10202
 */
public class T1 {
    static java.util.ArrayList<Paciente> listaPacientes = new java.util.ArrayList<>();
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String op;
        do {
            System.out.println("\n--- SISTEMA HOSPITAL XYZ ---");
            System.out.println("1. Registrar Paciente");
            System.out.println("2. Modificar Correo");
            System.out.println("3. Listar Todo");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");
            
            op = sc.nextLine();

            switch (op) {
                case "1":
                    registrar();
                    break;
                case "2":
                    modificar();
                    break;
                case "3":
                    listar();
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!op.equals("4"));
    }

    // Método para agregar (Como pide tu rúbrica)
    public static void registrar() {
        Paciente p = new Paciente();
        
        while (true) {
            try {
                System.out.print("Ingrese DNI: ");
                p.setNmr_doc(sc.nextLine());
                break; // Si el ID está bien, sale del bucle
            } catch (Exception e) {
                
            }
        }

        while (true) {
            try {
                System.out.print("Nombre: ");
                p.setNombre_completo(sc.nextLine());
                break;
            } catch (Exception e) {
                
            }
        }

        while (true) {
            try {
                System.out.print("Correo: ");
                p.setCorreo(sc.nextLine());
                break;
            } catch (Exception e) {
                
            }
        }

        listaPacientes.add(p);
        System.out.println("Paciente guardado.");
    }

    public static void listar() {
        if (listaPacientes.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (Paciente p : listaPacientes) {
                System.out.println(p.toString());
            }
        }
    }
    
    public static void modificar() {
        System.out.print("ID del paciente a buscar: ");
        String buscar = sc.nextLine();
        
        for (Paciente p : listaPacientes) {
            if (p.getNmr_doc().equals(buscar)) {
                while (true) {
                    try {
                        System.out.print("Nuevo Correo: ");
                        p.setCorreo(sc.nextLine());
                        System.out.println("Actualizado.");
                        return; // Termina el método porque ya lo encontró
                    } catch (Exception e) {
                        
                    }
                }
            }
        }
        System.out.println("No se encontró ese ID.");
    }
    }
