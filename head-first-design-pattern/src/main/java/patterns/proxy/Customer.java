package patterns.proxy;

/**
 * @author yanliang
 */
public class Customer {

    private Boss boss;

    public void chatWith(){
        boss.chat();
    }
}
