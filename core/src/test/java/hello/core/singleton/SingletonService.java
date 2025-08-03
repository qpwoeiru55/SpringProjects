package hello.core.singleton;

public class SingletonService {


    private static final SingletonService instnace = new SingletonService();

    private SingletonService() {
    }

    public static SingletonService getInstance(){
        return instnace;
    }
}
