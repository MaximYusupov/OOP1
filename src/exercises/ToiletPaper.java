package exercises;

public class ToiletPaper extends Hygiene     // Туалетная бумага
{
    public ToiletPaper(String name, Double price, Integer quantity, Integer quantityPerPackage, Integer layersNum) 
    {
        super(name, price, quantity, quantityPerPackage);
        this.layersNum = layersNum;
    }

    public Integer getLayersNum() 
    {
        return layersNum;
    }

    public void setLayersNum(Integer layersNum) 
    {
        this.layersNum = layersNum;
    }

    private Integer layersNum;               // Количество слоёв
    @Override
    public String toString() 
    {
        return "ToiletPaper - " +
                super.toString().replace("}", ", Количество слоёв = " + layersNum + "шт.}");
    }
}
