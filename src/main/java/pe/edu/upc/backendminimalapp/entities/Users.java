package pe.edu.upc.backendminimalapp.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column(name = "username", length = 25)
    private String username;

    @Column(name = "password", length = 200)
    private String password;

    @Column(name = "image_profile", length = 255)
    private String image_profile;


    public Users() {
    }

    public Users(Integer user_id, String username, String password, String image_profile) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.image_profile = image_profile;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

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

    public String getImage_profile() {
        return image_profile;
    }

    public void setImage_profile(String image_profile) {
        this.image_profile = image_profile;
    }
}
