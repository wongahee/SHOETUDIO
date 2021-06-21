package SHOETUDIO.spring.mvc.vo;

public class Custom {

    protected String body;      // 전체
    protected String tongue;    // 앞부분
    protected String sidewall;  // 밑창&옆부분
    protected String fname;     // 파일이름
    protected String uuid;      // 식별코드

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTongue() {
        return tongue;
    }

    public void setTongue(String tongue) {
        this.tongue = tongue;
    }

    public String getSidewall() {
        return sidewall;
    }

    public void setSidewall(String sidewall) {
        this.sidewall = sidewall;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
