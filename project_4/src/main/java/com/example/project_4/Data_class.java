package com.example.project_4;


import jakarta.persistence.*;

@Entity
@Table(
        name = "app_user"
)
public class Data_class {
    private String name;
    @Id
    @SequenceGenerator(
            name = "sequence_user",
            sequenceName = "sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence_user"
    )
    private int ID;

    public Data_class() {
    }

    public Data_class(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}
