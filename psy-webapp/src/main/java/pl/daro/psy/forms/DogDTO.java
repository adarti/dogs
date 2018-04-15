package pl.daro.psy.forms;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
//import java.time.LocalDate;
//import java.util.Date;

public class DogDTO {
    @NotEmpty(message = "To pole nie może być puste")
    @Size(message = "minimum 3 znaki")
    private String name;
    @NotEmpty(message = "To pole nie może być puste")
    @Size(message = "minimum 3 znaki")
    private String keeperName;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotEmpty(message = "To pole nie może być puste")
    private String birthDay;
    @Min(message = "minimum 1kg", value = 1)
    private float weight;

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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
