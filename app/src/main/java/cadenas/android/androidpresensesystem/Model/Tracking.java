package cadenas.android.androidpresensesystem.Model;

/**
 * Created by JoaquinAntonio on 17/06/2018.
 */

public class Tracking {
    private String email,uid,lat,lgn;

    public Tracking() {
    }

    public Tracking(String email, String uid, String lat, String lgn) {
        this.email = email;
        this.uid = uid;
        this.lat = lat;
        this.lgn = lgn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLgn() {
        return lgn;
    }

    public void setLgn(String lgn) {
        this.lgn = lgn;
    }
}
