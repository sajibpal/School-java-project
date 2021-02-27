package login;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Container;
import java.sql.*;
import javax.swing.*;


 class hoom extends JFrame {

	private JFrame frmSajibPal;
	private JTextField textField;
	private JPasswordField textField_1;
	private JTextField textField_2;
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public hoom() {
		
	conn=sqlconnection. ConnecrDb();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Container frmSajibPal =this.getContentPane();
		frmSajibPal.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 584, 433);
		frmSajibPal.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User name :");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(34, 66, 102, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(34, 134, 84, 35);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile :");
		lblNewLabel_2.setForeground(new Color(34, 139, 34));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(34, 210, 84, 35);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Birthday :");
		lblNewLabel_3.setForeground(new Color(34, 139, 34));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(34, 271, 84, 35);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(118, 75, 124, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(118, 143, 124, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(118, 219, 124, 26);
		panel.add(textField_2);
		textField_2.setColumns(10); 
		
		
		String[] day=new String[40];
		for(int i=0;i<33;i++){
		 
			day[i]=Integer.toString(i);
		}
		JComboBox comboBox = new JComboBox(day);
		comboBox.setBounds(108, 280, 84, 26);
		panel.add(comboBox);
		
		
		String[] month={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		JComboBox comboBox_1=new JComboBox(month);
		comboBox_1.setBounds(220, 280, 89, 26);
		panel.add(comboBox_1);
		
		
		String[] year=new String[80];
		for(int i=1970;i<2030;i++){
		 
		   year[i-1970]=Integer.toString(i);
		}
		JComboBox comboBox_2=new JComboBox(year);
		comboBox_2.setBounds(336, 280, 78, 26);
		panel.add(comboBox_2);
		
		JCheckBox checkbox = new JCheckBox("I Accept All Conditon");
		checkbox.setForeground(new Color(34, 139, 34));
		checkbox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkbox.setBounds(64, 355, 165, 23);
		panel.add(checkbox);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(new Color(34, 139, 34));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkbox.isSelected()){
			 		String name=textField.getText();
					String password=textField_1.getText();
					String mobile=textField_2.getText();
					String day=(String)comboBox.getSelectedItem();
					String month=(String)comboBox_1.getSelectedItem();
					String year=(String)comboBox_2.getSelectedItem();
					
					String birthday=day+"/"+month+"/"+year;
					 
					try{
						
						
						String sql="insert into sajib1 (user_name,password,mobile,birthday) values (?,?,?,?)";
						pst=conn.prepareStatement(sql);
						
						pst.setString(1, textField.getText());
						pst.setString(2, textField_1.getText());
						pst.setString(3, textField_2.getText());
						pst.setString(4,birthday);
						
						pst.execute();
						pst.close();
						JOptionPane.showMessageDialog(null, "Login ok");
						
					 login(); 
					 close();

					}catch(Exception e2){
						
						 
					JOptionPane.showMessageDialog(null, e2);
						
					}
					
					
			    }
				else{
			 	
				 JOptionPane.showMessageDialog(null, "Check all option");
			 	 }	
			}		
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSubmit.setBounds(258, 356, 89, 23);
		panel.add(btnSubmit);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(new Color(72, 209, 204));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setIcon(new ImageIcon("DUET Logo.jpg"));
		lblNewLabel_4.setBounds(430, 11, 144, 129);
		panel.add(lblNewLabel_4);
	}
	 
    void close(){
		
		WindowEvent windowclose= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowclose);
	}	
	
    void login() {
   	 
    	 
		data k = new data();
		k.setVisible(true);	
        k.setBounds(100, 100, 735, 503);
		k.setTitle("sajib pal");
   		
   	}

 }
 
 public class databaselogin1{ 
	 
   public static void main(String[] args) {
		
	   try{
			
		    UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

			 }
			catch(Exception e){
					
			}
	   
	    hoom win = new hoom();
		win.setVisible(true);
		win.setBounds(100, 100, 610, 500);
		win.setTitle("sajib pal");
				
		}
		
	}
