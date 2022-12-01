package model;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {

//        Cliente cli = new Cliente(LocalDate.now(), "Caio", "1234", "5678", "Ali", "19060", "39911615", "usuario@usuario.com", 1, LocalDate.now());

//        model.Cliente cliente = new model.Cliente();
//        cliente.cadastroCliente(LocalDate.now(), "Caio", "12345", "5678", "Ali", "19060", "39911615", "usuario@usuario.com", 1, LocalDate.now());
//        cliente.mostrarClientes();

//        model.Corretor corretor = new model.Corretor();
//        corretor.cadastroCorretor("qwer",
//                "129081921",
//                1234.5f,
//                LocalDate.now(),
//                "caio",
//                "47448936751",
//                "551786509",
//                "jardim das rosas",
//                "123123",
//                "1897662532",
//                "caio@caio.com",
//                1,
//                LocalDate.now());

//        model.Imovel imovel = new model.Imovel();
//        imovel.cadastroImovel("caetano lopes",
//                12345.6f,
//                1234.8f,
//                34.6f,
//                89.5f,
//                789.4f,
//                1,
//                3,
//                2,
//                2,
//                LocalDate.now());

        model.Seguro seguro = new model.Seguro();
        seguro.cadastroSeguro(
                1,
                "seguradora1",
                "tipo",
                "seguradora pequena",
                1234.5f
        );
    }
}
