package LibrarySystem;

public class Magazine extends Book {
    private int issueNumber;
    private int releaseDate;

    public Magazine(String title, int number, Author author, int edition, int date, String genre, int issueNumber, int releaseDate) {
        super(title, number, author, edition, date, genre);
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public int getReleaseDate() {
        return releaseDate;
    }
}
