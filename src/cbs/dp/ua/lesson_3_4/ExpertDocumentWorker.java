package cbs.dp.ua.lesson_3_4;

public class ExpertDocumentWorker extends ProDocumentWorker{

    @Override
    void saveDocument() {
        System.out.println("The document is saved in a new format");
    }
}
