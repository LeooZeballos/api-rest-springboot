package com.leozeballos.apirestspringboot.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntryDTO {

    private Long id;
    private String title;
    private String description;
    private String content;

}
