package ex4;

public class Bicicleta implements MeioTransporte {
    private int velocidade = 0;
    private int velocidadeMax = 60;
    private int aceleracao = 10;
    private String modelo;

    public Bicicleta(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void acelerar() {
        if(this.velocidade + this.aceleracao > velocidadeMax) {
            this.velocidade = velocidadeMax;
            System.out.println("Bicicleta atingiu a velocidade máxima de " + velocidadeMax);
        } else {
            this.velocidade += this.aceleracao;
            System.out.println("Bicicleta acelerado para "+this.velocidade+"km/h" );
        }
    }

    public void frear() {
       if (this.velocidade == 0) {
            System.out.println("A bicicleta ja esta parada");
        } else if(this.velocidade - this.aceleracao <= 0) {
            this.velocidade = 0;
            System.out.println("A bicicleta parou.");
        } else {
            this.velocidade -= this.aceleracao;
            System.out.println("Bicicleta freiou para "+this.velocidade+"km/h" );
        }
    }

    public int getVelocidade() {
        return this.velocidade;
    }
}
