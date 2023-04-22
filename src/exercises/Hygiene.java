package exercises;

public class Hygiene extends Goods       // Предметы гигиены
{
    public Hygiene(String name, Double price, Integer quantity, Integer quantityPerPackage) 
    {
        super(name, price, quantity, "уп.");
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

    private Integer quantityPerPackage;  // Количество штук в упаковке
    @Override
    public String toString() 
    {
        return "Hygiene" +
                super.toString().replace("}", ", Количество в упаковке = " + quantityPerPackage + " шт.}");
    }
}
