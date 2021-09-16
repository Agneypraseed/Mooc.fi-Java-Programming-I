
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object book) {
        Book b=(Book) book;
        if(this.name.equals(b.name)&&this.publicationYear==b.publicationYear){
            return true;
        }else{
            return false;
        }
        
                       
    }

}
