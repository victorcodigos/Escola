package com.company;

public class Professor  extends Pessoas implements Salario {

    private String matricula;
    private float valorDia;



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }

    @Override
    public void salario() {

    }
}
