import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Book")
@XmlType(propOrder = {"name", "year", "myList"})
public class Book {
    @JsonProperty("Artikul")
    private String artikul;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Year")
    private int year;
    @JsonProperty("MyList")
    private MyList myList;

    public Book() {
    }

    public Book(String artikul, String name, int year) {
        this.artikul = artikul;
        this.name = name;
        this.year = year;
    }

    public Book(String artikul, String name, int year, MyList myList) {
        this.artikul = artikul;
        this.name = name;
        this.year = year;
        this.myList = myList;
    }

    @Override
    public String toString() {
        if (myList == null) {
            return "Book{" +
                    "artikul='" + artikul + '\'' +
                    ", name='" + name + '\'' +
                    ", year=" + year +
                    '}';
        }
        return "Book{" +
                "artikul='" + artikul + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", myList=" + myList +
                '}';
    }

    @XmlAttribute
    public String getArtikul() {
        return artikul;
    }

    public void setArtikul(String artikul) {
        this.artikul = artikul;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @XmlElement(name = "ListOfBooks")
    public MyList getMyList() {
        return myList;
    }

    public void setMyList(MyList myList) {
        this.myList = myList;
    }
}