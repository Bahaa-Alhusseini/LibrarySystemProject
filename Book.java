package LibrarySystem;

public class Book implements InterfaceDisplay {
    private String title;
    private int number;
    private Author author;
    private int edition;
    private int date;
    private String genre;
    private boolean loanState;

    public Book(String title, int number, Author author, int edition, int date, String genre) {
        this.title = title;
        this.number = number;
        this.author = author;
        this.edition = edition;
        this.date = date;
        this.genre = genre;
        this.loanState = true;
    }

    public Book()
    {

    }

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }

    public Author getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    public int getDate() {
        return date;
    }

    public String getGenre() {
        return genre;
    }


    public String getInfo() {
        return ("The Book Title Is : " + getTitle() +
                "\n" + "The Book Number Is : " + getNumber() +
                "\n" + "The Book Author is : " + author.getName() +
                "\n" + "The Book Genre is : " + getGenre() +
                "\n" + "The Book Edition is : " + getEdition() +
                "\n" + "The Book Date is : " + getDate());
    }

    public boolean inLoan()
    {
        return false;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public void setNumber(int number) 
    {
        this.number = number;
    }

    public void setAuthor(Author author) 
    {
        this.author = author;
    }

    public void setEdition(int edition) 
    {
        this.edition = edition;
    }

    public void setDate(int date) 
    {
        this.date = date;
    }

    public void setGenre(String genre) 
    {
        this.genre = genre;
    }
}
