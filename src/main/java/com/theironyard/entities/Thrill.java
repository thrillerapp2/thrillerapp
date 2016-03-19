package com.theironyard.entities;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by noellemachin on 3/17/16.
 */
@Entity
@Table(name = "thrills")
public class Thrill {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String title;

//    @Column(nullable = false)
//    LocalDateTime postTime;
//
//    @Column(nullable = false)
//    LocalDate date;

    @Column(nullable = false)
    String location;

    @Column(nullable = false)
    String summary;

    @Column(nullable = false)
    String profileFileName;

    @Transient
    MultipartFile image;

    @ManyToOne
    User user;

    public Thrill(String title, String location, String summary, User user, String profileFileName) { // LocalDateTime postTime, LocalDate date,
        this.title = title;
//        this.postTime = postTime;
//        this.date = date;
        this.location = location;
        this.summary = summary;
        this.user = user;
        this.profileFileName = profileFileName  ;
    }

    public Thrill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public LocalDateTime getPostTime() {
//        return postTime;
//    }
//
//    public void setPostTime(LocalDateTime postTime) {
//        this.postTime = postTime;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getProfileFileName() {
        return profileFileName;
    }

    public void setProfileFileName(String profileFileName) {
        this.profileFileName = profileFileName;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
