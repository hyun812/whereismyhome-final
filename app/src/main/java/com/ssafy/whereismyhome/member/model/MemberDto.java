package com.ssafy.whereismyhome.member.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "MemberDto (회원정보)", description = "회원정보를 관리 할 Dto")
public class MemberDto {
	@ApiModelProperty(value = "회원 아이디") // 상세 설명
	private String user_id;
	@ApiModelProperty(value = "회원 이름")
	private String name;
	@ApiModelProperty(value = "회원 비밀번호")
	private String password;
	@ApiModelProperty(value = "회원 나이")
	private int age;
	@ApiModelProperty(value = "회원 성별")
	private String sex;
	@ApiModelProperty(value = "회원 이메일")
	private String email_account;
	@ApiModelProperty(value = "회원 이메일 도메인 ")
	private String email_domain;
	@ApiModelProperty(value = "회원 권한")
	private String authorization;
	@ApiModelProperty(value = "회원 생성 시간")
	private String created_time;
	@ApiModelProperty(value = "회원 수정 시간")
	private String updated_time;
	@ApiModelProperty(value = "회원 삭제 시간")
	private String deleted_time;
	
	
}
