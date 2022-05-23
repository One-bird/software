package cn.fxmpay.software.model.request;

/**
 * @author OneBird
 * @date 2022/5/20 9:33
 **/
public class LoginRequest {
    private String pwd;
    private String phone;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LoginRequest(String pwd, String phone) {
        this.pwd = pwd;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "pwd='" + pwd + '\'' +
                ", phone=" + phone +
                '}';
    }
}
