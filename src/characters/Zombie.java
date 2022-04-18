package characters;

//import characters.Character;

public class Zombie extends Enemy {

    private boolean isRotting;

    public Zombie(String name) {
        super(100, 150, name);
        this.isRotting = true;
    }

    public boolean isRotting() {
        return isRotting;
    }

    public void setRotting(boolean rotting) {
        isRotting = rotting;
    }

    @Override
    public void attack() {
        System.out.println("Eating brains!");
    }






}