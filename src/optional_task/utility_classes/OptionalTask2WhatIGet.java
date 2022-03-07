package optional_task.utility_classes;

private class OptionalTask2WhatIGet {
    private int id;
    private String name;
    private String surname;
    private String occupation;
    private String color;

    private OptionalTask2WhatIGet(int id, String name, String surname, String occupation, String color) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.occupation = occupation;
        this.color = color;
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private String getOccupation() {
        return occupation;
    }

    private void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    private String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    @Override
    private String toString() {
        return "OptionalTask2WhatIGet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", occupation='" + occupation + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
