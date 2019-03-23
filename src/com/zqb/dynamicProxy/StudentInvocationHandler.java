package com.zqb.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zqb on 2019/3/21.
 * 每个需要代理的类均需要实现自己的InvocationHandler
 */
public class StudentInvocationHandler<T> implements InvocationHandler {


    //invocationHandler持有的被代理对象
    T target;

    public StudentInvocationHandler(T target) {
        this.target = target;
    }



    /**
     * proxy:代表动态代理对象
     * method：代表正在执行的方法
     * args：代表调用目标方法时传入的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String methodName=method.getName();
        System.out.println("方法名为："+methodName);
        //判断不同的方法实现不同操作
        if(methodName.equals("eatFood"))
        {
            System.out.println("执行代理方法之前eatFood");
        }
        else if(methodName.equals("setWeight"))
        {
            System.out.println("执行代理方法之前setWeight，参数为" + (int)args[0]);
        }
        else if(methodName.equals("getWeight"))
        {
            System.out.println("执行代理方法之前getWeight");
        }

        //代理方法方法返回值，具体类型根据被代理对象方法来确定，无返回值的默认返回null
        Object result = method.invoke(target, args);

       if(methodName.equals("getWeight"))
        {
            System.out.println("执行代理方法之后getWeight，重量为"+ (int) result);
        }


        return result;
    }
}
