package com.dev.TaskManager.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Audit {

    private Long id;
    private String action;  // "CREATED", "UPDATED", "DELETED"
    private LocalDateTime timestamp;
    private User user;
    private Task task;
}
