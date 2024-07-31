package Slide9.Ex2;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {
    private String nameOfBook;
    private String datePublished;
    private final ArrayList<String> authorsList;
    private final ArrayList<Chapter> chaptersList;

    //Constructor
    public Book(String nameOfBook, String datePublished) {
        this.nameOfBook =  nameOfBook;
        this.datePublished = datePublished;
        this.authorsList = new ArrayList<>();
        this.chaptersList = new ArrayList<>();
    }
    public Book(String nameOfBook, String datePublished, ArrayList<String> authors, ArrayList<Chapter> chaptersList) {
        this.nameOfBook =  nameOfBook;
        this.datePublished = datePublished;
        this.authorsList = authors;
        this.chaptersList = chaptersList;
    }
    //Getter and setter
    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }
    public String getNameOfBook() {
        return nameOfBook;
    }
    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }
    public String getDatePublished() {
        return datePublished;
    }

    //Methods
    public boolean addAuthor(String author) {
        if (author.isEmpty() || authorsList.contains(author)) {
            return false;
        }
        authorsList.add(author);
        return true;
    }
    public boolean removeAuthor(String author) {
        return authorsList.remove(author);
    }
    public boolean addChapter(Chapter chapter) {
        if (chaptersList.contains(chapter)) return false;
        else {
            chaptersList.add(chapter);
            return true;
        }
    }
    public boolean removeChapter(Chapter chapter) {
        return chaptersList.remove(chapter);
    }
    public void printBook() {
        if (authorsList.isEmpty()) {
            System.out.println("Book has no authors.");
            return;
        }
        if (chaptersList.isEmpty()) {
            System.out.println("Book is empty.");
            return;
        }
        System.out.println("Book Name: " + nameOfBook);
        System.out.println("Published Date: " + datePublished);
        System.out.println("Authors: " + authorsList);
        System.out.println("Chapters: ");
        System.out.println("--------------------------------");
        Iterator<Chapter> chapterIterator = chaptersList.iterator();
        int chapterCount = 0;
        while (chapterIterator.hasNext()) {
            chapterCount++;
            System.out.println("Chapter " + chapterCount + ":");
            Chapter chapter = chapterIterator.next();
            chapter.printChapter();
            System.out.println("--------------------------------");

        }
    }

}
