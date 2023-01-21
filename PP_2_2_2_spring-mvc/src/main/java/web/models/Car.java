package web.models;

public class Car {
    private int id;
    private String model;
    private int age;

    public Car(int id, String model, int age) {
        this.id = id;
        this.model = model;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
