package PGPpackage;
import java.io.IOException; // импортируемые библиотеки
import java.util.Scanner;

public class PGPclass {  //открытый класс PGPclass
	 
	// метод main Ц точка начала выполнени€ программы
	public static void main(String[] args) throws IOException, Exception 
	{ 
	  Scanner sc = new Scanner(System.in); // класс дл€ ввода информации
	
        String Ley = ""; 
    
		
        try // проверка выполнени€ кода
        {        	
		System.out.print("¬ведите текст: "); 
		Ley = sc.nextLine() ; 
        }
       
        
        catch(Exception e) // в случае исключени€
		{   
            System.out.println("Incorrect format!");
    		sc.close();      	
   		}

     // создание экземпл€ра класса PGPs
        PGPs s = new PGPs(Ley);
		
		System.out.println("--------------------------------");
		System.out.println(" оличество символов в тексте: " + s.Sum);

    	sc.close(); // освобождение ресурсов
}
}
