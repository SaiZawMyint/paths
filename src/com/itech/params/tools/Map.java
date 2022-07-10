package com.itech.params.tools;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SaiZawMyint
 *
 */
public class Map {
	public PathData<?> pathExtraction(String path){
		PathData<String> lists = new PathData<String>();
		String copy = path;
		String[] paths = copy.split("/");
		List<String> pathSubject = new ArrayList<String>();
		List<String> selectorSubject = new ArrayList<String>();
		for(String val: paths) {
			if (val.length() == 0) continue;
			if(val.contains("{") && val.contains("}")) {
				selectorSubject.add(val);
				pathSubject.add("_");
			}else {
				pathSubject.add(val);
			}
		}
		lists.add(pathSubject,TYPE.NORMAL);
		lists.add(selectorSubject,TYPE.SELECTOR);
		lists.add(path,TYPE.COLLECTION);
		return lists;
	}
	@SuppressWarnings("unchecked")
	public boolean comparePath(PathData<?> pathdata, PathData<?> comparedata) {
		if(!this.validate(pathdata,comparedata))return false;
		List<String> orginalArys = (List<String>) pathdata.path;
		List<String> compareArys = (List<String>) comparedata.path;
		int c = 0;
		for(String org:orginalArys) {
			if(org.trim().equals("_"))continue;
			if(org.equals(compareArys.get(c))) {
				System.out.println(org+"\n"+compareArys.get(c));
			}
			c++;
		}
		return true;
	}
	private boolean validate(PathData<?> pathdata, PathData<?> comparedata) {
		return pathdata.toString().length() == comparedata.toString().length();
	}
}
