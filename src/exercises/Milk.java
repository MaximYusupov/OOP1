package exercises;
import java.util.Date;

public class Milk extends Drink     // Молоко
{
    public Milk(String name, Double price, Integer quantity, Date exDate, Double volume, Double fatPercent) 
    {
        super(name, price, quantity, exDate, volume);
        this.fatPercent = fatPercent;
    }

    public Double getFatPercent() 
    {
        return fatPercent;
    }

    public void setFatPercent(Double fatPercent) 
    {
        this.fatPercent = fatPercent;
    }

    private Double fatPercent;       // Процент жирности
    @Override
    public String toString() 
    {
        return "Milk - " +
                super.toString().replace("}", ", Жирность = " + fatPercent + " %}");
    }
}
