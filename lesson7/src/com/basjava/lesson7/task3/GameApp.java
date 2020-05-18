package com.basjava.lesson7.task3;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class GameApp {
    public static void main(String[] args) {

        boolean flag = false;
        do {
            int playerNum = Scanner.getPlayers();

            Game game = new Game(playerNum, 6);

            Set<Integer> wonNumbers = game.generateNumbers();
            Map<Integer, Player> players = game.generatePlayer();
            Player selectedPlayer = Scanner.selectPlayer(players);

            Optional<Player> wonPlayer = game.getWonPlayer(wonNumbers, players);
            if (wonPlayer.isPresent()) {
                if (wonPlayer.get().getNumber() == selectedPlayer.getNumber()) {
                    System.out.println("Вы выйграли! " + selectedPlayer.getNumber());
                } else {
                    System.out.println("Вы проиграли!");
                    System.out.println("Выйграл Игрок " + wonPlayer.get().getNumber() +  " -числа " + selectedPlayer.getNumbers());
                    if (playGameAgain() == 1) {
                        flag = true;
                    } else {
                        break;
                    }
                }
            } else {
                System.out.println("Вы проиграли!");
                System.out.println("Выигравших игроков нет");
                if (playGameAgain() == 1) {
                    flag = true;
                } else {
                    break;
                }
            }
        } while (flag);
    }

    private static int playGameAgain(){
        System.out.println("Хотите сыграть еще?");
       return Scanner.getOperation();
    }
}