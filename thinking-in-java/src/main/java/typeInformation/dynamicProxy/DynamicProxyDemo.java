package typeInformation.dynamicProxy;

import typeInformation.proxy.ProxiedClass;
import typeInformation.proxy.ProxiedInterface;
import typeInformation.proxy.SimpleProxyDemo;

import java.lang.reflect.Proxy;

/**
 * @author yanliang
 */
public class DynamicProxyDemo {

    public static void main(String[] args) {
        ProxiedInterface proxy = (ProxiedInterface)Proxy.newProxyInstance(DynamicProxyDemo.class.getClassLoader(),
                new Class[]{ProxiedInterface.class},
                new MyInvocationHandler(new ProxiedClass()));

        SimpleProxyDemo.consumer(proxy);
    }
}
