package com.itech.tools;

import com.itech.tools.exception.SizeNotMatchException;
import com.itech.tools.path.tools.Path;
import com.itech.tools.path.tools.PathData;

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
