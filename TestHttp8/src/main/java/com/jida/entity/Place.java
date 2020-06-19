package com.jida.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class Place implements Serializable{
	/**
	 * 
	 */
	//private static final long serialVersionUID = -7647420424567254758L;
	private String name;
	private List<Direction> direction;
	private String description;
	//是否安全区
	private boolean isSafe;
	public Place(String name, List<Direction> direction) {
		this.name = name;
		this.direction = direction;
	}

	/*public Place(String name, List<Direction> direction,String description) {
		this.name = name;
		this.direction = direction;
		this.description = description;
	}*/
}
