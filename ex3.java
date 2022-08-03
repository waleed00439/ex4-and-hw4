public class ex3 {
    String name;
    String email;

    public void Author(String name, String email) {
        this.name = name;
        this.email= email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        return "Author[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ']';
    }
}

