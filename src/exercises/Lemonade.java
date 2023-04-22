package exercises;
import java.util.Date;

public class Lemonade extends Drink // Лимонад 
{
    public Lemonade(String name, Double price, Integer quantity, Date exDate, Double volume) 
    {
        super(name, price, quantity, exDate, volume);
    }

    @Override
    public String toString() 
    {
        return "Lemonade - " + super.toString();
    }
}
