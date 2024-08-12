package com.agm.HRManager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "epic_training_path")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EpicTrainingPath {

    @Id
    @ManyToOne
    @JoinColumn(name = "epic_id")
    private Epic epic;

    @Id
    @ManyToOne
    @JoinColumn(name = "training_path_id")
    private TrainingPath trainingPath;
}
