package model;
public class Legion{
	//constants
	public static final String nameLegion="Maxima superior";
	//atributtes
	private Arcangel[] arcangels;
	private int numArcangels;
	private Arcangel arcangel;
	//methods
	public Legion(int numArcangels){
		this.numArcangels = numArcangels;
		this.arcangels = new Arcangel[numArcangels];
	}
	/*
	*This method creates an archangel
	*pre: the array arcangels! = null
	*post: the method evaluates whether the name for the arcangel ends in "el" and if so creates an arcangel in the arcangels array
	@param nameArcangel is the name of the archangel, nameArcangel! = null && nameArcangel! = ""
     @param prayer is the archangel's prayer, prayer! = null && prayer! = ""
	@param date is the date of celebration of the archangel, date! = null && date! = ""
	@param photo is the name of the photo of the archangel, photo! = null && photo! = ""
	@param color is the color of the archangel candle, color! = null && color! = ""
	@param power is the power of the archangel, power! = null && power! = ""
	@param essense is the essence of the archangel candle, essence! = null && essence! = ""
	@param size is the size of the archangel candle, size! = null && size! = 0
	@param luminosity is the degree of illuminance of the archangel candle, luminosity! = null && luminosity! = 0
	@return arcangel is the arcangel type object
	*/
	public Arcangel arcangel(String nameArcangel,String prayer,String date,String photo,String power,String color,String essence,double size,double luminosity){
		String l = Character.toString(nameArcangel.charAt(nameArcangel.length()-1));
		String e = Character.toString(nameArcangel.charAt(nameArcangel.length()-2));
		boolean cont = false;
		 for(int i=0;i<arcangels.length && !cont ;i++){
			 if(arcangels[i]==null){
			     if(l.equalsIgnoreCase("l") && e.equalsIgnoreCase("e")){
				  arcangel = new Arcangel(nameArcangel,prayer,date,photo,power,color,essence,size,luminosity);
				  arcangels[i]=arcangel;
				  cont = true;
				 }
				 
			  }
		}
		return arcangel;
		
	}
	/*
	* This method is what counts archangels
	* pre: the array arcangels! = null, and must have objects of type Arcangel
	* post: at the end of the method count how many archangels are in the legion
	@return count is the number of archangels in the legion
	*/
	public int countArcangels(){
		int count = 0;
		for(int i=0;i<arcangels.length;i++){
			if(arcangels[i]==arcangel){
				count++;
			}
		}
		return count;
	}
	public int getNumArcangels(){
		return numArcangels;
	}

	/*
	* The method searches for an archangel by name
	* pre: the array arcangels! = null
	* post: at the end of the method, look for the arcangels array looking for an archangel with the name you want to search
	@param searchArcangel is the name of the archangel you want to search, searchArcangel! = null && searchArcangel! = ""
	@return search is the arcangel type object
	*/
	public Arcangel searchNameOfArcangel(String searchArcangel){
		Arcangel search=null;
		boolean cont = false;
		
		for(int i=0;i<arcangels.length && !cont;i++){
			if(arcangels[i].getName().equalsIgnoreCase(searchArcangel)){
				search=arcangels[i];
				cont = true ;
			}
		}
		return search;
	}
	/*
	* The method shows the celebrations according to the month
	* pre: the array arcangels! = null
	* post: at the end of the method displays the name, the day of the celebration of the archangel, the color of the candle and its essence
	@param searchMonth is the month you want to search for celebrations, searchMonth! = null && searchMonth! = ""
	@return finalArcangels is the list of the information of the archangels
	*/
	public String searchByDate(String searchMonth){
		String foundArcangels = "";
		String finalArcangels= "";
		for(int i=0;i<arcangels.length;i++){
			if(arcangels[i].getDate().endsWith(searchMonth)){
			foundArcangels =" Name arcangel: "+arcangels[i].getName()+" date of celebration: "+arcangels[i].getDate()+"\n Color of candle: "+arcangels[i].getCandle().getColor()+" essence of candle: "+arcangels[i].getCandle().getEssence()+"\n";
				finalArcangels+= foundArcangels;
			}
		}
		return finalArcangels;
		
	}
	/*
	* The method displays all the celebrations of the archangels
	* pre: the array arcangels! = null
	* post: at the end it shows the name and date of celebration of each archangel of the legion
	* @ return final Celebrations is the information of all the archangels
	*/
	public String disployCelebrations(){
		String allCelebrations = "";
		String finalCelebrations = "";
	   for(int i=0;i<arcangels.length;i++){
		   allCelebrations = arcangels[i].getName()+" : "+arcangels[i].getDate()+"\n";
		   finalCelebrations += allCelebrations;
	   }
	   return finalCelebrations;
	}
	public Arcangel[] getArcangels(){
		return arcangels;
	}
}