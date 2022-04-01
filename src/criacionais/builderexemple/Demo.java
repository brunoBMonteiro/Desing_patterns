package criacionais.builderexemple;

import criacionais.builderexemple.builders.CarBuilder;
import criacionais.builderexemple.builders.CarManualBuilder;
import criacionais.builderexemple.cars.Car;
import criacionais.builderexemple.cars.Manual;
import criacionais.builderexemple.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        /*
            O diretor obtém o objeto construtor concreto do cliente
            (código do aplicativo). Isso porque o aplicativo sabe melhor qual
            construtor para usar para obter um produto específico.
         */
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);


         /*
            O produto final geralmente é recuperado de um objeto construtor, pois
            Diretor não tem conhecimento e não depende de construtores concreto e
            produtos.
          */
        Car car = builder.getResult();
        System.out.println("Carro construído:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // O diretor pode conhecer várias receitas de construção.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCarro manual construido:\n" + carManual.print());
    }
}
