package com.uworks.domain;

import javax.persistence.*;

/**
 * 标签
 */
@Entity
@Table(name = "label")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long        id;
    /**
     * 标签名称
     */
    private String      name;

    public Label() {
    }

    public Label(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
