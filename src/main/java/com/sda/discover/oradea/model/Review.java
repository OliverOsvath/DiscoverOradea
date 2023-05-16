package com.sda.discover.oradea.model;


import jakarta.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
