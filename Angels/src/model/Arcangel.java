package model;

public class Arcangel{
	//atributtes
	private String name;
	private String prayer;
	private String date;
	private String power;
	private String photo;
	private Candle candle;
	//methods
	public Arcangel(String name,String prayer,String date,String photo,String power, String color,String essence,double size,double luminosity){
		this.name = name;
		this.photo = photo;
		this.prayer = prayer;
		this.date = date;
		this.power = power;
		candle = new Candle(color,essence,size,luminosity);
	}
	public void candle(String color,String essence,double size,double luminosity){
		
	}
	public String toString(){
		return ("The name of arcangel is "+name+" prayer: "+prayer+" date: "+date+" power: "+power+" photo: "+photo+ " the candle: " +candle);
	}
	public String getName(){
		return name;
	}
	public String getDate(){
		return date;
	}
	public Candle getCandle(){
		return candle;
	}
}