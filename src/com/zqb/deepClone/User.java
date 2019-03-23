package com.zqb.deepClone;

import java.io.*;

/**
 * Created by zqb on 2019/3/23.
 */
public class User implements Serializable,Cloneable {


    private String userName;

    private int age;

    private Role role;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    //浅复制
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }


    //深复制
    public User deepClone() throws IOException,ClassNotFoundException
    {

        //将对象以字节流方式写入流中
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        //从流中读取对象流
        ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
        User user=(User) objectInputStream.readObject();

        return user;
    }
}
