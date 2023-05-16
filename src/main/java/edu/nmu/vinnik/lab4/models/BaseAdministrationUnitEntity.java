package edu.nmu.vinnik.lab4.models;

public abstract class BaseAdministrationUnitEntity {
    private String name;
    private Human head;

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHead(Human head) {
        this.head = head;
    }
}
