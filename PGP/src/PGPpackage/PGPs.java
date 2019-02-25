package PGPpackage;
public class PGPs { // открытый класс PGPs
	private String Ley = ""; // текст
	private int Probel = 0; // кол-во пробелов	
	public int Sum; // Итог
	
	public PGPs (String Ley) 
	{
		if (Ley == "")
		{		
			Sum = 0;
		} 		 
	   	else
	   	{
	   		this.Ley = Ley;	   		
	   		Calculate();	   		
	   	}	
		
}		 
	private void Calculate() // метод расчета количества символов
	{
		if(Ley.length() != 0){
	   		 for(int i=0;i<Ley.length();i++){ 	
	   			 Sum++; 
	   	 if (Ley.charAt(i) == '\n'){
	   	 	Probel++;
	   	 }
	   	 if (Ley.charAt(i) == ' '){
	    	 	Probel++;
	    	 }} }
	
		Sum=Ley.length()-Probel;
	}	
}
