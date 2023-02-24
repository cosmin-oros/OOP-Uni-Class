package SEF.lab1.org.loose.fis.document;

import java.util.ArrayList;
import java.util.List;

public class Json extends Document{
    public Json(List<String> words) {
        super(words);
    }

    @Override
    public List<String> analyse() {
        ArrayList<String> justValues = new ArrayList<>();
        for (String word : words) {
            if (!word.contains(":")) {
                justValues.add(word);
            }
        }
        return justValues;
    }

    @Override
    public String toString() {
        return "Json{" +
                "words=" + words +
                '}';
    }
}
