package SHOETUDIO.spring.mvc.vo;

public class Custom {

    protected String cno;
    protected String sname;
    protected String uuid;      // 식별코드

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

}