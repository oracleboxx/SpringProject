package kro.rubisco.dto;

import java.util.ArrayList;
import java.util.List;

public class PageDTO<T> {
private static final long pageSize =10;

private long page;
private long size =10;
private long totalSize;


private List<T> contentList = new ArrayList<T>();
	






public List<T> getContentList() {
	return contentList;
}
public void setContentList(List<T> contentList) {
	this.contentList = contentList;
}
public long getPage() {
	return page;
}
public void setPage(long page) {
	this.page = page;
}
public long getSize() {
	return size;
}
public void setSize(long size) {
	this.size = size;
}
public long getTotalsize() {
	return totalSize;
}
public void setTotalsize(long totalsize) {
	this.totalSize = totalsize;
}
public static long getPagesize() {
	return pageSize;
}


public long getPages() {
	return page <1 ? 1: page;
}

public long getTotalPage() {
	return (long)Math.ceil((double)totalSize/size);
}

public boolean getHasPrev() {
	return page <= 1? false : true;
	
}


public boolean getHasNext() {
	return page>= getTotalPage() ? false: true;
}


public long getFirstPage() {
	return ((getPage()-1)/pageSize|0)*pageSize +1;
}

public long getLastPage() {
	long lastPage = ((getPage()-1)/pageSize|0)*pageSize +pageSize;
	return lastPage < getTotalPage() ? lastPage : getTotalPage();
}

public long getFirst() {
	long first= (getPage()-1) * size + 1;
	return first <1 ? 1:first;
}


public long getLast() {
	return getFirst() + size -1;
}

public String getUrl(String base, long i) {
	if(i > 1 && size != 10) base += "?page=" + i+"&size=" + size;
	else if(i>1) base += "?page=" + i;
	else if(size != 10)base += "?size=" +size;
	return base;
}
}
