package com.badmitrii;

public class Main 
{
    private int a = 10; 
    
    public static void main( String[] args )
    {
        Main instance = new Main();
        Api apiInstance = new Api();
        System.out.println(instance.test());
        System.out.println(apiInstance.test());
    }

    public int test(){
        return a;
    }
}