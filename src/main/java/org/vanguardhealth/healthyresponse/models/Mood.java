package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Mood {




    @Id
    @GeneratedValue
    private Long id;

    private String mood;
    private String moodImage;
    @Lob
    private String moodDefinition;
    private String moodArticle1;
    private String moodArticle2;
    private String moodArticle3;
    private String moodPhoneResource1;
    private String moodPhoneResource2;
    private String moodPhoneResource3;
    private String moodVideo;

    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Trigger> trigger;

    @OneToMany(mappedBy = "mood")
    @JsonIgnore
    private Collection<User> users;

    public Long getId() {
        return id;
    }

    public Collection<User> getUsers() {
        return users;
    }


    public Collection<Trigger> getTrigger() {
        return trigger;
    }

    public String getMood() {
        return mood;
    }

    public String getMoodImage() {
        return moodImage;
    }

    public String getMoodDefinition() {
        return moodDefinition;
    }

    public String getMoodArticle1() {
        return moodArticle1;
    }

    public String getMoodArticle2() {
        return moodArticle2;
    }

    public String getMoodArticle3() {
        return moodArticle3;
    }

    public String getMoodPhoneResource1() {
        return moodPhoneResource1;
    }

    public String getMoodPhoneResource2() {
        return moodPhoneResource2;
    }

    public String getMoodPhoneResource3() {
        return moodPhoneResource3;
    }

    public String getMoodVideo() {
        return moodVideo;
    }

    //    public Mood(String mood, Trigger... trigger){
//        this.mood = mood;
//        this.trigger = Arrays.asList(trigger);
//    }
    public Mood(String mood, String moodImage, String moodDefinition, String moodArticle1, String moodArticle2, String moodArticle3, String moodPhoneResource1, String moodPhoneResource2, String moodPhoneResource3, String moodVideo){
        this.mood = mood;
        this.moodImage = moodImage;
        this.moodDefinition = moodDefinition;
        this.moodArticle1 = moodArticle1;
        this.moodArticle2 = moodArticle2;
        this.moodArticle3 = moodArticle3;
        this.moodPhoneResource1 = moodPhoneResource1;
        this.moodPhoneResource2 = moodPhoneResource2;
        this.moodPhoneResource3 = moodPhoneResource3;
        this.moodVideo = moodVideo;

    }
    public Mood(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mood mood = (Mood) o;
        return Objects.equals(id, mood.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}