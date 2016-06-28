package typeInformation.proxy;

/**
 * @author yanliang
 */
public class SimpleProxyDemo {

    public static void consumer(ProxiedInterface obj){
        obj.doSomething();
        obj.somethingElse("HI");
    }

    public static void main(String[] args) {
        consumer(new ProxiedClass());
        consumer(new ProxyClass(new ProxiedClass()));
    }
}
