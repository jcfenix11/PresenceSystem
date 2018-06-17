package cadenas.android.androidpresensesystem.Model;

/**
 * Created by JoaquinAntonio on 15/06/2018.
 */

public class User {
    private String email, status;

    public User() {
    }

    public User(String email, String status) {
        this.email = email;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
