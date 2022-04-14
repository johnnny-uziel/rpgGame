

package characters;

public interface Attackable extends Action {

    int baseAttackDamage = 10;

    void attack();
    void spAttack();
}