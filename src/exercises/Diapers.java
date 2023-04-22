package exercises;

public class Diapers extends ChildsGoods // Подгузники 
{
    public Diapers(String name, Double price, Integer quantity, Integer minAge, Boolean isHypoallergenic, String size, Integer minWeight, Integer maxWeight, String type) 
    {
        super(name, price, quantity, minAge, isHypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public String getSize() 
    {
        return size;
    }

    public void setSize(String size) 
    {
        this.size = size;
    }

    public Integer getMinWeight() 
    {
        return minWeight;
    }

    public void setMinWeight(Integer minWeight) 
    {
        this.minWeight = minWeight;
    }

    public Integer getMaxWeight() 
    {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) 
    {
        this.maxWeight = maxWeight;
    }

    public String getType() 
    {
        return type;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    private String size;            //Размер -> NBXS, NB, S, M, L, XL, XXL
    private Integer minWeight;      // Минимальный вес
    private Integer maxWeight;      // Максимальный вес
    private String type;            // Тип

    @Override
    public String toString() 
    {
        return "Diapers - " +
                super.toString().replace("}", ", Размер = " + size +
                        ", Минимальный вес = " + minWeight +
                        "кг, Максимальный вес = " + maxWeight +
                        "кг, Тип = " + type +"}");
    }
}
