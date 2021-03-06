package com.leozeballos.apirestspringboot.dto;

import com.leozeballos.apirestspringboot.entity.Comment;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntryDTO {

    private Long id;

    @NotEmpty(message = "The title cannot be empty")
    @Size(min = 2, message = "The title must be at least 2 characters long")
    private String title;

    @NotEmpty(message = "The content cannot be empty")
    @Size(min = 10, message = "The description must be at least 10 characters long")
    private String description;

    @NotEmpty(message = "The email cannot be empty")
    private String content;

    private Set<Comment> comments;

}
