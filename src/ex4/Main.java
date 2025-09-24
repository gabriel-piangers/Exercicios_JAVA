package ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MeioTransporte> veiculos = new ArrayList<>();
        veiculos.add(new Carro("BYD Seal"));
        veiculos.add(new Bicicleta("BMX"));
        veiculos.add(new Trem("Trem a carvão"));

        for(MeioTransporte veiculo : veiculos) {
            System.out.println("========= " + veiculo.getModelo() + " =========") ;
            veiculo.acelerar();
            veiculo.acelerar();
            veiculo.frear();
            veiculo.acelerar();
            veiculo.acelerar();
            veiculo.acelerar();
            veiculo.acelerar();
            veiculo.acelerar();
            veiculo.acelerar();
            veiculo.frear();
            veiculo.frear();
            veiculo.frear();
            veiculo.frear();
            veiculo.frear();
            veiculo.frear();
            System.out.println();
        }

    }
}
