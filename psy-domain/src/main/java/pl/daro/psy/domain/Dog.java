package pl.daro.psy.domain;

//import com.j256.ormlite.field.DataType;
//import com.j256.ormlite.field.DatabaseField;
//import com.j256.ormlite.table.DatabaseTable;

import javax.persistence.*;
import java.text.DateFormat;
//import java.time.LocalDate;
import java.util.Date;

//@DatabaseTable(tableName = "dogs")
@Entity
@Table(name = "dogs")
public class Dog {
//    @DatabaseField(generatedId = true)
    @Column
//    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private int id;
//    @DatabaseField
    @Column
    private String name;
//    @DatabaseField
    @Column
    private String keeperName;
//    @DatabaseField
    @Column
    private Date birthDay;
//    @DatabaseField
    @Column
    private float weight;

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeeperName() {
        return keeperName;
    }

    public void setKeeperName(String keeperName) {
        this.keeperName = keeperName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

//    public String introduceYourself() {
//        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
//
//        return String.format("My name is %s.\nI weight %s kg. My keeper is Adarti.\nI was born in %s\n", name, weight, df.format(birthDay));
//    }
}
