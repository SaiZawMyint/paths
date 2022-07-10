package com.itech.params.tools;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SaiZawMyint
 *
 */
public class PathData<E> {
	private int size = 0;
	private Map<String,Object> lists;
	public Object path;
	public Object selector;
	public Object collection;
	
	public PathData() {
		lists = new HashMap<String,Object>();
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Map<String, Object> getLists() {
		return lists;
	}
	public void setLists(Map<String, Object> lists) {
		this.lists = lists;
	}

	public void add(Object obj) {
		this.lists.put("Path", obj);
	}
	public void add(Object obj, TYPE type) {
		
		if(type == TYPE.NORMAL) {
			this.lists.put("Path", obj);
			this.path = obj;
		}
		if(type == TYPE.COLLECTION){
			this.lists.put("collection", obj);
			this.collection = obj;
		}
		if(type == TYPE.SELECTOR){
			this.lists.put("selector", obj);
			this.selector = obj;
		}
		
	}
	@Override
	public String toString() {
		String toStr = "";
		for(Map.Entry<String, Object> entry:this.lists.entrySet()) {
			toStr += "\""+entry.getKey()+"\": "+ entry.getValue()+", ";
		}
		toStr = toStr.substring(0, toStr.length()-2);
		return "{ "+toStr+"} ";
	}
}
