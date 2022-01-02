package cn.thenai.factory.factorymethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class PizzaStore {
    public static void main(String[] args) {
        String local = getLocal();
        if (Objects.equals(local, "bj")) {
            new BJOrderPizza();
        } else {
            new LDOrderPizza();
        }
    }

    public static String getLocal() {
        System.out.println("请输入您的就餐地点： bj or ld");
        String local = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            local = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return local;
    }
}