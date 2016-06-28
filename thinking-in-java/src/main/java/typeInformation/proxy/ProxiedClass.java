package typeInformation.proxy;

/**
 * @author yanliang
 */
public class ProxiedClass implements ProxiedInterface{
    @Override
    public void doSomething() {
        System.out.println("proxied do something!");
    }

    @Override
    public void somethingElse(String args) {
        System.out.println("proxied do something else "+args+"!");
    }
}
