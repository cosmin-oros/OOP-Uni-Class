package SEF.lab1.org.loose.fis.document;

import java.util.ArrayList;
import java.util.List;

public class XML extends Document {
    public XML(List<String> words) {
        super(words);
    }

    @Override
    public List<String> analyse() {
        List<String> noTags = new ArrayList<>();
        for (String word : words) {
            if (!word.contains("<")) {
                noTags.add(word);
            }
        }
        return noTags;
    }

    @Override
    public String toString() {
        return "XML{" +
                "words=" + words +
                '}';
    }
}
