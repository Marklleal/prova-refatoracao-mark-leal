package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        veiculos veiculo1 = new veiculos("Carlos", "ABC-1234", -10);

        v1.individuo = "Carlos";
        v1.pl = "ABC-1234";
        v1.gas = -10; // PERIGO: Valores negativos permitidos!

        v1.adicionar(50);
        v1.gasta(100); // PERIGO: Consome mais que o disponível!

        System.out.println(
            "Dono: " + v1.individuo +
            " | Placa: " + v1.pl +
            " | Gasolina: " + v1.gas
        );
    }
}
