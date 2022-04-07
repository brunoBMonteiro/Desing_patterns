package criacionais.prototype;

public class TestCloning {

    public static void main(String[] args){
        /*
            Manipula o roteamento de chamadas do método makeCopy para o
            subclasses direitas de Animal
         */
        CloneFactory animalMaker = new CloneFactory();
        // Cria uma nova instância Sheep
        Sheep sally = new Sheep();
        /*
            Cria um clone de Sally e o armazena em seu próprio
            localização da memória
         */
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        // Estas são cópias exatas umas das outras
        System.out.println(sally);
        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println(clonedSheep);
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));

    }

}
