package com.jmct;

public interface IPeople {
    public void attack();

    public String getName();

    public void setName(String name);

    public int getStrength();

    public void setStrength(int strength);

    public IWeapon getWeapon();

    public void setWeapon(IWeapon weapon);

}
