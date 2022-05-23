package cn.fxmpay.software.model.entity;

/**
 * @author OneBird
 * @date 2022/5/19 21:43
 **/
public class User {
    private Integer id;

    private String username;

    private String phone;

    private String password;

    public User(Integer id, String username, String phone, String password) {
        this.id = id;
        this.username = username;
        this.phone = phone;
        this.password = password;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}