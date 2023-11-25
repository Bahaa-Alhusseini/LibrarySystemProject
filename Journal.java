package LibrarySystem;

public class Journal extends Book {
    private String conferenceName;
    private int conferenceNumber;

    public Journal(String title, int number, Author author, int edition, int date, String genre, String conferenceName, int conferenceNumber) {
        super(title, number, author, edition, date, genre);
        this.conferenceName = conferenceName;
        this.conferenceNumber = conferenceNumber;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public int getConferenceNumber() {
        return conferenceNumber;
    }
}
