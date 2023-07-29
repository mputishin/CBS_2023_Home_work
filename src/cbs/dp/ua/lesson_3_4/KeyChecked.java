package cbs.dp.ua.lesson_3_4;

public class KeyChecked {


    public FreeDocumentWorker checked (String key) {
        if (key.equals("pro")) {
            FreeDocumentWorker obj = new ProDocumentWorker();
            System.out.println("You have got the key: " + obj.getClass());
        return obj;
        } else if (key.equals("exp")) {
            FreeDocumentWorker obj = new ExpertDocumentWorker();
            System.out.println("You have got the key: "+ obj.getClass());
            return obj;
        } else {
            FreeDocumentWorker obj = new FreeDocumentWorker();
            System.out.println("You have got the key: " + obj.getClass());
            return obj;
        }
    }
}
