package com.study.jpa.chap05_practice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
public class PostModifyDTO {

    @NotBlank
    @Size(min = 1, max = 20)
    private String title;
    private String content;

    @NotNull
    private Long postNo = 0L;
}
