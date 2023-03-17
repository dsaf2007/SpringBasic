package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService(); //클래스 레벨에 존재하게 되어 단 한개만 존재함.

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {}

    public void logig() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
