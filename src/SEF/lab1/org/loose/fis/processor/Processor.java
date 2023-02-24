package SEF.lab1.org.loose.fis.processor;

import SEF.lab1.org.loose.fis.document.Document;

import java.util.List;

public interface Processor {
    int process(List<Document> documents);
}