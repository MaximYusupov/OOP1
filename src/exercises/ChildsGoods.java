package exercises;

public class ChildsGoods extends Goods   // Детские товары
{
    public ChildsGoods(String name, Double price, Integer quantity, Integer minAge, Boolean isHypoallergenic) 
    {
        super(name, price, quantity, "шт.");
        this.minAge = minAge;
        this.isHypoallergenic = isHypoallergenic;
    }

    public Integer getMinAge() 
    {
        return minAge;
    }

    public void setMinAge(Integer minAge) 
    {
        this.minAge = minAge;
    }

    public Boolean getHypoallergenic() 
    {
        return isHypoallergenic;
    }

    public void setHypoallergenic(Boolean hypoallergenic) 
    {
        isHypoallergenic = hypoallergenic;
    }

    private Integer minAge;             // Минимальный возраст
    private Boolean isHypoallergenic;   // Гипоаллергенность
    @Override
    public String toString() 
    {
        return "ChidsGoods" +
                super.toString().replace("}", ", Минимальный возраст = " + minAge +
                        ", Гипоаллергенность = " + (isHypoallergenic ? "да" : "нет") + "}");
    }
}
