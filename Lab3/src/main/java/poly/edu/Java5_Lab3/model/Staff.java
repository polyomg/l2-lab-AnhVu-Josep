package poly.edu.Java5_Lab3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Staff {

    private String id;
    private String fullname;
    @Builder.Default
    private String photo = "trump-logo.png";
    @Builder.Default
    private boolean gender = true;
    @Builder.Default
    private Date birthday = new Date();
    @Builder.Default
    private double salary = 12345.6789;
    @Builder.Default
    private Integer level = 0;

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getFullname() {
//        return fullname;
//    }
//
//    public void setFullname(String fullname) {
//        this.fullname = fullname;
//    }
//
//    public String getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(String photo) {
//        this.photo = photo;
//    }
//
//    public boolean isGender() {
//        return gender;
//    }
//
//    public void setGender(boolean gender) {
//        this.gender = gender;
//    }
//
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    public Integer getLevel() {
//        return level;
//    }
//
//    public void setLevel(Integer level) {
//        this.level = level;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public Staff() {
//        this.photo = "trump-logo.png";
//        this.gender = true;
//        this.birthday = new Date();
//        this.salary = 12345.6789;
//        this.level = 0;
//    }
//
//    public Staff(String id, String fullname, String photo, Boolean gender,
//                 Date birthday, Double salary, Integer level) {
//        this.id = id;
//        this.fullname = fullname;
//        this.photo = photo != null ? photo : "trump-logo.png";
//        this.gender = gender != null ? gender : true;
//        this.birthday = birthday != null ? birthday : new Date();
//        this.salary = salary != null ? salary : 12345.6789;
//        this.level = level != null ? level : 0;
//    }
//
//    public Staff(String id, String fullname, Integer level) {
//        this();  // Gọi constructor không tham số để khởi tạo giá trị mặc định
//        this.id = id;
//        this.fullname = fullname;
//        this.level = level;
//    }
}
