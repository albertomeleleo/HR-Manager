package com.agm.HRManager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Set;
@Entity
@Table(name = "epic")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Epic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String name;

    @Lob
    private String description;

    @ManyToMany(mappedBy = "epics")
    private Set<TrainingPath> trainingPaths;
}
