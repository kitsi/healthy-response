package org.vanguardhealth.healthyresponse.models;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Mood {


    private String mood;

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private Collection<Trigger> categories;

    @OneToMany(mappedBy = "mood")
    private Collection<User> users;

    public Long getId() {
        return id;
    }

    public Collection<User> getUsers() {
        return users;
    }



    public Collection<Trigger> getCategory() {
        return categories;
    }

    public String getMood() {
        return mood;
    }

    public Mood(String mood, Trigger... trigger){
        this.mood = mood;
        this.categories = Arrays.asList(trigger);
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