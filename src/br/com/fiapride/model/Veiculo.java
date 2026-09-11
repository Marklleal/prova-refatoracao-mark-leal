package br.com.fiapride.model;

public class Veiculo {
    private String motorista;
    private String placa;
    private double combustivel;

    public Veiculo(String motorista, String placa, double combustivel) {
        setMotorista(motorista);
        setPlaca(placa);
        setCombustivel(combustivel);
    }

    public void abastecer(int litros) {
        setCombustivel(litros);
    }

    public void consumir(double litros) {
        if (litros < 0.0) {
            System.out.println("Não é possível fazer consumo negativo do combustível!");
        } else if (litros > getCombustivel()) {
            System.out.println("Não é possível consumir mais do que há de combustível no tanque!");
        } else {
            combustivel -= litros;
        }
    }

    public String getMotorista() {
        return this.motorista;
    }

    // private justificado para que haja apenas criação do nome inicialmente pelo construtor
    private void setMotorista(String nome) {
        this.motorista = nome;
    }

    public double getCombustivel() {
        return this.combustivel;
    }

    // Setters são os únicos métodos de alteração de valores dos atributos, por isso a validação é primordialmente necessária dentro deles
    // private justificado por usuário usar apenas abastecer()
    private void setCombustivel(double litros) {
        if (litros < 0.0 && this.combustivel == 0) {
            System.out.println("Não é possível abastecer um carro com valores negativos!\nValor não alterado!");
        }
        else if (litros < 0.0) {
            System.out.println("Não é possível abastecer um carro com valores negativos!\nValor settado para 0!");
            this.combustivel = 0.0;
        } else {
            this.combustivel += litros;
        }
    }

    public String getPlaca() {
        return this.placa;
    }

    // private justificado por placa ser invariante após o cadastro
    private void setPlaca(String identificador) {
        this.placa = identificador;
    }
}
