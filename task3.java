package com.allevel.lesson05;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][3];
        int[][] newMas = new int[3][3];


        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = (int) (Math.random() * 90 + 1);
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("New array : ");

        //меняем
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                newMas[i][j] = twoDimArray[j][i];
                System.out.print(newMas[i][j] + " ");
            }
            System.out.println();
        }

    }





}