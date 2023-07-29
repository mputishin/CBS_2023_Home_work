package cbs.dp.ua.lesson_3_4;

public class ProDocumentWorker extends FreeDocumentWorker {

    @Override
    void editDocument() {
        System.out.println("Document edited");
    }

    @Override
    void saveDocument() {
        System.out.println("The document is saved in the old format, saving in other formats is available in the Expert version");
    }
}
