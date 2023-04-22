package exercises;

public class Pacifier extends ChildsGoods        // Соска
{
    public Pacifier(String name, Double price, Integer quantity, Integer minAge, Boolean isHypoallergenic) 
    {
        super(name, price, quantity, minAge, isHypoallergenic);
    }

    @Override
    public String toString() 
    {
        return "Pacifier - " + super.toString();
    }
}
