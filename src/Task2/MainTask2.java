package Task2;

public class MainTask2 {
    public static void main(String[]args)   {
        Cafe myCafe = new Cafe();
        myCafe.loadMenuData();

        for (String s:myCafe.getCoffeeMenu()){
            System.out.println(s);
        }
    }
}
