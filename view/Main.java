package view;

public class Main
{
    public static void main(String[] args)
    {
        String title = "Letter and character count";
        String[] options = {};
        CounterMenu counterMenu = new CounterMenu(title, options);
        counterMenu.run();
    }
    
}