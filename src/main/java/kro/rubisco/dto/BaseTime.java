package kro.rubisco.dto;

import java.util.Date;

public class BaseTime {
private Date createDate;
private Date updateDate;

public Date getCreateDate() {
	return createDate;
}
public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}
public Date getUpdateDate() {
	return updateDate;
}
public void setUpdateDate(Date updateDate) {
	this.updateDate = updateDate;
}


}