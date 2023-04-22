package exercises;
import java.util.Date;

public class Eggs extends Food
{
    public Eggs(String name, Double price, Integer quantity, Date exDate, Integer quantityPerPackage) 
    {
        super(name, price, quantity, "уп.", exDate);
        this.quantityPerPackage = quantityPerPackage;
    }

    public Integer getQuantityPerPackage() 
    {
        return quantityPerPackage;
    }

    public void setQuantityPerPackage(Integer quantityPerPackage) 
    {
        this.quantityPerPackage = quantityPerPackage;
    }

    private Integer quantityPerPackage; // Количество штук в упаковке
    @Override
    public String toString() 
    {
        return "Eggs - " +
                super.toString().replace("}", ", Количество штук в упаковке = " + quantityPerPackage + "шт.}");
    }
}
