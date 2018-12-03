package com.company.z_my_diy_status_machine.section2;

import java.util.Scanner;

/**
 * Created by liukx on 2018-12-03.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("请输入操作:");
        Scanner scanner = new Scanner(System.in);
        IPlayer player = new VideoPlayer();
        int i=-1;
        while ((i=(scanner.nextInt())) != -1){
            player.request(i);
        }
    }
}
