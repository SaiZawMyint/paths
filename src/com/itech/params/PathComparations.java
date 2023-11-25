package com.itech.params;

import com.itech.params.exception.SizeNotMatchException;
import com.itech.params.tools.Path;
import com.itech.params.tools.PathData;

/**
 * <h2>PathComparations Class</h2>
 * <p>
 * Process for Displaying PathComparations
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class PathComparations {

	/**
	 * <h2>compare</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param path
	 * @param compare
	 * @return
	 * @return boolean
	 */
	public static boolean compare(String path, String compare) {
		Path map = new Path();
		PathData pathdata = (map.pathExtraction(path));
		PathData comparedata = (map.pathExtraction(compare));
		System.out.println(pathdata + "\n" + comparedata);
		if (pathdata.getSize() != comparedata.getSize())
			throw new SizeNotMatchException(pathdata.getSize(), comparedata.getSize());
		return map.comparePath(pathdata, comparedata);
	}

}
