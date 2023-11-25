package com.itech.tools.exception;

public class SizeNotMatchException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7292756723206049510L;
	
	private final Integer size1;
	private final Integer size2;
	
	public SizeNotMatchException(Integer size1, Integer size2) {
		super(String.format("Path size do not match >> size1 [%d] & size2 [%d]", size1, size2));
		this.size1 = size1;
		this.size2 = size2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getSize1() {
		return size1;
	}

	public Integer getSize2() {
		return size2;
	}

}
