package com.itech.params;

import java.util.List;

import com.itech.params.tools.Map;
import com.itech.params.tools.PathData;

/**
 * @author SaiZawMyint
 *
 */
public class PathComparations {

	@SuppressWarnings("unchecked")
	public static boolean compare(String path,String compare) {
		Map map = new Map();
		PathData<?> pathdata = (map.pathExtraction(path));
		PathData<?> comparedata = (map.pathExtraction(compare));
		if(pathdata.getSize() != comparedata.getSize())throw new Error("error");
		System.out.println(map.comparePath(pathdata, comparedata));
		return true;
	}
	public static void main(String[] args) {
		PathComparations.compare("ferry/{id}/{od}", "ferry/3/2");
	}

}
