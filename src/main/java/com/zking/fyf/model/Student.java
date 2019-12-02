package com.zking.fyf.model;

import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@ToString
public class Student {

    public static interface  ValidateGroups{
        public static interface  Add{

        }
        public static interface Edit{

        }
    }


    @NotNull(message = "学生id不可为null",groups = {Student.ValidateGroups.Edit.class})
    private Integer sid;
    @NotBlank(message = "学生姓名必填",groups = {Student.ValidateGroups.Add.class,Student.ValidateGroups.Edit.class})
    private String sname;

    private String snamePinyin;

    private Integer age;
    private Integer sids[];
    private Integer MAXAge;
    private Integer MINAge;

    private String remark;

    public Student(Integer sid, String sname, String snamePinyin, Integer age, String remark) {
        this.sid = sid;
        this.sname = sname;
        this.snamePinyin = snamePinyin;
        this.age = age;
        this.remark = remark;
    }

    public Student() {
        super();
    }

    public Integer[] getSids() {
        return sids;
    }

    public void setSids(Integer[] sids) {
        this.sids = sids;
    }

    public Integer getMAXAge() {
        return MAXAge;
    }

    public void setMAXAge(Integer MAXAge) {
        this.MAXAge = MAXAge;
    }

    public Integer getMINAge() {
        return MINAge;
    }

    public void setMINAge(Integer MINAge) {
        this.MINAge = MINAge;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
        this.setSnamePinyin("123");
    }

    public String getSnamePinyin() {
        return snamePinyin;
    }

    public void setSnamePinyin(String snamePinyin) {
        this.snamePinyin = snamePinyin;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}