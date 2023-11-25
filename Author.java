package LibrarySystem;

public class Author {
    private int id;
    private String name;
    private String address;
    private BirthDate birthDate;

    public Author(int id, String name, String address, BirthDate birthDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }

    public Author()
    {

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setBirthDate(BirthDate bd) 
    {
        this.birthDate = bd;
    }
}
