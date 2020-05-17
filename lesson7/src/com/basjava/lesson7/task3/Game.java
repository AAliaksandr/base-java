package com.basjava.lesson7.task3;

import java.util.*;

public class Game {

    private int numberOfPlayers;
    private int quantityOfLotteryNumber;

    public Game(int numberOfPlayers, int quantityOfLotteryNumber) {
        this.numberOfPlayers = numberOfPlayers;
        this.quantityOfLotteryNumber = quantityOfLotteryNumber;
    }

    public Map<Integer, Player> generatePlayer() {
        Map<Integer, Player> players = new HashMap<>();
        int counter = 1;
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player(counter, generateNumbers());
            players.put(counter, player);
            counter++;
        }
        return players;
    }

    public Set<Integer> generateNumbers() {
        Set<Integer> nums = new HashSet<>();
        while (nums.size() != quantityOfLotteryNumber) {
            int randomNumber = (int) (Math.random() * 10);
            nums.add(randomNumber);
        }
        return nums;
    }

    public Optional<Player> getWonPlayer(Set<Integer> wonNums, Map<Integer, Player> players) {
        return players.values()
                .stream()
                .filter(player -> wonNums.containsAll(player.getNumbers()))
                .findAny();
    }
}
