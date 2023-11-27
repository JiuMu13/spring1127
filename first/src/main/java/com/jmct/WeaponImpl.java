package com.jmct;

public class WeaponImpl implements IWeapon {
    String name;
    int force;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void use() {
        System.out.println("使用了"+name+"  攻击力："+force);
    }
}
