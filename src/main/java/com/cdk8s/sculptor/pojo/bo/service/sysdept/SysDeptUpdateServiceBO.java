package com.cdk8s.sculptor.pojo.bo.service.sysdept;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class SysDeptUpdateServiceBO implements Serializable {

	private static final long serialVersionUID = -1L;

	private Long id;
	private String deptName;
	private String deptCode;
	private Long parentId;
	private String parentIds;
	private Long leaderUserId;
	private String telephone;
	private String mobilePhone;
	private String deptFax;
	private String deptAddress;
	private Integer ranking;
	private String description;
	private Integer stateEnum;
	private Long updateDate;
	private Long updateUserId;

}
