package typeInformation.dynamicProxy;

import typeInformation.proxy.ProxiedInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yanliang
 */
public class MyInvocationHandler implements InvocationHandler{
    private ProxiedInterface proxiedObj;

    public MyInvocationHandler(ProxiedInterface proxiedObj) {
        this.proxiedObj = proxiedObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invocation class:"+proxy.getClass().getName()+",method:"+method.getName()+",args:"+args);
        if (args != null)
            for (Object o : args)
                System.out.println(" "+o);

        return method.invoke(proxiedObj,args);
    }
}
