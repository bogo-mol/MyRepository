import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "MyList")
public class MyList {
    @JsonProperty("List")
    private List<Book> list;

    public MyList() {
    }

    public MyList(List<Book> list) {
        this.list = list;
    }

    @XmlElement
    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "list=" + list +
                '}';
    }
}
