package SEF.lab1.org.loose.fis.processor;

import SEF.lab1.org.loose.fis.document.Document;

import java.util.List;

public class SearchProcessor implements Processor {

    private String searchedTerm;

    public SearchProcessor(String searchedTerm) {
        this.searchedTerm = searchedTerm;
    }

    @Override
    public int process(List<Document> documents) {
        int count = 0;
        for (Document document : documents) {
            List<String> wordList = document.analyse();
            for (String word : wordList) {
                if (word.equals(this.searchedTerm)) {
                    count++;
                }
            }
        }
        return count;
    }
}