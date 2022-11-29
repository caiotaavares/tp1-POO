package model;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {

//        Cliente cli = new Cliente(LocalDate.now(), "Caio", "1234", "5678", "Ali", "19060", "39911615", "usuario@usuario.com", 1, LocalDate.now());

        model.Cliente cliente = new model.Cliente();
        cliente.cadastroCliente(LocalDate.now(), "Caio", "1234", "5678", "Ali", "19060", "39911615", "usuario@usuario.com", 1, LocalDate.now());
        cliente.mostrarClientes();
    }
}
