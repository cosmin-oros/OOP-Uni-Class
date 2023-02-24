package SEF.lab1.org.loose.fis.document;

import java.util.List;

public abstract class Document {
    protected List<String> words;

    public Document(List<String> words) {
        this.words = words;
    }

    public abstract List<String> analyse();

    @Override
    public String toString() {
        return "Document{" +
                "lines=" + words +
                '}';
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
}
