package org.example.domain;

import java.time.LocalDate;
import java.util.Scanner;

public class Cadastro {

    private String nome;
    private int idade;
    private LocalDate dataNascimento;
    private String email;
    private String senha;

    public Cadastro() {
    }

    public Cadastro(String nome, int idade, LocalDate dataNascimento, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }

    public void cadastrarPaciente(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("INFORME SEUS DADOS:");

        System.out.println("Insira o nome: ");
        this.nome = scanner.nextLine();

        System.out.println("Insira sua idade: ");
        this.idade = scanner.nextInt();

        System.out.println("Insira sua data de nascimento (yyyy-MM-dd): ");
        this.dataNascimento = LocalDate.parse(scanner.next());

        System.out.println("Insira seu e-mail: ");
        this.email = scanner.next();

        System.out.println("Insira sua senha: ");
        this.senha = scanner.next();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}