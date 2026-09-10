package br.com.fiapride.main;

import br.com.fiapride.model.veiculos;

public class principal {
    public static void main(String[] args) {
        veiculos v1 = new veiculos();

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
