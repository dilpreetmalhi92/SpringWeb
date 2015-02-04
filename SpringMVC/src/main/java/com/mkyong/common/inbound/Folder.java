package com.mkyong.common.inbound;

public class Folder 
{
	private String name;
	private int count;
	private double size;
	private String properties;
	private int[] subFolder;
	
	public Folder(){}
	public Folder(String name, int count, double size, String properties)
	{
		this.name= name;
		this.count=count;
		this.size=size;
		this.properties=properties;
		subFolder=new int[]{1,2,3,4};
		
	}
	public String getName(){
		return name;
	}
	public int getCount(){
		return count;
	}
	public double getSize(){
		return size;
	}
	public String getProperties(){
		return properties;
	}
	public int[] getSubFolder(){
		return subFolder;
	}
}
