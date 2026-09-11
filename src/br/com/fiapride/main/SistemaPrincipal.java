package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Carlos", "ABC-1234", -10);

        System.out.println("\n-------------------TESTE 1 (Criacao)--------------------------");
        System.out.println("Motorista: " + veiculo1.getMotorista() + " - Placa: " + veiculo1.getPlaca() + " - Gasolina: " + veiculo1.getCombustivel());

        System.out.println("\n-------------------TESTE 2 (Abastecer)------------------------");
        veiculo1.abastecer(100);
        System.out.println("Motorista: " + veiculo1.getMotorista() + " - Placa: " + veiculo1.getPlaca() + " - Gasolina: " + veiculo1.getCombustivel());

        System.out.println("\n-------------------TESTE 3 (Gastar Acima do Limite)-----------");
        veiculo1.consumir(150.0);
        System.out.println("Motorista: " + veiculo1.getMotorista() + " - Placa: " + veiculo1.getPlaca() + " - Gasolina: " + veiculo1.getCombustivel());

        System.out.println("\n-------------------TESTE 4 (Abastecer valor negativo)------------------------");
        veiculo1.abastecer(-10);
        System.out.println("Motorista: " + veiculo1.getMotorista() + " - Placa: " + veiculo1.getPlaca() + " - Gasolina: " + veiculo1.getCombustivel());
    }
}
