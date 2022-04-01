package criacionais.prototype;

public class CloneFactory {

     /*
        Recebe qualquer subclasse Animal ou Animal e
        faz uma cópia dele e o armazena em seu próprio
        localização na memória
      */

     /*
        cloneFactory não tem ideia do que são esses objetos
        exceto que eles são subclasses de Animal
      */

    public Animal getClone(Animal animalSample) {

        /*
            Por causa do polimorfismo, o Sheeps makeCopy()
            é chamado aqui em vez de Animais
         */

        return animalSample.makeCopy();

    }

}
