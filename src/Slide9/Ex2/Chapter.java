package Slide9.Ex2;

import java.util.ArrayList;
import java.util.Iterator;

public class Chapter {
    private String title;
    private int numberOfPages;
    private ArrayList<Page> pagesList;

    //Constructor
    public Chapter(String title) {
        this.title = title;
        this.numberOfPages = 0;
        this.pagesList = new ArrayList<>();
    }
    public Chapter(String title, ArrayList<Page> pages) {
        this.title = title;
        this.numberOfPages = pages.size();
        this.pagesList = new ArrayList<>(pages);
    }

    //Setters and getters
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean addPage(Page page) {
        if (page.getContent().isEmpty()) {
            return false;
        }
        pagesList.add(page);
        return true;
    }
    public boolean removePage(Page page) {
        Iterator iterator = pagesList.iterator();
        for (; iterator.hasNext(); ) {
            if (page.equals((Page)iterator.next())) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void printChapter() {
        System.out.println("Chapter Title: " + title);
        for (int i = 0; i < pagesList.size(); i++) {
            System.out.println("Page " + (i + 1) + ":");
            System.out.println("Content: " + pagesList.get(i).getContent());
        }
    }

    @Override
    public boolean equals(Object other) {
        if (((Chapter)other).getTitle().equals(title)) return true;
        return false;
    }

}
