package org.example.vikins;
import org.example.soldier.Soldier;


public class Vikings extends Soldier {
    public String name;
    public Vikings (String name, int health, int strength) {
        super(health, strength);
        this.name = name;
    }
}
