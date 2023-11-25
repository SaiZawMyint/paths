package com.itech.params.tools;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PathData implements Serializable {
	/**
     * <h2> serialVersionUID</h2>
     * <p>
     * serialVersionUID
     * </p>
     */
    private static final long serialVersionUID = -2541309647992078936L;
    /**
     * <h2> size</h2>
     * <p>
     * size
     * </p>
     */
    private int size = 0;
	/**
	 * <h2> lists</h2>
	 * <p>
	 * lists
	 * </p>
	 */
	private Map<String,Object> lists;
	/**
	 * <h2> path</h2>
	 * <p>
	 * path
	 * </p>
	 */
	public Object path;
	/**
	 * <h2> selector</h2>
	 * <p>
	 * selector
	 * </p>
	 */
	public Object selector;
	/**
	 * <h2> collection</h2>
	 * <p>
	 * collection
	 * </p>
	 */
	public Object collection;
	
	/**
	 * <h2> Constructor for PathData </h2>
	 * <p>
	 * Constructor for PathData
	 * </p>
	 */
	public PathData() {
		lists = new HashMap<String,Object>();
	}
	
	/**
	 * <h2> getSize</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return int
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <h2> setSize</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param size
	 * @return void
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * <h2> getLists</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return Map<String,Object>
	 */
	public Map<String, Object> getLists() {
		return lists;
	}
	/**
	 * <h2> setLists</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param lists
	 * @return void
	 */
	public void setLists(Map<String, Object> lists) {
		this.lists = lists;
	}

	/**
	 * <h2> add</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param obj
	 * @return void
	 */
	public void add(Object obj) {
		this.lists.put("Path", obj);
	}
	/**
	 * <h2> add</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param obj
	 * @param type
	 * @return void
	 */
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
	/**
	 * <h2> toString </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
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
