package com.itech.params;

import com.itech.params.tools.Map;
import com.itech.params.tools.PathData;

/**
 * <h2> PathComparations Class</h2>
 * <p>
 * Process for Displaying PathComparations
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class PathComparations {

	/**
	 * <h2> compare</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param path
	 * @param compare
	 * @return
	 * @return boolean
	 */
	public static boolean compare(String path,String compare) {
		Map map = new Map();
		PathData<?> pathdata = (map.pathExtraction(path));
		PathData<?> comparedata = (map.pathExtraction(compare));
		if(pathdata.getSize() != comparedata.getSize())throw new Error("error");
		return true;
	}

}
