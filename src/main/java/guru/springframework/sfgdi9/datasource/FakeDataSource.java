package guru.springframework.sfgdi9.datasource;

public class FakeDataSource {

    private String username;
    private String password;
    private String jsbcurl;

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

    public String getJsbcurl() {
        return jsbcurl;
    }

    public void setJsbcurl(String jsbcurl) {
        this.jsbcurl = jsbcurl;
    }
}
