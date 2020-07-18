package com.exterminator.app.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "end_user")
public class EndUser {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String username;

    @Column
    private String passDigest;

    @Enumerated(EnumType.STRING)
    @Column
    private Role role;

    @Column
    private Boolean hasUsedTrail;

    @Column
    private Timestamp trailStart;

    public enum Role {
        USER,
        PAID
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassDigest() {
        return passDigest;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Timestamp getTrailStart() {
        return trailStart;
    }

    public void setTrailStart(Timestamp trailStart) {
        this.trailStart = trailStart;
    }

    public Boolean getHasUsedTrail() {
        return hasUsedTrail;
    }

    public void setHasUsedTrail(Boolean hasUsedTrail) {
        this.hasUsedTrail = hasUsedTrail;
    }

    public void setPassDigest(String passDigest) {
        this.passDigest = passDigest;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
