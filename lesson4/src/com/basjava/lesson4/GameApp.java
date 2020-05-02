package com.basjava.lesson4;

import com.basjava.lesson4.util.GameUtil;
import com.basjava.lesson4.util.ScannerUtil;

public class GameApp {
    public static void main(String[] args) {

        boolean flag = false;
        do{
            int playerNum = ScannerUtil.getPlayers();
            Player[] players = GameUtil.generatePlayer(playerNum);
            Player player = ScannerUtil.selectPlayer(players);
            boolean result = GameUtil.compareResult(player);
            if (result) {
                System.out.println("Вы выйграли! " + player.getNumber());
            } else {
                System.out.println("Вы проиграли!");
                System.out.println("Хотите сыграть еще?");
                int operation = ScannerUtil.getOperation();
                if (operation == 1) {
                    flag = true;
                } else {
                    break;
                }
            }
        } while (flag);
    }

}