import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private ArrayList<Class> cl;
    private static int last = 0;

    public User(String name) {
        this.name = name;
        cl = new ArrayList<Class>();
        last++;
        id = last;
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

    @Override
    public String toString() {
        return "\nUser{" + "id=" + id + ", name=" + name + "}";
    }

    public boolean equals(Object obj) {
        if (obj != null && this.getClass() == obj.getClass()) {
            User User = (User) obj;
            return this.id == User.id && this.name.equals(User.name);
        }
        return false;
    }

    public Object clone() {
        User copia = new User(this.name);
        return copia;
    }
}
