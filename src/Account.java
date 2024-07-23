public class Account implements Supermarket {
    private String username;
    private String password;

    @Override
    public void printDetails() {
        System.out.println("Account Details:");
        System.out.println("Username: " + username);
        // Note: Do not print the password for security reasons
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
