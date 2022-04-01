package criacionais.prototypeexemple;

import criacionais.prototypeexemple.cache.BundledShapeCache;
import criacionais.prototypeexemple.shapes.Shape;

public class Demo {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Grande círculo verde");

        Shape shape2 = cache.get("Retângulo azul médio");
        Shape shape3 = cache.get("Retângulo azul médio");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Grande círculo verde != Retângulo azul médio (yay!)");
        } else {
            System.out.println("Grande círculo verde == Retângulo azul médio (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Retângulos azuis médios são dois objetos diferentes (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("E são idênticos (yay!)");
            } else {
                System.out.println("Mas eles não são idênticos (booo!)");
            }
        } else {
            System.out.println("Objetos retangulares são iguais (booo!)");
        }
    }
}