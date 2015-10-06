package models;
import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class Item extends Model{

    @Id
    public long id;
    public String name;
    public int quantity;

}
