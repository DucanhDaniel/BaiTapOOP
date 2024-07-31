package Slide9.Ex2;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("Book1", "2021-01-01");
        Chapter chapter1 = new Chapter("Chapter1");
        chapter1.addPage(new Page("Chapter 1 page 1"));
        chapter1.addPage(new Page("Chapter 1 page 2"));
        chapter1.addPage(new Page("Chapter 1 page 3"));
        chapter1.addPage(new Page("Chapter 1 page 4"));

        Chapter chapter2 = new Chapter("Chapter2");
        chapter2.addPage(new Page("Chapter 2 page 1"));
        chapter2.addPage(new Page("Chapter 2 page 2"));
        chapter2.addPage(new Page("Chapter 2 page 3"));

        Chapter chapter3 = new Chapter("Chapter3");
        chapter3.addPage(new Page("Chapter 3 page 1"));
        chapter3.addPage(new Page("Chapter 3 page 2"));


        book.addChapter(chapter1);
        book.addChapter(chapter2);
        book.addChapter(chapter3);

        book.addAuthor("Author1");
        book.addAuthor("Author2");
        book.addAuthor("Author3");

        //Test removing a chapter
        book.removeChapter(chapter2);

        //Test removing a page
        chapter1.removePage(new Page("Chapter 1 page 2"));

        //Test removing an author
        book.removeAuthor("Author2");

        //Print the book
        book.printBook();
    }
}