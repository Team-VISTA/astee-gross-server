package com.vista.astee.domain.component;
import com.vista.astee.domain.project.Project;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name="components")
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long componentId;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    private ComponentCategory category;
    private String filepath;

    @Builder
    private Component(Project project, ComponentCategory category, String filepath) {
        this.project = project;
        this.category = category;
        this.filepath = filepath;
    }
}