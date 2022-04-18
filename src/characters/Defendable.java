package characters;

public interface Defendable extends Action {
    int baseDefense = 5;


    default int defend() {
        return 120;
    }
//
//    void spDefense() {
//
//    }
}
