package com.example.crudconsole;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.example.crudconsole.entity.Cliente;
import com.example.crudconsole.repository.ClienteRepository;

@SpringBootApplication
public class CrudConsoleApplication implements CommandLineRunner {

    @Autowired
    private ClienteRepository repositoryCliente;

    public static void main(String[] args) {
        SpringApplication.run(CrudConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola Mundo!!!");
        createCliente();
    }

    @Transactional
    public void createCliente() throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Numero de documento");
        String numeroDocumento = scanner.nextLine();

        System.out.println("Escriba su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Escriba su apellido");
        String apellido = scanner.nextLine();

        System.out.println("Escriba su Nacionalidad");
        String nacionalidad = scanner.nextLine();

        System.out.println("Ingrese fecha de nacimiento (yyyy-MM-dd)");
        String fechaNacimiento = scanner.nextLine();
        SimpleDateFormat dNacimiento = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = dNacimiento.parse(fechaNacimiento);

        System.out.println("Ingrese 1: femenino, 2: masculino");
        Integer genero = scanner.nextInt();
        scanner.nextLine();  // Consume the remaining newline

        System.out.println("Ingrese direccion:");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese comuna");
        String comuna = scanner.nextLine();

        System.out.println("Email:");
        String email = scanner.nextLine();

        System.out.println("Telefono:");
        String telefono = scanner.nextLine();

        System.out.println("Ingrese password");
        String password = scanner.nextLine();

        System.out.println("Tipo de documento 1: cedula de identidad 2: pasaporte");
        Integer tipoDocumento = scanner.nextInt();
        scanner.nextLine();  // Consume the remaining newline

        scanner.close();

        Cliente cliente = new Cliente(null, numeroDocumento, nombre, apellido, nacionalidad, fecha, genero, direccion, comuna, email, telefono, password);

        repositoryCliente.save(cliente);

        System.out.println("Cliente creado con éxito: " + cliente);
    }
}

}
