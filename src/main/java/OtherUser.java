public class OtherUser {
    private String name;
    private String email;
    private String id;

    public OtherUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.id = user.getId();
    }
    public boolean exists(boolean e) {
        return e;
    }

    public boolean me(User user) {
        return user.exists(true);
    }

}
