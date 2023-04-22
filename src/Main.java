import exercises.*;
import java.util.ArrayList;
import java.util.Date;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<Goods> goodsDB = new ArrayList<>();

        goodsDB.add(new Diapers("Merries", 671.87, 24, 0, true, "NB", 0,5, "Одноразовые"));
        goodsDB.add(new ChildsGoods("Смесь сухая молочная", 807.00, 10, 0, true));
        goodsDB.add(new Goods("Порталандцементный клинкер", 28.50, (Double)6254.48,"т"));
        goodsDB.add(new Bread("Подовый", 2150.00,99, new Date(123, 4, 24), "Пшеничная"));
        goodsDB.add(new Drink("Сикера 8-летней выдержки в дубовой бочке", 110000.00, 1, new Date(125, 12, 31), 1000.0));
        goodsDB.add(new Hygiene("Зубочистки", 99.90, 842, 100));
        goodsDB.add(new Milk("Молоко коровье", 700.0,71, new Date(123, 4, 18), 1000.0, 3.5));
        goodsDB.add(new Lemonade("Колокольчик", 27.50, 347, new Date(123, 9, 30), 500.0));
        goodsDB.add(new Food("Пельмени", 123.32, 47, "уп.", new Date(123, 7, 5)));
        goodsDB.add(new Eggs("Брей!", 98.41, 1, new Date(120, 7, 8), 6));
        goodsDB.add(new CosmeticMask("Огуречная", 63.60, 32, 10));
        goodsDB.add(new ToiletPaper("Наждачная", 174.00, 100, 10, 16));
        goodsDB.add(new Pacifier("Philips Avent ultra soft", 663.00, 354, 1, false));

        for (Goods good: goodsDB) System.out.println(good);
    }
}