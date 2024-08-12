package com.agm.HRManager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "training_path")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainingPath {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String name;

    @Lob
    private String description;

    @ManyToMany(mappedBy = "trainingPaths")
    private Set<Employee> employees;

    @ManyToMany
    @JoinTable(
            name = "epic_training_path",
            joinColumns = @JoinColumn(name = "training_path_id"),
            inverseJoinColumns = @JoinColumn(name = "epic_id")
    )
    private Set<Epic> epics;
}
