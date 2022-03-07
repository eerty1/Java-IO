package optional_task.utility_classes;

public class OptionalTask2WhatITake {
    public int id;
    public String name;
    public String surname;
    public String occupation;
    public String color;

    public OptionalTask2WhatITake(int id, String name, String surname, String occupation, String color) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.occupation = occupation;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "OptionalTask2WhatITake{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", occupation='" + occupation + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
