package com.itech.tools.path.tools;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>Path Class</h2>
 * <p>
 * Process for Displaying Map
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Path {
	/**
	 * <h2>pathExtraction</h2>
	 * <p>
	 * Get path data of given params string.
	 * </p>
	 *
	 * @param path
	 * @return
	 * @return PathData<?>
	 */
	public PathData pathExtraction(String path) {
		PathData lists = new PathData();
		String copy = path;
		String[] paths = copy.split(Constants.BACK_SLASH);
		List<String> pathSubject = new ArrayList<String>();
		List<String> selectorSubject = new ArrayList<String>();
		for (String val : paths) {
			if (val.length() == 0)
				continue;
			if (val.contains(Constants.BRACKET_1) && val.contains(Constants.BRACKET_2)) {
				selectorSubject.add(val);
				pathSubject.add(Constants.UNDER_SCORE);
			} else {
				pathSubject.add(val);
			}
		}
		lists.add(pathSubject, TYPE.NORMAL);
		lists.add(selectorSubject, TYPE.SELECTOR);
		lists.add(path, TYPE.COLLECTION);
		return lists;
	}

	/**
	 * <h2>comparePath</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param pathdata
	 * @param comparedata
	 * @return
	 * @return boolean
	 */
	@SuppressWarnings("unchecked")
	public boolean comparePath(PathData pathdata, PathData comparedata) {
		if (!this.validate(pathdata, comparedata))
			return false;
		List<String> orginalArys = (List<String>) pathdata.path;
		List<String> compareArys = (List<String>) comparedata.path;
		String standStr = (String) comparedata.collection;
		int c = 0;
		String comp = "";
		for (String org : orginalArys) {

			if (org.trim().equals(Constants.UNDER_SCORE)) {
				comp += Constants.BACK_SLASH + compareArys.get(c);
			} else {
				comp += Constants.BACK_SLASH + org;
			}
			c++;
		}
		
		if(standStr.endsWith(Constants.BACK_SLASH)) {
			standStr = standStr.substring(0, standStr.length() - 1);
		}
		return comp.trim().equals(standStr.trim());
	}

	/**
	 * <h2>validate</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param pathdata
	 * @param comparedata
	 * @return
	 * @return boolean
	 */
	@SuppressWarnings("unchecked")
	private boolean validate(PathData pathdata, PathData comparedata) {
		return ((List<Object>) pathdata.path).size() == ((List<Object>) comparedata.path).size();
	}
}
