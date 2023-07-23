package cbs.dp.ua;

import java.util.Scanner;

public class Lessons_OOP_N1_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите название книги ");
        String a = scn.nextLine();
        System.out.println("Введите имя автора ");
        String b = scn.nextLine();
        System.out.println("Введите содержание книги ");
        String c = scn.nextLine();
        Title title = new Title(a);
        Author author = new Author(b);
        Content content = new Content(c);

        System.out.println("Книга ");
        title.showTitle(title.title);
        System.out.println("Автор ");
        author.showAuthor(author.author);
        System.out.println("Содержание ");
        content.showConent(content.content);
    }
}
class Title {
    String title;

    public Title(String title) {
        this.title = title;
    }

    void showTitle (String name) {
        System.out.println(name);
    }
}

class Author {
    String author;

    public Author(String author) {
        this.author = author;
    }

    void showAuthor (String name) {
        System.out.println(name);
    }
}

class Content {
    String content;

    public Content(String content) {
        this.content = content;
    }

    void showConent (String name) {
        System.out.println(name);
    }
}