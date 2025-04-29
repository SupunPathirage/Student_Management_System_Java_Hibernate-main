package lk.cmjd.coursework.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class StudentregcourseDto  {
    private String rcstudentid;
    private String rccourseid1;
    private String rccourseid2;
    private String rccourseid3;

    public String getRcstudentid() {
        return rcstudentid;
    }

    public void setRcstudentid(String rcstudentid) {
        this.rcstudentid = rcstudentid;
    }

    public String getRccourseid1() {
        return rccourseid1;
    }

    public void setRccourseid1(String rccourseid1) {
        this.rccourseid1 = rccourseid1;
    }

    public String getRccourseid2() {
        return rccourseid2;
    }

    public void setRccourseid2(String rccourseid2) {
        this.rccourseid2 = rccourseid2;
    }

    public String getRccourseid3() {
        return rccourseid3;
    }

    public void setRccourseid3(String rccourseid3) {
        this.rccourseid3 = rccourseid3;
    }
}
