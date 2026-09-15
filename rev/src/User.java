import java.util.ArrayList;
import java.util.List;

public final class User{
    private final List<String> s;
    public User(ArrayList<String> s){
        this.s = new ArrayList<>(s);
    }

    public static User getUser(ArrayList<String>s){
        return new User(s);
    }
}
