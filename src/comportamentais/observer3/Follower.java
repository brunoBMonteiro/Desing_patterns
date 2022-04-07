package comportamentais.observer3;

// Concrete Subscriber
public class Follower implements Observer {

    protected String name;

    public Follower(String name) {

        super();
        this.name = name;

    }

    @Override
    public void notification(String handle, String tweet) {
        System.out.printf("'%s' recebeu notificação de Handle: '%s', Tweet: '%s'\n", name, handle, tweet);
    }
}
