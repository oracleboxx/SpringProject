package kro.rubisco.dto;

import java.util.Date;

public class MemberDTO {
private Long memberId;
private String password;
private String email;
private String name;
private String nickname;
private Long groupId;
private GroupDTO group;
private Date createDate;
private Date lastLogin;
public Long getMemberId() {
	return memberId;
}
public void setMemberId(Long memberId) {
	this.memberId = memberId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}
public Long getGroupId() {
	return groupId;
}
public void setGroupId(Long groupId) {
	this.groupId = groupId;
}
public GroupDTO getGroup() {
	return group;
}
public void setGroup(GroupDTO group) {
	this.group = group;
}
public Date getCreateDate() {
	return createDate;
}
public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}
public Date getLastLogin() {
	return lastLogin;
}
public void setLastLogin(Date lastLogin) {
	this.lastLogin = lastLogin;
}

}
