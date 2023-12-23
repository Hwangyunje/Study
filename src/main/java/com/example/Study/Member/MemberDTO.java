package com.example.Study.Member;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MemberDTO {

	private String id;
	private String password;
	private String name;
	private String email;
	private Date birth;
	private int phone;
}
