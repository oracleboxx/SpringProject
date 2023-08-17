package kro.rubisco.dto;

public class CommentDTO {
private Long commentId;
private Long documentId;
private String content;
private Long likeCount;
private Long dislikeCount;
private Long memberId;
private BoardDTO board;
private MemberDTO member;
public Long getCommentId() {
	return commentId;
}
public void setCommentId(Long commentId) {
	this.commentId = commentId;
}
public Long getDocumentId() {
	return documentId;
}
public void setDocumentId(Long documentId) {
	this.documentId = documentId;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Long getLikeCount() {
	return likeCount;
}
public void setLikeCount(Long likeCount) {
	this.likeCount = likeCount;
}
public Long getDislikeCount() {
	return dislikeCount;
}
public void setDislikeCount(Long dislikeCount) {
	this.dislikeCount = dislikeCount;
}
public Long getMemberId() {
	return memberId;
}
public void setMemberId(Long memberId) {
	this.memberId = memberId;
}
public BoardDTO getBoard() {
	return board;
}
public void setBoard(BoardDTO board) {
	this.board = board;
}
public MemberDTO getMember() {
	return member;
}
public void setMember(MemberDTO member) {
	this.member = member;
}
}
