// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package jp.springbook.springroosample.mydata;

import jp.springbook.springroosample.mydata.SampleData;

privileged aspect SampleData_Roo_JavaBean {
    
    public String SampleData.getName() {
        return this.name;
    }
    
    public void SampleData.setName(String name) {
        this.name = name;
    }
    
    public String SampleData.getMail() {
        return this.mail;
    }
    
    public void SampleData.setMail(String mail) {
        this.mail = mail;
    }
    
    public Integer SampleData.getAge() {
        return this.age;
    }
    
    public void SampleData.setAge(Integer age) {
        this.age = age;
    }
    
    public String SampleData.getMemo() {
        return this.memo;
    }
    
    public void SampleData.setMemo(String memo) {
        this.memo = memo;
    }
    
}
