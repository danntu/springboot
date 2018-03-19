package com.logic.example.bean;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;

public class StaticMyBean{
    public String staticdoSmething(){
        Bag bag = new HashBag();
        bag.add("ONE",6);
        return  "Doing something in StaticMyBean"+
                "<br>"+bag;
    }
}
