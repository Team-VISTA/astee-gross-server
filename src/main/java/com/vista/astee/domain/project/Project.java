package com.vista.astee.domain.project;

import com.vista.astee.domain.BaseTimeEntity;
import com.vista.astee.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name="projects")
public class Project extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String name;

    @Builder
    private Project(User user, String name) {
        this.user = user;
        this.name = name;
    }
}
