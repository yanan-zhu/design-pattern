package structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class AnimalProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public AnimalProxyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        System.out.println("animalProxy start:");

        Object result = method.invoke(target, args);

        System.out.println("animalProxy end");

        return result;
    }

    public Object getProxy() {

        ClassLoader loader = Thread.currentThread().getContextClassLoader();


        Class<?>[] interfaces = target.getClass().getInterfaces();

        return Proxy.newProxyInstance(loader, interfaces, this);

    }


}
