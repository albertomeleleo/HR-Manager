package com.agm.HRManager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "emploee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String surname;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false)
    private LocalDate birthDate;

    @ManyToMany
    @JoinTable(
            name = "emploee_role",
            joinColumns = @JoinColumn(name = "emploee_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

    @ManyToMany
    @JoinTable(
            name = "emploee_department",
            joinColumns = @JoinColumn(name = "emploee_id"),
            inverseJoinColumns = @JoinColumn(name = "department_id")
    )
    private Set<Department> departments;

    @ManyToMany
    @JoinTable(
            name = "eploee_training_path",
            joinColumns = @JoinColumn(name = "emploee_id"),
            inverseJoinColumns = @JoinColumn(name = "training_path_id")
    )
    private Set<TrainingPath> trainingPaths;
}
