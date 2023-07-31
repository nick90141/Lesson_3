package task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер ключа доступа - pro/exp. Если нет ключа - введите \"no\": ");
        String result = in.nextLine();

        DocumentWorker documentWorker;

        if ("pro".equalsIgnoreCase(result)) {
            documentWorker = new ProDocumentWorker();
        } else if ("exp".equalsIgnoreCase(result)) {
            documentWorker = new ExpertDocumentWorker();
        } else if ("no".equalsIgnoreCase(result)){
            documentWorker = new DocumentWorker();
        } else {
            System.out.println("Вы ввели неверный символ!");
            return;
        }

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
