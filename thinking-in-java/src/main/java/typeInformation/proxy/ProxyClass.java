package typeInformation.proxy;

/**
 * @author yanliang
 */
public class ProxyClass extends ProxiedClass{

    private ProxiedClass proxiedClass;

    public ProxyClass(ProxiedClass proxiedClass) {
        this.proxiedClass = proxiedClass;
    }

    @Override
    public void doSomething() {
        System.out.println("proxy do something!");
        proxiedClass.doSomething();
    }

    @Override
    public void somethingElse(String args) {
        System.out.println("proxy do something else "+args+"!");
        proxiedClass.somethingElse(args);
    }

}
