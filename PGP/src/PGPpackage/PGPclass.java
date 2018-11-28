package PGPpackage;//Папка где находиться код программы

//Подключения библиотек
import java.io.IOException; 
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PGPclass { 
public static void main(String[] args) throws IOException { 
	
	JPanel windowContent= new JPanel(); // Создаём форму(панель)
	
	 // Создаём компоненты в памяти
	 JLabel label = new JLabel("Введите текст:");
	 JTextArea area = new JTextArea(20,50);
	 JLabel otvet = new JLabel("");
	 JButton go = new JButton("Подсчет символов");
	
	 go.addActionListener(new ActionListener() { //Создаем обработчик события
         public void actionPerformed(ActionEvent e) { //вызов класса
        	 
        	 //объявление переменных
        	 String str; 
        	 int Ley = 0, Probel = 0, Y = 0;
        	 
        	 str = area.getText(); //присвоение переменной
        	 
        	 	if(str.length() != 0){ //если текстовое поле не = 0
		        	 for(int i=0;i<str.length();i++){ 	//подсчет всех символов
		        			 Ley++;  
				        		if (str.charAt(i) == '\n'){//подсчет переносов строк
				        				 Probel++;}
				        		if (str.charAt(i) == ' '){//подсчет пробелов
				        				 Probel++;}} 
		        	 
				        		 Y=Ley-Probel;//подсчет символов без пробелов
				        		 
				        		 otvet.setText("В тексте "+Y+" символов"); //вывод количества символов
				        	 	}
        	 		else{ //если в текстовом поле пусто выводим предупреждение
        	 		JOptionPane.showMessageDialog(null, "Введите текст","Предупреждение",JOptionPane.WARNING_MESSAGE);
       }}});
	 
	
			 JFrame frame = new JFrame("Подсчет символов");// создаём окно
			 frame.setContentPane(windowContent);//задаём для него форму
			 frame.setSize(600, 500);// задаём и размер
			 frame.setVisible(true); //делаем фрейм видимым
	 
	// Добавляем компоненты на панель
		windowContent.add(label);
		 windowContent.add(area);
		 windowContent.add(otvet);
		 windowContent.add(go);
	   }}
