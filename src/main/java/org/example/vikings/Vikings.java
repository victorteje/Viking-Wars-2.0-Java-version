package org.example.vikings;
import org.example.soldier.Soldier;


public class Vikings extends Soldier {
    public String name;
    public Vikings (String name, int health, int strength) {
        super(health, strength);
        this.name = name;
    }

    public int attack() {
        return strength;
    }

    String msg;
    public void receiveDamage(int damage) {
        this.health = this.health - damage;
        if (this.health > 0){
            msg = this.name + "has received" + damage + "points of damage";
        }
    }
    public String getMsg() {
        return msg;
    }

    String odin = "Odin Owns You All!";
    public String battleCry() {
        return odin;
    }
}
