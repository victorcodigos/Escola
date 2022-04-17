package com.company;

public class Funcionario implements Salario {

    private String departamento;

    double calculadora() {
        float valorDia = 10;
        return valorDia * 10;
    }

    @Override
    public void salario() {

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
