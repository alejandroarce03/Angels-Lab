package model;

public class Candle{
	//atributes
	private String color;
	private String essence;
	private double size;
	private double luminosity;
	//methods
	public Candle(String color,String essence,double size,double luminosity){
		this.color = color;
		this.essence = essence;
		this.size = size;
		this.luminosity = luminosity;
	}
	public String toString(){
		return ("color: "+color+" essence: "+essence+" size: "+size+" luminosity: "+luminosity);
	}
	public String getColor(){
		return color;
	}
	public String getEssence(){
		return essence;
	}
}