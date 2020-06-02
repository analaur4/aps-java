package com.company;

import Entities.JsonHandler;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        JsonHandler teste = new JsonHandler();
        JSONObject a = teste.nextScene("2");
        System.out.println(a);
    }
}
