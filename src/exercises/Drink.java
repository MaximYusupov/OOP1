package exercises;
import java.util.Date;

public class Drink extends Food // Напитки
{
    public Drink(String name, Double price, Integer quantity, Date exDate, Double volume) 
    {
        super(name, price, quantity, "шт.", exDate);
        this.volume = volume;
    }
    public Double getVolume() 
    {
        return volume;
    }

    public void setVolume(Double volume) 
    {
        this.volume = volume;
    }

    private Double volume; // Объём
    @Override
    public String toString() {
        return "Drink - " +
                super.toString().replace("}", ", Объём = " + volume + " мл}");
    }
}
