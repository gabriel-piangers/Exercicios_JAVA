package ex4;

public class Trem implements MeioTransporte{
    private int velocidade = 0;
    private int velocidadeMax = 250;
    private int aceleracao = 50;
    private String modelo;

    public Trem(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void acelerar() {
        if(this.velocidade + this.aceleracao > velocidadeMax) {
            this.velocidade = velocidadeMax;
            System.out.println("Trem atingiu a velocidade máxima de " + velocidadeMax);
        } else {
            this.velocidade += this.aceleracao;
            System.out.println("Trem acelerado para "+this.velocidade+"km/h" );
        }
    }

    public void frear() {
        if(this.velocidade == 0) {
            System.out.println("O trem já está parado.");
        } else if (this.velocidade == 0) {
            System.out.println("O trem ja esta parado");
        } else if(this.velocidade - this.aceleracao <= 0) {
            this.velocidade = 0;
            System.out.println("O trem parou.");
        } else {
            this.velocidade -= this.aceleracao;
            System.out.println("Trem freiou para "+this.velocidade+"km/h" );
        }
    }

    public int getVelocidade() {
        return this.velocidade;
    }
}
