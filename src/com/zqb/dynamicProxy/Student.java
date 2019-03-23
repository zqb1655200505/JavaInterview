package com.zqb.dynamicProxy;

/**
 * Created by zqb on 2019/3/21.
 */
public class Student implements Person {


    private String name;

    private int weight;

    public Student(String name)
    {
        this.name=name;
    }


    @Override
    public void eatFood() {
        System.out.println("代理方法执行中..."+ name +" 经常吃汉堡" );
    }

    @Override
    public int getWeight()
    {
        if(weight!=0)
        {
            System.out.println("代理方法执行中..."+name+" 重量为 "+weight+" kg");
            return weight;
        }
        else
        {
            System.out.println("代理方法执行中..."+name+" 重量为默认值 100 kg");
            return 100;
        }


    }

    @Override
    public void setWeight(int weight) {
        System.out.println("代理方法执行中..."+"设置重量为 "+weight+" kg");
        this.weight=weight;
    }
}
