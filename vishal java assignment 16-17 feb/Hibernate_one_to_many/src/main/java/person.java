import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class person {
    @Id
    private int Sr;
    private String name;

    @OneToMany (cascade = CascadeType.ALL)
    private Collection<vehicle> vehi =new ArrayList<vehicle>();

    public person() {
    }

    public person(int sr, String name, Collection<vehicle> vehi) {
        Sr = sr;
        this.name = name;
        this.vehi = vehi;
    }

    public int getSr() {
        return Sr;
    }

    public void setSr(int sr) {
        Sr = sr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<vehicle> getVehi() {
        return vehi;
    }

    public void setVehi(Collection<vehicle> vehi) {
        this.vehi = vehi;
    }
}