package com.ssafy.whereismyhome.member.model;

import io.swagger.annotations.ApiModel;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "UpdateMemberResponseDto", description = "회원 수정 결과를 반환할 Dto")
public class UpdateMemberResponseDto {
    private int status;
    private String message;
}
