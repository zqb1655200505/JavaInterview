package com.zqb.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by zqb on 2019/3/21.
 *
 *
 *           详细解答参照：  http://www.cnblogs.com/gonjan-blog/p/6685611.html
 *
 *
 */
public class Test {


    public static void main(String[] args)
    {
        //创建一个实例对象，这个对象是被代理的对象
        Person zhangsan = new Student("张三");

        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler stuHandler = new StudentInvocationHandler<Person>(zhangsan);

        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class<?>[]{Person.class}, stuHandler);

        //代理执行被代理类的方法

        stuProxy.eatFood();//测试午无参无返回值

        stuProxy.setWeight(123);//测试有参无返回值

        stuProxy.getWeight();//测试无参有返回值
    }
}
