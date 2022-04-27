package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Nematode
{
    private String name;
    private int length;
    private int limbs;
    private String gender;
    private int eyes;

    @Override
    public String toString()
    {
        return "Nematode: Name = " + name + ", Length = " + length + ", Limbs = " + limbs + ", Gender = " + gender + ", Eyes = " + eyes; 
    }

    public Nematode(TableRow tr)
    {
        this(
            tr.getString("Name"),
            tr.getInt("Length"), 
            tr.getInt("Limbs"),
            tr.getString("Gender"),
            tr.getInt("Eyes")
        );
    }

    public Nematode(String name, int length, int limbs, String gender, int eyes)
    {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getLength()
    {
        return length;
    }

    public void setLimbs(int length)
    {
        this.limbs = limbs;
    }

    public int getLimbs()
    {
        return limbs;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getGender()
    {
        return gender;
    }

    public void setEyes(int eyes)
    {
        this.eyes = eyes;
    }

    public int getEyes()
    {
        return eyes;
    }

    public void render(NematodeVisualiser pa)
    {

    }

}
