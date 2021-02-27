package login;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;

 class data extends JFrame{


	private JTextField textField;
	private JPasswordField passwordField;

	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	String databasepass;
	String databasename;
	
	

	/**
	 * Create the application.
	 */
	public data() {
		
		conn=sqlconnection.ConnecrDb();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
	   Container frame = this.getContentPane();
		
		frame.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 709, 454);
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("User name");
		lblLogin.setForeground(Color.BLUE);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLogin.setBackground(Color.WHITE);
		lblLogin.setBounds(156, 138, 77, 32);
		panel.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(288, 138, 133, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setBackground(Color.MAGENTA);
		lblPassword.setBounds(156, 181, 89, 39);
		panel.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 
				try{
						
					String sql="select *from  sajib1 where password= ? or  user_name= ?";
							
					pst=conn.prepareStatement(sql);
			 	    pst.setString(1,passwordField.getText()); 
			 	   pst.setString(2,textField.getText()); 
					rs=pst.executeQuery();
					
					String tpass =passwordField.getText();
					String tname = textField.getText();
					 
					 if(rs.next()){
							 
						 
						databasepass =rs.getString("password");
						databasename =rs.getString("user_name");	
						rs.close();
						pst.close();
							
					    if(tpass.equals(databasepass) && tname.equals(databasename)){
								 
						   JOptionPane.showMessageDialog(null, "Login sucessfully");
						   
						    login2();
						    close();
							  
						     }	
					    else{
							 
							JOptionPane.showMessageDialog(null, "User name or Password rong"); 
							
						      }		
						 }	
						 	 
				 } catch(Exception e3){
					 
	                JOptionPane.showMessageDialog(null, e3);
	
	               }
			 }	 
		});	
					
			
		
		btnLogin.setForeground(Color.BLUE);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogin.setBounds(214, 277, 89, 23);
		panel.add(btnLogin);
		
		JButton btnNew = new JButton("New Account");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login1();
				close();
			
			}
		});
		btnNew.setForeground(Color.BLUE);
		btnNew.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNew.setBounds(328, 278, 115, 23);
		panel.add(btnNew);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
				
			  
				try{
						
					String sql="select *from  sajib1 where password= ? or  user_name= ?";
							
					pst=conn.prepareStatement(sql);
			 	    pst.setString(1,passwordField.getText()); 
			 	   pst.setString(2,textField.getText()); 
					rs=pst.executeQuery();
					
					String tpass =passwordField.getText();
					String tname = textField.getText();
					 
					 if(rs.next()){
							 
						 
						databasepass =rs.getString("password");
						databasename =rs.getString("user_name");	
						rs.close();
						pst.close();
							
					    if(tpass.equals(databasepass) && tname.equals(databasename)){
								 
						   JOptionPane.showMessageDialog(null, "Login sucessfully");
						   
						    login2();
						    close();
							  
						     }	
					    else{
							 
							JOptionPane.showMessageDialog(null, "User name or Password Wrong"); 
							
						      }		
						 }	
						 	 
				 } catch(Exception e3){
					 
	                JOptionPane.showMessageDialog(null, e3);
	
	               }
			 }	 		
			
			
		 });
		passwordField.setBounds(287, 185, 134, 30);
		panel.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon("DUET Logo (Original).png"));
		lblNewLabel.setBounds(10, 24, 674, 419);
		panel.add(lblNewLabel);
	}
	
	 void close(){
		
		WindowEvent windowclose= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowclose);
	}

	 void login2() {
		 
		 
		Student Pal =new Student();
		Pal.setVisible(true);
		Pal.setDefaultCloseOperation(Student.EXIT_ON_CLOSE);
		Pal.setBounds(100, 100, 895, 700);	
		Pal.setTitle("sajib pal");
	}

 void login1() {
	 
	 
		hoom P =new hoom();
		P.setVisible(true);
		P.setBounds(100, 100, 610, 500);
		P.setTitle("sajib pal");
	}
}
 
 public class databaselogin {
	
	public static void main(String[] args) {
		
		 try{
				
		  UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

					}
		catch(Exception e){
						
			}
		data ok = new data();
		ok.setVisible(true);	
        ok.setBounds(100, 100, 735, 503);
		ok.setTitle("sajib pal");
				
			}
		
	}
	
