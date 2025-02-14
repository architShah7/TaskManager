package com.dev.TaskManager.model;

import com.dev.TaskManager.enums.TaskPriority;
import com.dev.TaskManager.enums.TaskStatus;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Task {

    private Long id;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;
    private LocalDateTime createdOn;
    private LocalDateTime lastUpdated;
    private User assignedUser;

}
