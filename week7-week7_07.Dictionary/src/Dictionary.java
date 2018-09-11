import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private HashMap<String, String> myDictionary;

    public Dictionary() {
        myDictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        String translation = myDictionary.get(word);
        if (translation == null) {
            return null;
        }
        return translation;

    }

    public void add(String word, String translation) {
        myDictionary.put(word, translation);
    }

    public int amountOfWords() {
        return myDictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        for(Map.Entry<String, String> entry: myDictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            listOfStrings.add(key + " = " + value);
        }
        return listOfStrings;
    }
}
