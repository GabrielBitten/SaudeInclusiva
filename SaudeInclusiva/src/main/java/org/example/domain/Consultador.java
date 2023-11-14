package org.example.domain;

public interface Consultador {


    public abstract void definirMedico(); //Baseado no equipamento que o paciente deseja, o sistema define um especialista.

    public abstract void imprimirDetalhes();
}
