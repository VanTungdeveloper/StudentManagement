package model;

public class Person {
    private static int countId = 0;
    private Integer id = 0;
    private String name;
    private String birthDay;
    private String address;
    private Double height;
    private Double weight;
    public Person() {
        setId(++countId);
    }



    private void setId(int i) {
        this.id = i;
    }


    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "model.Person{" +
                "ID = " + id +
                ", Name='" + name + '\'' +
                ", BirthDay =" + birthDay +
                ", Address='" + address + '\'' +
                ", Height=" + height +
                ", Weight=" + weight +
                '}';
    }
}
