package exercises;
import java.util.Date;

public class Bread extends Food    // Хлеб
{
    public Bread(String name, Double price, Integer quantity, Date exDate, String flourType) 
    {
        super(name, price, quantity, "шт.", exDate);
        this.flourType = flourType;
    }

    public String getFlourType() 
    {
        return flourType;
    }

    public void setFlourType(String flourType) 
    {
        this.flourType = flourType;
    }

    private String flourType;      // Тип муки
    @Override
    public String toString() 
    {
        return "Bread - " +
                super.toString().replace("}", ", Тип муки = " + flourType + "}");
    }
}

