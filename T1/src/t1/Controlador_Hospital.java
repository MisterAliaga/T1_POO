/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UCB10202
 */
public class Controlador_Hospital {
    private List<Paciente> listaPacientes = new ArrayList<>();

    public void agregarPaciente(Paciente n_paciente) {
        listaPacientes.add(n_paciente);
        System.out.println("Paciente Registrado con éxito");
    }

    public Paciente buscarPorId(String dni) {
        for (Paciente p : listaPacientes) {
            if (p.getNmr_doc().equalsIgnoreCase(dni)) return p;
        }
        return null;
    }

    public void listarPacientes() {
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
            return;
        }
        for (Paciente p : listaPacientes) {
            System.out.println(p); 
        }
    }
}

