package ru.otus.example.ormdemo.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OtusStudent {
    @Id
    private long id;
    private String name;

    //private Avatar avatar;
    //private List<EMail> emails;
    //private List<Course> courses;
}
