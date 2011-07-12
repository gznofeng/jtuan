package framework.dao;

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable {
	
	public int start=0;
	public int size=10;
	public int total=-1;
	public List<T> data;
	
	
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
