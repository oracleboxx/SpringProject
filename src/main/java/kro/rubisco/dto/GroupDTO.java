package kro.rubisco.dto;

public class GroupDTO extends BaseTime{
private Long groupId;
private String groupName;
public Long getGroupId() {
	return groupId;
}
public void setGroupId(Long groupId) {
	this.groupId = groupId;
}
public String getGroupName() {
	return groupName;
}
public void setGroupName(String groupName) {
	this.groupName = groupName;
}

}
