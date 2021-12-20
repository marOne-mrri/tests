public class User {
    private String name;
    private String email;
    private String id;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public User(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public boolean exists(boolean e) {
        if(e){
            return true;
        } else {
            return false;
        }
    }

    public boolean notExists(boolean e) {
        if(e){
            return false;
        } else {
            return true;
        }
    }

    public boolean me(OtherUser user) {
        return user.exists(true);
    }

    public int ppcm (int a, int b) {
        int p = a * b;
        for (;a != b;) {
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }
        return p/a;
    }
}
