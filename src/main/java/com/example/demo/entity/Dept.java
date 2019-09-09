package com.example.demo.entity;

public class Dept  {
    // deptno
    private Integer deptno;
    // dname
    private String dname;
    // loc
    private String loc;

    public Dept() {
    }

    public Dept(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
    String s = "package com.example.demo.entity;\n" +
            "\n" +
            "public class Dept  {\n" +
            "    // deptno\n" +
            "    private Integer deptno;\n" +
            "    // dname\n" +
            "    private String dname;\n" +
            "    // loc\n" +
            "    private String loc;\n" +
            "\n" +
            "    public Dept() {\n" +
            "    }\n" +
            "\n" +
            "    public Dept(Integer deptno, String dname, String loc) {\n" +
            "        this.deptno = deptno;\n" +
            "        this.dname = dname;\n" +
            "        this.loc = loc;\n" +
            "    }\n" +
            "\n" +
            "    public Integer getDeptno() {\n" +
            "        return deptno;\n" +
            "    }\n" +
            "\n" +
            "    public void setDeptno(Integer deptno) {\n" +
            "        this.deptno = deptno;\n" +
            "    }\n" +
            "\n" +
            "    public String getDname() {\n" +
            "        return dname;\n" +
            "    }\n" +
            "\n" +
            "    public void setDname(String dname) {\n" +
            "        this.dname = dname;\n" +
            "    }\n" +
            "\n" +
            "    public String getLoc() {\n" +
            "        return loc;\n" +
            "    }\n" +
            "\n" +
            "    public void setLoc(String loc) {\n" +
            "        this.loc = loc;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public String toString() {\n" +
            "        return \"Dept{\" +\n" +
            "                \"deptno=\" + deptno +\n" +
            "                \", dname='\" + dname + '\\'' +\n" +
            "                \", loc='\" + loc + '\\'' +\n" +
            "                '}';\n" +
            "    }\n" +
            "}\n";
}
