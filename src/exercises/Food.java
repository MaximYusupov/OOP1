package exercises;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Food extends Goods     // Продукты питания
{
    public Food(String name, Double price, Object quantity, String unit, Date exDate) 
    {
        super(name, price, quantity, unit);
        this.exDate = exDate;
    }

    public Date getExDate() 
    {
        return exDate;
    }

    public void setExDate(Date exDate) 
    {
        this.exDate = exDate;
    }

    private Date exDate;           // Срок годности
    @Override
    public String toString() 
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return "Food" +
                super.toString().replace("}", ", Срок годности = " + formatter.format(exDate) + "}");
    }
}
