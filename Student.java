package LibrarySystem;

public class Student {
    private int id;
    private String name;
    private BirthDate birthDate;
    private String address;
    private String major;
    private Book[] loanedBooks = new Book[3];

    public Student()
    {

    }

    public Student(int id, String name, BirthDate birthDate, String address, String major) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getMajor() {
        return major;
    }

    public void loanBook(Book book) {
       for(int i = 0 ; i < 3 ;)
       {
            if(loanedBooks[i] == null)
            {
                loanedBooks[i] = book;
            }
            else
            i++;
       }
    }

    public void getBooksInfo()
    {
        for(int i = 0 ; i < loanedBooks.length ; i++)
        {
            if(loanedBooks[i] != null)
            System.out.println(loanedBooks[i].getInfo());
            else
            break;
       
        }
    }

        
}
