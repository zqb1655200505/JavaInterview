package com.zqb.deepClone;

import java.io.IOException;

/**
 * Created by zqb on 2019/3/23.
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Role role=new Role();
        role.setRoleName("adminUser");
        User user=new User();
        user.setAge(22);
        user.setRole(role);
        user.setUserName("zqb");


        //测试浅拷贝，修改拷贝对象的非基础类型属性会影响原对象，修改基础类型属性不会影响原对象
//        User userClone=user.clone();
//        userClone.getRole().setRoleName("plainUser");
//        userClone.setAge(20);
//        System.out.println(user.getRole().getRoleName());
//        System.out.println(user.getAge());

        //测试深度拷贝
        User userDeepClone=user.deepClone();
        userDeepClone.getRole().setRoleName("plainUser");
        userDeepClone.setAge(20);
        System.out.println(user.getRole().getRoleName());
        System.out.println(user.getAge());
    }
}
