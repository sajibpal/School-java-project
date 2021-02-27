package login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
//import javax.mail.Multipart;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class bf extends JFrame implements ActionListener{
	JTextArea afield;
	 JTextField field4,field2,field1,field,atfield,atfield1;
	 String address,password;
    JButton bt1,bt2,bt;
     JPasswordField pfield;
     String stringpath;
     
	bf(){
		
		 
		Container c=this.getContentPane();
		 c.setLayout(null);

		 Color g=new Color(0,194,89);
		 c.setBackground(g);

		   bt1=new JButton("mail send");  
		    bt1.setBounds(90,200,100,30);
		    c.add(bt1);
		    
		    JLabel label=new JLabel("subject");
		    label.setBounds(10, 60, 80, 30);
		    c.add(label);
		                                        
		    JLabel label1=new JLabel("T0");
		    label1.setBounds(10, 100, 80, 30);
		    c.add(label1);
		    
		    JLabel label2=new JLabel("From");
		    label2.setBounds(10, 140, 80, 30);
		    c.add(label2);
		    
		     field=new JTextField(); 
			field.setBounds(60,60,150,30);
			c.add(field);
			
			 field1=new JTextField(); 
			field1.setBounds(60,100,150,30);
			c.add(field1);
		    
			 field2=new JTextField(); 
			field2.setBounds(60,140,150,30);
			c.add(field2);
		
			 afield=new JTextArea();                    
			 afield.setBounds(300, 20, 200, 200);
			 c.add(afield);
			 
		    field4=new JTextField(); 
			field4.setBounds(140,300,180,30);
			c.add(field4);
			 
			 pfield=new JPasswordField();
			 pfield.setBounds(140,350,180,30);
			 c.add(pfield);
				 
			 JLabel label3=new JLabel("Enter mail address");
			  label3.setBounds(10, 300, 150, 30);
			   c.add(label3);
			    
				 
			JLabel label4=new JLabel("Enter password");
			 label4.setBounds(10, 350, 100, 30);
			 c.add(label4);
			 
                bt2=new JButton("Login");  
			    bt2.setBounds(70,430,90,30);
			    c.add(bt2);
	   
			    bt=new JButton("Attachfile");
				bt.setBounds(400, 430, 100, 30);
				c.add(bt);
				
				 atfield=new JTextField();
				atfield.setBounds(400, 300, 250, 30);
				c.add(atfield);
			    

				atfield1=new JTextField("Attach file name");
				atfield1.setBounds(400, 350, 250, 30);
				c.add(atfield1);
			    
			  bt1.addActionListener(this);
			  bt2.addActionListener(this);
			  bt.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==bt1){
			
		String text=afield.getText(); 
		String subject=field.getText();
		String to=field1.getText();
		String from=field2.getText();
		
		Properties props=new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port","465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		
		Session session=Session.getDefaultInstance(props,
				
			new javax.mail.Authenticator(){
			
			protected PasswordAuthentication  getPasswordAuthentication(){
				return new PasswordAuthentication(from, password );
			}
		});
				
				
		try{
			
			Message message=new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(subject);
			
			MimeBodyPart messagebodypart=new MimeBodyPart();
			messagebodypart.setText(text);
			Multipart multipart=new MimeMultipart();
			multipart.addBodyPart(messagebodypart);
			
			messagebodypart=new MimeBodyPart();
		javax.activation.DataSource source=new FileDataSource(stringpath);
			messagebodypart.setDataHandler(new DataHandler(source));
			messagebodypart.setFileName(atfield1.getText());
			multipart.addBodyPart(messagebodypart);
		    message.setContent(multipart);
			
			                                    //message.setText(text); using attach file no need
			Transport.send(message);
			JOptionPane.showMessageDialog(null, "message sent");
			
		}catch(Exception e2){
			
			JOptionPane.showMessageDialog(null, e2);
		}
		
	 }
		else if(e.getSource()==bt2){ 	
	
		address=field4.getText();
		field2.setText(address);
	    password=pfield.getText();
		
	   }
		else{
			

			JFileChooser  chooser=new JFileChooser();
		       chooser.showOpenDialog(null);
		       File f=chooser.getSelectedFile();
		       stringpath=f.getAbsolutePath();
		       atfield.setText(stringpath);
		       
		}
	}
}
public class javamailtransfer {

	public static void main(String[] args) {
		
		 bf frame=new bf();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(bf.EXIT_ON_CLOSE);
		 frame.setBounds(200,100,800,550);


	}

}
