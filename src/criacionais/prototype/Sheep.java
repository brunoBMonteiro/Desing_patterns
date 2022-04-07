package criacionais.prototype;

public class Sheep implements Animal {

    public Sheep(){
        System.out.println("A ovelha está feita");
    }

    public Animal makeCopy() {
        System.out.println("Ovelhas estão sendo feitas");
        Sheep sheepObject = null;
        try {
            /*
                Chama as superclasses Animal clone()
                Em seguida, lança os resultados para ovelhas
             */
            sheepObject = (Sheep) super.clone();
        }
        /*
            Se Animal não estendeu Cloneable este erro
            é jogado
         */
        catch (CloneNotSupportedException e) {
            System.out.println("A ovelha foi transformada em mingau");
            e.printStackTrace();
        }
        return sheepObject;
    }

    public String toString(){
        return "Dolly é meu herói, Baaaaa";
    }

}
