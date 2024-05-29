public class User {

    private String userName;
    private String userEmail;
    private int userId;
    
    public User(String userName, String userEmail, int userId) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userId = userId;
    }

    public String getUsername() {
        return userName;
    }

    public String getEmail() {
        return userEmail;
    }

    public int getId() {
        return userId;
    }

    public String toString() {
        return "["+ userId +"]" +"\t"+ userName + " email { " + userEmail + "}";
    }
    
}
