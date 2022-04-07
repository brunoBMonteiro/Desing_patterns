package comportamentais.observer3;

public class Main {
    public static void main(String args[]) {

        PublicFigure bruno_m = new PublicFigure("Bruno Monteiro", "BMonteiro");

        PublicFigure daniel_z = new PublicFigure("Daniel Zancheta", "DZancheta");

        Follower pedro_hubner = new Follower("Pedro Hubner");

        Follower tomas_fichtner = new Follower("Tomás Fichtner");


        bruno_m.addSubscriber(pedro_hubner);

        daniel_z.addSubscriber(tomas_fichtner);


        bruno_m.tweet("Bem vindos amigos!");

        daniel_z.tweet("Bem vindos amigos!");


        bruno_m.tweet("Quero café");
        daniel_z.tweet("Bom dia para quem ?");

    }

}