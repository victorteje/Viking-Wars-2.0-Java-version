package org.example.saxon;
import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    public Saxon(int health, int strength) {
        super(health, strength);
    }

    public int attack() {
        return strength;
    }

    public void receiveDamage(int damage) {
        this.health = this.health - damage;
    }
}
