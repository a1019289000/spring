package com.chen;

import static org.junit.Assert.assertTrue;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void x(){
        System.out.println(shouldAnswerWithTrue());
    }
    public String shouldAnswerWithTrue()
    {
        try{
            return "xx";
        }finally {
            return "nn";
        }
    }
    @Test
    public void json(){
        B b1=new B();
        b1.b=100;
        A aaa=new A();
        aaa.a=111;
        b1.aa=aaa;
        String s=JSONObject.toJSONString(b1);
        System.out.println(s);
        B bb=JSONObject.parseObject(s,B.class);
        System.out.println(bb);
        System.out.println(bb.b);
        System.out.println(bb.aa.a);
    }
}
class A{
    public int a;
}
class B{
    public int b;
    public A aa;
}