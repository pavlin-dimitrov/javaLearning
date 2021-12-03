package com.company;

public class TaskOne {
    public static void main(String[] args) {
        int capacity = 35001;
        boolean hasLights = false;

        boolean StadiumGroupA = capacity >= 35000 || hasLights;

        System.out.println(StadiumGroupA ? "This Stadium has License for Group A" : "This Stadium is not ready for Group A games");
    }
}
