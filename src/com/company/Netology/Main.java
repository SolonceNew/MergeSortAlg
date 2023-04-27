package com.company.Netology;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[][] regionalTeams = {{45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1}, {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}};

        System.out.println("~~~~~ NATIONAL TEAM ~~~~~");
        System.out.println(Arrays.toString(nationalTeam(regionalTeams)));

    }

    public static int countNationalTeam = 10;

    public static int[] merge(int[] t1, int[] t2) {
        int[] t = new int[countNationalTeam];
        int iT1 = 0;
        int iT2 = 0;
        int iT = 0;

        while (iT < t1.length) {
            if (iT1 == t1.length || t2[iT2] >= t1[iT1]) {
                t[iT++] = t2[iT2++];

            } else {
                t[iT++] = t1[iT1++];
            }

        }
        return t;
    }

    public static int[] nationalTeam(int[][] regionalTeams) {
        int[] nationalTeam = regionalTeams[0];
        for (int i = 1; i < regionalTeams.length; i++) {
            nationalTeam = merge(nationalTeam, regionalTeams[i]);
        }

        return nationalTeam;
    }
}
