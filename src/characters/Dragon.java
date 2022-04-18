package characters;

public class Dragon extends Enemy{

    public Dragon(String name) {
        super(200, 100, name);
    }

    public void fly() {
        System.out.println("Flying");
    }

    public void attack() {
        System.out.println("Breathe fire!");
    }



}