package com.jida.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Direction implements Serializable{
	/**
	 * 
	 */
	//private static final long serialVersionUID = -5374086001620963711L;
	private String name;
	private String text;
}
