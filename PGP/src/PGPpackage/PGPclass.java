package PGPpackage;//����� ��� ���������� ��� ���������

//����������� ���������
import java.io.IOException; 
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PGPclass { 
public static void main(String[] args) throws IOException { 
	
	JPanel windowContent= new JPanel(); // ������ �����(������)
	
	 // ������ ���������� � ������
	 JLabel label = new JLabel("������� �����:");
	 JTextArea area = new JTextArea(20,50);
	 JLabel otvet = new JLabel("");
	 JButton go = new JButton("������� ��������");
	
	 go.addActionListener(new ActionListener() { //������� ���������� �������
         public void actionPerformed(ActionEvent e) { //����� ������
        	 
        	 //���������� ����������
        	 String str; 
        	 int Ley = 0, Probel = 0, Y = 0;
        	 
        	 str = area.getText(); //���������� ����������
        	 
        	 	if(str.length() != 0){ //���� ��������� ���� �� = 0
		        	 for(int i=0;i<str.length();i++){ 	//������� ���� ��������
		        			 Ley++;  
				        		if (str.charAt(i) == '\n'){//������� ��������� �����
				        				 Probel++;}
				        		if (str.charAt(i) == ' '){//������� ��������
				        				 Probel++;}} 
		        	 
				        		 Y=Ley-Probel;//������� �������� ��� ��������
				        		 
				        		 otvet.setText("� ������ "+Y+" ��������"); //����� ���������� ��������
				        	 	}
        	 		else{ //���� � ��������� ���� ����� ������� ��������������
        	 		JOptionPane.showMessageDialog(null, "������� �����","��������������",JOptionPane.WARNING_MESSAGE);
       }}});
	 
	
			 JFrame frame = new JFrame("������� ��������");// ������ ����
			 frame.setContentPane(windowContent);//����� ��� ���� �����
			 frame.setSize(600, 500);// ����� � ������
			 frame.setVisible(true); //������ ����� �������
	 
	// ��������� ���������� �� ������
		windowContent.add(label);
		 windowContent.add(area);
		 windowContent.add(otvet);
		 windowContent.add(go);
	   }}
