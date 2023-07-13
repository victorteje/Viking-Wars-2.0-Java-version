package org.example.saxon;
import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    public Saxon(int health, int strength) {
        super(health, strength);
    }

    public int attack() {
        return strength;
    }

    String msg;
    public void receiveDamage(int damage) {
        this.health = this.health - damage;
        if (this.health > 0){
            msg = "A Saxon has received" + damage + "points of damage";
        }
    }

    public String getMsg() {
        return msg;
    }

}
