package kro.rubisco.dto;

import java.util.List;

public class BoardDTO {
private Long documentId;
private Long categoryId;
private Boolean isNotice;
private String title;
private String content;
private Long lieCount;
private Long dislikeCount;
private Long readCount;
private Long memberId;
private Long  groupId;
private List<CommentDTO> commentList;
private CategoryDTO category;
private MemberDTO member;
private GroupDTO group;
public Long getDocumentId() {
	return documentId;
}
public void setDocumentId(Long documentId) {
	this.documentId = documentId;
}
public Long getCategoryId() {
	return categoryId;
}
public void setCategoryId(Long categoryId) {
	this.categoryId = categoryId;
}
public Boolean getIsNotice() {
	return isNotice;
}
public void setIsNotice(Boolean isNotice) {
	this.isNotice = isNotice;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Long getLieCount() {
	return lieCount;
}
public void setLieCount(Long lieCount) {
	this.lieCount = lieCount;
}
public Long getDislikeCount() {
	return dislikeCount;
}
public void setDislikeCount(Long dislikeCount) {
	this.dislikeCount = dislikeCount;
}
public Long getReadCount() {
	return readCount;
}
public void setReadCount(Long readCount) {
	this.readCount = readCount;
}
public Long getMemberId() {
	return memberId;
}
public void setMemberId(Long memberId) {
	this.memberId = memberId;
}
public Long getGroupId() {
	return groupId;
}
public void setGroupId(Long groupId) {
	this.groupId = groupId;
}
public List<CommentDTO> getCommentList() {
	return commentList;
}
public void setCommentList(List<CommentDTO> commentList) {
	this.commentList = commentList;
}
public CategoryDTO getCategory() {
	return category;
}
public void setCategory(CategoryDTO category) {
	this.category = category;
}
public MemberDTO getMember() {
	return member;
}
public void setMember(MemberDTO member) {
	this.member = member;
}
public GroupDTO getGroup() {
	return group;
}
public void setGroup(GroupDTO group) {
	this.group = group;
}


}
