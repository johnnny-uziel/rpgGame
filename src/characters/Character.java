package characters;

public abstract class Character implements Attackable, Defendable {

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp;
    protected int attackDamage = 0;
    protected int spAttackDamage = 20;

    protected int defense = 3;

    public Character(int hp, int attackDamage) {
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    //    BEHAVIORS THAT ALL CHARACTERS SHARE
    public void attack() {
        if (attackDamage > baseAttackDamage) {
            System.out.println("Attacked for " + attackDamage + " damage");
        } else {
            System.out.println("Attacked for " + baseAttackDamage + " damage");
        }
    }

    public void defend() {
        System.out.println("didn't receive any damage");

    }

}


//public abstract class CharacterDefense implements Defendable {
//
//    //    PROPERTIES ALL CHARACTERS SHARE
//    protected int hp;
//    protected int defense = 3;
//    protected int attackFromEnemy;
//
//    public CharacterDefense(int hp, int defense, int attackFromEnemy) {
//        this.hp = hp;
//        this.defense = defense;
//        this.attackFromEnemy = attackFromEnemy;
//    }
//
//    public int getHp() {
//        return hp;
//    }
//
//    public void setHp(int hp) {
//        this.hp = hp;
//    }
//
//    public int getDefense() {
//        return defense;
//    }
//
//    public void setDefense(int defense) {
//        this.defense = defense;
//    }
//
//    public int getAttackFromEnemy() {
//        return attackFromEnemy;
//    }
//
//    public void setAttackFromEnemy(int attackFromEnemy) {
//        this.attackFromEnemy = attackFromEnemy;
//    }

//    BEHAVIORS THAT ALL CHARACTERS SHARE
//    public void defend() {
//        if (attackFromEnemy > baseDefense) {
//            System.out.println("Attacked for " + attackFromEnemy + " damage");
//        } else {
//            System.out.println("Attacked for " + attackFromEnemy + " damage");
//        }
//    }



