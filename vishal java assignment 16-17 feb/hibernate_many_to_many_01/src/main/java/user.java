import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity

public class user {
    @Id
    private int id;
    private String name;
    @ManyToMany  (cascade = CascadeType.ALL)
    Collection<vehicle> vehi_list = new ArrayList<vehicle>() ;

    public user() {
    }

    public user(int id, String name, Collection<vehicle> vehi_list) {
        this.id = id;
        this.name = name;
        this.vehi_list = vehi_list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<vehicle> getVehi_list() {
        return vehi_list;
    }

    public void setVehi_list(Collection<vehicle> vehi_list) {
        this.vehi_list = vehi_list;
    }
}
