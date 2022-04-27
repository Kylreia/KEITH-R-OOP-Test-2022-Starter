package ie.tudublin;

public class Nematode
{
    public Nematode()
    {

    }

    private String name;
    private int length;
    private int limbs;
    private String gender;
    private int eyes;

    public String toString()
    {
        return name;
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
    
}
