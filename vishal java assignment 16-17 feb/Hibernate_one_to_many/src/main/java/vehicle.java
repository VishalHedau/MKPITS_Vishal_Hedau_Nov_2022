import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class vehicle {
    @Id
    private int vnum;
    private String vehname;

    public vehicle() {
    }

    public vehicle(int vnum, String vehname) {
        this.vnum = vnum;
        this.vehname = vehname;
    }

    public int getVnum() {
        return vnum;
    }

    public void setVnum(int vnum) {
        this.vnum = vnum;
    }

    public String getVehname() {
        return vehname;
    }

    public void setVehname(String name) {
        this.vehname = name;
    }
}
