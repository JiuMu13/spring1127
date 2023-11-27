package com.jmct;

public class PeopleImpl implements IPeople {
    String name;
    int strength;
    IWeapon weapon;


    public void attack() {
        System.out.println(name+" 剩余血量："+strength);
        weapon.use();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
}
