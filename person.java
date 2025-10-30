
package com.sudip.com.inheritence;


public class person {
    private String name;
    private int age;
    
    void setinfo(String n, int a){
        name = n;
        age = a;
    }
    
    void showinfo(){
        System.out.println(name);
        System.out.println(age);
    }
}
