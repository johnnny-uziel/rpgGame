package game;


import characters.*;
//import characters.Character;
import util.Input;

import java.util.Random;
import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {
        String heroChoice = Input.getString("Welcome! Please select a hero(Warrior/Knight): ");
        Hero hero;

        if (heroChoice.equalsIgnoreCase("warrior")) {
            hero = new Warrior("Warrior");
        } else if (heroChoice.equalsIgnoreCase("knight")) {
            hero = new Knight("Knight");
        } else {
            hero = new Mage(2000, 150, "zappy boi aka Samuel Moore");
        }

        String enemyChoice = Input.getString("Select an enemy(Zombie/Dragon)");

        Enemy enemy;

        if (enemyChoice.equalsIgnoreCase("Zombie")) {
            enemy = new Zombie("Zombie");
        } else {
            enemy = new Dragon("Dragon");
        }


//        creates enemy dragon
//        Enemy dragon = new Dragon();
//        System.out.println("dragon appears! and attacks");
//        dragon.attack();
//        hero.defend();
//        hero.attack();


//        ---------IF STATEMENT FOR character1 rolls attack, character2 rolls for defend---------


        do {


            int heroRoll = hero.roll();
            int enemyRoll = enemy.roll();
            int attackResult = 0;
            int defendResult = 0;
            System.out.println("hero roll " + heroRoll);
            System.out.println("enem roll " + enemyRoll);

            if (heroRoll > enemyRoll) {
                System.out.println("------------------");
                System.out.println("hero hp before attack " + hero.getHp());
                System.out.println("hero attacks");
                attackResult = hero.getAttackDamage() - enemy.defend();
                System.out.println("attack res " + attackResult);
//            hero.compare(attackResult, hero.getDefense());
                hero.setHp(hero.getHp() - attackResult);
                System.out.println("hero's hp  " + hero.getHp());

            } else if (heroRoll == enemyRoll) {
                System.out.println("it's a tie");
            } else {
                System.out.println("------------------");
                System.out.println("before " + enemy.getHp());
                System.out.println("enemy attacks");
                attackResult = enemy.getAttackDamage() - hero.defend();
                System.out.println("attack res " + attackResult);
//            enemy.compare(attackResult, enemy.getDefense());
                enemy.setHp(enemy.getHp() - attackResult);
                System.out.println("after " + enemy.getHp());
            }
        } while (hero.getHp() > 0 && enemy.getHp() > 0);
//            if (heroRoll == 1) {
//                hero.attack();
//            } else {
//                hero.defend();
//            }
//
//            if (enemyRoll == 1) {
//                enemy.attack();
//            }else {
//                enemy.defend();
//            }
//
//        System.out.println("old Hp " + hero.getHp());
//
//        if (hero.compare(hero.getAttackDamage(), 160)) {
//            int remaining = hero.getHp() - hero.getAttackDamage();
//            hero.setHp(remaining);
//            System.out.println("after Hp " + hero.getHp());
//        } else {
//            System.out.println("Your attack failed...");
//        }


    }


//    public static void main(String[] args) {
//
//        Random random = new Random();
//
//        String heroName = Input.getString("Welcome! Please select a hero(Warrior/Knight): ");
//
//        Hero hero;
////        WE DONT KNOW WHICH HERO WILL BE CHOSEN UNTIL RUNTIME
//        if (heroName.equalsIgnoreCase("warrior")) {
//            hero = new Warrior("Warrior");
//        } else {
//            hero = new Knight("Knight");
//        }
//
////        WE DONT KNOW WHICH HERO ATTACKS UNTIL RUN TIME
//        hero.attack();
//
//        Enemy[] enemies = {new Zombie(), new Dragon()};
//
//        int randomIndex = random.nextInt(enemies.length);
//        Enemy enemyToAttack = enemies[randomIndex];
//
//        System.out.println(enemyToAttack.getClass().getName());
//
//
//
//
//
//    }


}