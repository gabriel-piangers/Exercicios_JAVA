package ex4;

public class Carro implements MeioTransporte{
    private int velocidade = 0;
    private int velocidadeMax = 120;
    private int aceleracao= 20;
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void acelerar() {
        if(this.velocidade + this.aceleracao > velocidadeMax) {
            this.velocidade = velocidadeMax;
            System.out.println("Carro atingiu a velocidade máxima de " + velocidadeMax);
        } else {
            this.velocidade += this.aceleracao;
            System.out.println("Carro acelerado para "+this.velocidade+"km/h" );
        }
    }

    public void frear() {
        if (this.velocidade == 0) {
            System.out.println("O carra ja esta parado.");
        } else if(this.velocidade - this.aceleracao <= 0) {
            this.velocidade = 0;
            System.out.println("O carro parou.");
        } else {
            this.velocidade -= this.aceleracao;
            System.out.println("Carro freiou para "+this.velocidade+"km/h" );
        }
    }

    public int getVelocidade() {
        return this.velocidade;
    }
}
