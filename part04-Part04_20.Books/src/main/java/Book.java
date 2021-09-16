/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agney
 */
public class Book {

    private String title;
    private int pages;
    private int yr;

    public Book(String title, int pages, int yr) {
        this.pages = pages;
        this.yr = yr;
        this.title = title;
    }

    public String print(String action) {
        if (action.equals("everything")) {
            return this.title + ", " + this.pages + " pages, " + this.yr;
        } else {
            return this.title;
        }
    }
}
