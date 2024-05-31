package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster denemeCanavar=new Troll("Test Canavarı",5000,75);
        System.out.println(denemeCanavar);
        printAttackResult(denemeCanavar);
    }

    private static void printAttackResult(Monster monster) {
        System.out.println("Attack result of: "+monster.getName()+": "+monster.attack());
    }
}
