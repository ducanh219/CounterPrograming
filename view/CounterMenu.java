package view;



import controller.Counter;
import common.Library;


public class CounterMenu extends Menu
{

    public CounterMenu(String title, String[] options)
    {
        super(title, options);
    }
    
    @Override
    protected void execute(int n)
    {
        String str = Library.getString("Enter your content");
        Counter counter = new Counter(str);
        counter.count();
        
        System.out.println(counter.getLetterCount());
        System.out.println(counter.getCharacterCount());
    }
    
}