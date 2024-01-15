package model;

import java.util.HashMap;

public class LetterContainer
{
    HashMap letterMap;

    public LetterContainer()
    {
        this.letterMap = new HashMap<String, Integer>();
    }
    
    public void addCount(String word)
    {
        Integer count = null;
        count = (Integer)letterMap.getOrDefault(word, 0);
        
        ++count;
        letterMap.put(word, count);
    }

    @Override
    public String toString()
    {
        return letterMap.toString();
    }
    
    
}