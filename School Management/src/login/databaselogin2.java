package login;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;


 class Student extends JFrame{

	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JPanel panel_3;
	private JTextField textField_5;
    JPanel panel_4;
    JPanel panel_5;
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
    byte[] butimage;
    JLabel desktopNewLabel;
    ImageIcon icon;
    byte[]  image;
    String gender;
    JComboBox comboBox;
    ImageIcon icon1;
    String tabel_click;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private final ButtonGroup buttonGroup_1 = new ButtonGroup();
    private final Action action = new SwingAction();
    private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	
 	
  
	public Student() {
		
		conn=sqlconnection. ConnecrDb();
		
		initialize();
		Table_update();
		
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	  Container	frmSajibPal = this.getContentPane();
		frmSajibPal.setForeground(new Color(102, 153, 153));
		frmSajibPal.setBackground(new Color(47, 79, 79));
		frmSajibPal.setLayout(null);
		
		JLabel Label_1 = new JLabel("Student ID");
		Label_1.setForeground(new Color(248, 248, 255));
		Label_1.setBackground(new Color(47, 79, 79));
		Label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Label_1.setBounds(10, 166, 62, 26);
		frmSajibPal.add(Label_1);
		
		JLabel Label_2 = new JLabel("Phone");
		Label_2.setForeground(new Color(248, 248, 255));
		Label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Label_2.setBounds(10, 225, 62, 26);
		frmSajibPal.add(Label_2);
		
		JLabel Label_3 = new JLabel("Age");
		Label_3.setForeground(new Color(248, 248, 255));
		Label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Label_3.setBounds(10, 289, 62, 26);
		frmSajibPal.add(Label_3);
		
		JLabel Label_4 = new JLabel("Gpa");
		Label_4.setForeground(new Color(248, 248, 255));
		Label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Label_4.setBounds(10, 354, 82, 26);
		frmSajibPal.add(Label_4);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 139, 139), 3));
		panel_9.setBounds(49, 5, 742, 78);
		frmSajibPal.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setIcon(new ImageIcon("F:\\sajib\\java program\\login\\Untitl1 copy.png"));
		lblNewLabel.setBounds(7, 5, 730, 69);
		panel_9.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setToolTipText("Student Name");
		textField.setBounds(93, 117, 163, 26);
		frmSajibPal.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Student Id");
		textField_1.setBounds(93, 168, 158, 23);
		frmSajibPal.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Phone number");
		textField_2.setBounds(93, 227, 159, 23);
		frmSajibPal.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Age");
		textField_3.setBounds(93, 289, 112, 26);
		frmSajibPal.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Cgpa");
		textField_4.setBounds(93, 354, 112, 26);
		frmSajibPal.add(textField_4);
		textField_4.setColumns(10);
		
		panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Data table", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(272, 382, 609, 247);
		frmSajibPal.add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 19, 590, 217);
		panel.add(scrollPane);
		
		table = new JTable();
		table.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				

				if(e.getKeyCode()==KeyEvent.VK_DOWN||e.getKeyCode()==KeyEvent.VK_UP){
					   
					try{
						   
					  int row=table.getSelectedRow();
					   tabel_click=(table.getModel().getValueAt(row,0).toString());
					  String sql="select * from sajib where student_name='"+tabel_click+"' ";
						  
					  pst=conn.prepareStatement(sql);
					   rs=pst.executeQuery();
							 
						if(rs.next()){
								
						  String name=rs.getString("student_name");
						  String id=rs.getString("student_id");
						  String phone=rs.getString("phone");
						  String age=rs.getString("age");
						  String gpa=rs.getString("gpa");
						  
						image=rs.getBytes("image");	
							 
						 icon1=new ImageIcon(image);
						Image image1 =icon1.getImage();
			            icon=new ImageIcon(ScaledImage( image1,desktopNewLabel.getWidth(),desktopNewLabel.getHeight()));
						desktopNewLabel.setIcon(icon);
						    
						  textField.setText(name);  
					      textField_1.setText(id);
						  textField_2.setText(phone);
						  textField_3.setText(age);
						  textField_4.setText(gpa);
							} 
						   
						 }catch(Exception e1){
								
							 JOptionPane.showMessageDialog(null,e1);
						   }	  
						   
					  }
			  }
		}); 
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
              int row=table.getSelectedRow();
               tabel_click=(table.getModel().getValueAt(row,0).toString());
			 
		    try{
			 String sql="select image from sajib  where student_name='"+tabel_click+"' "; 
			  
			   pst=conn.prepareStatement(sql);
				 rs=pst.executeQuery();
				 
				if(rs.next()){
					
					  image=rs.getBytes("image");
						 
					 icon1=new ImageIcon(image);
					Image image1 =icon1.getImage();
		        icon=new ImageIcon(ScaledImage( image1,desktopNewLabel.getWidth(),desktopNewLabel.getHeight()));
				    desktopNewLabel.setIcon(icon); 
				  
				 
				}
			 
		 }catch(Exception e3){
			 
			 JOptionPane.showMessageDialog(null, e3);
		 }
			  
			  try{
			 	   
				    String sql="select * from sajib where student_name ='"+tabel_click+"' ";
				  
				    pst=conn.prepareStatement(sql);
					 rs=pst.executeQuery();
					 
					if(rs.next()){
						
						String name=rs.getString("student_name");
						String id=rs.getString("student_id");
						String phone=rs.getString("phone");
						String age=rs.getString("age");
						String gpa=rs.getString("gpa");
						
						textField.setText(name);  
						textField_1.setText(id);
						textField_2.setText(phone);
						textField_3.setText(age);
						textField_4.setText(gpa);
						
						
					} 
				   
				 }catch(Exception e1){
						
					 JOptionPane.showMessageDialog(null,e1);
				   } 
				
		       }
		
		});
		
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
					"name serial",	"Student name", "Student id", "phone","gender", "age", "gpa"
			}
		));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(-5, 90, 271, 310);
		frmSajibPal.add(panel_2);
		panel_2.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(47, 79, 79));
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Textfield", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(248, 248, 255)));
		panel_3.setBounds(0, 0, 271, 310);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds(6, 16, 259, 287);
		panel_3.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Label = new JLabel("Student Name");
		Label.setBounds(10, 11, 82, 26);
		panel_1.add(Label);
		Label.setForeground(new Color(248, 248, 255));
		Label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				String message="<html> student name="+ textField.getText()+"<br>"+ "student Id="+textField_1.getText()+"<br>"+"phone="+textField_2.getText()+"<br>"+"age="+textField_3.getText()+"<br>"+"gpa="+textField_4.getText() +"<br>"+ "gender="+gender +"</html>";	
				
				 JOptionPane optionpane=new JOptionPane();
				 optionpane.setMessage(message);
				 optionpane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
				 JDialog dialog=optionpane.createDialog(null,"Enter information");
				 dialog.setVisible(true);
				 
				try{
					
					
					String sql="insert into sajib (student_name,student_id,phone,age,gpa,image,Gender) values (?,?,?,?,?,?,?)";
					pst=conn.prepareStatement(sql);
					
					pst.setString(1, textField.getText());
					pst.setString(2, textField_1.getText());
					pst.setString(3, textField_2.getText());
					pst.setString(4, textField_3.getText());
					pst.setString(5, textField_4.getText());
					pst.setBytes(6, butimage);
					pst.setString(7, gender);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "saved");
					
				}catch(Exception e2){
					
					 
				JOptionPane.showMessageDialog(null, e2);
					
				}
				
				Table_update();
				
			}
		});
		btnAdd.setBounds(299, 119, 89, 23);
		frmSajibPal.add(btnAdd);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{

					String name=textField.getText();
					String id= textField_1.getText();
					String phone=textField_2.getText();
					String age=textField_3.getText();
					String gpa=textField_4.getText();
					
					String sql="update sajib set student_name='"+name+"',student_id='"+id+"',phone='"+phone+"',age='"+age+"' ,gpa='"+gpa+"' where student_id='"+id+"' ";
					 pst=conn.prepareStatement(sql);
					 pst.execute();
									
					JOptionPane.showMessageDialog(null,"update");
					
				}catch(Exception e2){
				
					 
				JOptionPane.showMessageDialog(null, e2);
					
				}
				
			try{	
			
				String id= textField_1.getText();
				String sql = "update sajib set image= ? where student_id='"+id+"'";
			     pst=conn.prepareStatement(sql);
			     pst.setBytes(1, butimage);
		         pst.execute();	
		        }
			catch(Exception e7){
				
			JOptionPane.showMessageDialog(null, e7);	
			  }	
			
				Table_update();	
			}
		});
		btnUpdate.setBounds(299, 168, 89, 23);
		frmSajibPal.add(btnUpdate);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  int p=JOptionPane.showConfirmDialog(null,"Do you want Delete","Delete",JOptionPane.YES_NO_OPTION);
				  if(p==0){
					try{
						
						String sql="delete from sajib where student_id = ? ";
						pst=conn.prepareStatement(sql);
						pst.setString(1,textField_1.getText());
						
						pst.execute();
						
						JOptionPane.showMessageDialog(null,"delete");	
					}
					catch(Exception e3){
						
						 
					JOptionPane.showMessageDialog(null, e3);
						
					}
					 
				  }
                 
				Table_update();
			}
		});
		btnNewButton.setBounds(299, 215, 89, 23);
		frmSajibPal.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Free Sms");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(299, 270, 89, 23);
		frmSajibPal.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mail");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setBounds(299, 310, 89, 23);
		frmSajibPal.add(btnNewButton_2);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
			    desktopNewLabel.setIcon(null);
			}
		});
		btnClear.setBounds(299, 268, 89, 23);
		frmSajibPal.add(btnClear);
		
		 panel_5 = new JPanel();
		panel_5.setBackground(new Color(47, 79, 79));
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Buttton", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(248, 248, 255)));
		panel_5.setBounds(273, 89, 164, 291);
		frmSajibPal.add(panel_5);
		panel_5.setLayout(null);
		
	    panel_4 = new JPanel();
		panel_4.setBackground(new Color(47, 79, 79));
		panel_4.setBounds(6, 16, 152, 268);
		panel_5.add(panel_4);
		
		JLabel lblSearceOption = new JLabel("Search Option");
		lblSearceOption.setForeground(new Color(248, 248, 255));
		lblSearceOption.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSearceOption.setBounds(496, 116, 89, 26);
		frmSajibPal.add(lblSearceOption);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				
				try{
					
					String sql="select *from  sajib where student_name =?";
					
					pst=conn.prepareStatement(sql);
					 pst.setString(1,textField_5.getText());
					 rs=pst.executeQuery();
					 
					 if(rs.next()){
						 
						String name=rs.getString("student_name");
						String id=rs.getString("student_id");
						String phone=rs.getString("phone");
						String age=rs.getString("age");
						String gpa=rs.getString("gpa");
						 
						image=rs.getBytes("image"); 
						ImageIcon icon1=new ImageIcon(image);
						Image image =icon1.getImage();
			            icon=new ImageIcon(ScaledImage( image,desktopNewLabel.getWidth(),desktopNewLabel.getHeight()));
						
			            desktopNewLabel.setIcon(icon);
						    
							
						textField.setText(name);  
						textField_1.setText(id);
						textField_2.setText(phone);
						textField_3.setText(age);
						textField_4.setText(gpa);
							
					 }
				}
				catch(Exception e4){
					
					 
				JOptionPane.showMessageDialog(null, e4);
					
				}
				
			}
		});
		textField_5.setToolTipText("Student search");
		textField_5.setBounds(582, 111, 150, 38);
		frmSajibPal.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblSearceBox = new JLabel("Search box");
		lblSearceBox.setForeground(new Color(248, 248, 255));
		lblSearceBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSearceBox.setBounds(496, 160, 89, 38);
		frmSajibPal.add(lblSearceBox);
		
		 comboBox = new JComboBox();	
		 comboBox.setToolTipText("Name Select");
		 comboBox.setEditable(true);
		
		  combo_update();
		  
		   comboBox.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 	  try{
						
				String sql="select *from  sajib where student_name= ? ";
						
				pst=conn.prepareStatement(sql);
				pst.setString(1, comboBox.getSelectedItem().toString());
				 rs=pst.executeQuery();
						 
				 if(rs.next()){
						  
					textField.setText(rs.getString("student_name"));
					textField_1.setText(rs.getString("student_id"));
					textField_2.setText(rs.getString("phone"));
					textField_3.setText(rs.getString("age"));
					textField_4.setText(rs.getString("gpa"));
					 
					image=rs.getBytes("image");	
					ImageIcon icon1=new ImageIcon(image);
					Image image =icon1.getImage();
		            icon=new ImageIcon(ScaledImage( image,desktopNewLabel.getWidth(),desktopNewLabel.getHeight()));
					
		            desktopNewLabel.setIcon(icon);
					    
				   
						
						 }	
				 
					}
						
				catch(Exception e5){
							 
			     JOptionPane.showMessageDialog(null, e5);
				}
		 		
		 	 }
			
		 });
		 
		comboBox.setBounds(582, 162, 150, 35);
		frmSajibPal.add(comboBox);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 128, 128), null, null, null));
		desktopPane.setBackground(new Color(51, 102, 102));
		desktopPane.setBounds(10, 411, 197, 150);
		frmSajibPal.add(desktopPane);
		
		 desktopNewLabel = new JLabel();
		 desktopNewLabel.setBounds(0, 0, 197, 150);
		 desktopPane.add(desktopNewLabel);
		
		JButton btnAddImage = new JButton("Add image");
		btnAddImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser chooser=new JFileChooser();
			    chooser.showOpenDialog(null);
			    File f=chooser.getSelectedFile();
			  String stringpath=f.getAbsolutePath();
			    
			       
				  try{
								
					 File ok=new File(stringpath);
					 FileInputStream  fis=new FileInputStream(ok);
					 ByteArrayOutputStream bos=new  ByteArrayOutputStream();
					 byte[] but=new byte[1024];
					 
					 for(int readNum;(readNum=fis.read(but))!=-1;){
						 
						 bos.write(but, 0, readNum);
						 
					  }
					 butimage=bos.toByteArray();
					 
					ImageIcon icon1=new ImageIcon(butimage);
					Image image =icon1.getImage();
	                icon=new ImageIcon(ScaledImage( image,desktopNewLabel.getWidth(),desktopNewLabel.getHeight()));
					 desktopNewLabel.setIcon(icon);
					 
					}catch(Exception e2){
								
								
					}  	
			}
		});
		btnAddImage.setBounds(30, 572, 96, 23);
		frmSajibPal.add(btnAddImage);
		
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(0, 0, 0));
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(248, 248, 255)));
		panel_6.setBackground(new Color(47, 79, 79));
		panel_6.setBounds(461, 89, 332, 134);
		frmSajibPal.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGender.setForeground(Color.WHITE);
		lblGender.setBounds(474, 268, 89, 23);
		frmSajibPal.add(lblGender);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					gender="male";
			}
		});
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(47, 79, 79));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonGroup_2.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(537, 268, 73, 23);
		frmSajibPal.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gender="Female";
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setBackground(new Color(47, 79, 79));
		buttonGroup_2.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(634, 268, 82, 23);
		frmSajibPal.add(rdbtnNewRadioButton_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_7.setBackground(new Color(47, 79, 79));
		panel_7.setBounds(461, 248, 320, 60);
		frmSajibPal.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setForeground(new Color(255, 255, 255));
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Image", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_8.setBackground(new Color(47, 79, 79));
		panel_8.setBounds(460, 317, 346, 61);
		frmSajibPal.add(panel_8);
		panel_8.setLayout(null);
		
		JButton btnTableImage = new JButton("Table Image");
		btnTableImage.setBounds(120, 27, 102, 23);
		panel_8.add(btnTableImage);
		btnTableImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					SaveScreenShot(panel,"table image.jpg"); 
				  } 
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				} 
			}
		});
		btnTableImage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnTakeImage = new JButton("Take Image");
		btnTakeImage.setBounds(10, 27, 102, 23);
		panel_8.add(btnTakeImage);
		btnTakeImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					SaveScreenShot(frmSajibPal," Image.jpg"); 
				  } 
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				} 
			}
		});
		btnTakeImage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnCgpaChart = new JButton("cgpa chart");
		btnCgpaChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					String sql="select student_name,gpa from sajib";
					JDBCCategoryDataset dataset=new JDBCCategoryDataset(sqlconnection.ConnecrDb(),sql);
					JFreeChart chart=ChartFactory.createBarChart3D("cgpa chart","student_name", "cgpa", dataset,PlotOrientation.VERTICAL, true,true,true);
					 chart.setBackgroundPaint(Color.ORANGE);
					 chart.getTitle().setPaint(Color.RED);
					  
					BarRenderer renderer=null;
					CategoryPlot plot=chart.getCategoryPlot();
					CategoryAxis axis=(CategoryAxis)plot.getDomainAxis();
					axis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
					renderer=new BarRenderer();
					
					ChartFrame frame =new ChartFrame("chart", chart);
					frame.setVisible(true);
					frame.setBounds(200, 150, 600, 450);
					 
					
				}catch(Exception e4){
					
				}	
			}
		});
		btnCgpaChart.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCgpaChart.setBounds(234, 28, 102, 23);
		panel_8.add(btnCgpaChart);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(102, 153, 153));
		this.setJMenuBar(menuBar);
		
		JMenu mnDate = new JMenu("Date :");
		mnDate.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnDate);
		
		JMenu mnTime = new JMenu("Time :");
		mnTime.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnTime);
		
		 Thread clock=new Thread(){
			 
				public void run(){
					
				 
				for(;;){
					 
					 Calendar cal=new GregorianCalendar();
					 int month=cal.get(Calendar.MONTH);
					 int year=cal.get(Calendar.YEAR);
					 int day=cal.get(Calendar.DAY_OF_MONTH);
					 mnDate.setText("Date "+year+"/"+month+"/"+day);
						
					 int hour=cal.get(Calendar.HOUR);
					 int minute=cal.get(Calendar.MINUTE);
					 int seconds=cal.get(Calendar.SECOND);
					 mnTime.setText("Time "+hour+":"+minute+":"+seconds);
					  
				 
				  }
				} 
			 };
			 clock.start();	
		
	}
	
  	Image ScaledImage(Image ima,int w,int h){
		
		
		BufferedImage resizedImage=new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
		Graphics2D g2=resizedImage.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR );
		g2.drawImage(ima, 0, 0, w, h, null);
		g2.dispose();
		
		return resizedImage; 
	   }
  	  BufferedImage getScreenShot(Component component){
			
			
		   BufferedImage image=new BufferedImage(component.getWidth(),component.getHeight(),BufferedImage.TYPE_INT_RGB);
		  
		   component.paint(image.getGraphics());
		   return image;
			}
		
		
		 void SaveScreenShot (Component component,String name) throws Exception{
			
			 BufferedImage img=getScreenShot(component);
			 ImageIO.write(img, "jpg",new File (name));
		}
  	
	void combo_update(){	 
		
		try{
			
			String sql="select *from  sajib ";
			pst=conn.prepareStatement(sql);
			  rs=pst.executeQuery();
			  while(rs.next()){
					
				String name=rs.getString("student_name");
				comboBox.addItem(name);
				
				   }	
			  }
				
				catch(Exception e5){
					 
					  JOptionPane.showMessageDialog(null, e5);
				 }
	}
	void Table_update(){ 
		
		    	
			 try{
				 
				 String sql="select *from  sajib ";	
				 
				 pst=conn.prepareStatement(sql);
				
				 rs=pst.executeQuery();
				 table.setModel(DbUtils.resultSetToTableModel(rs));
				 
				
	   } catch(Exception e){
		 
		  JOptionPane.showMessageDialog(null, e);
	    }
			 
	  finally{
		  
		 try{
			 
			 rs.close();
			 pst.close();
		 }catch (Exception e){
			 
			 JOptionPane.showMessageDialog(null,e);
		 }
				
				
			} 
    }	
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	
  }
 
public class databaselogin2 {
	
  public static void main(String[] args) {

	    try{
			
	    UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

			}
			catch(Exception e){
				
				
			}
				Student frm = new Student();
				frm.setVisible(true);
				frm.setDefaultCloseOperation(Student.EXIT_ON_CLOSE);
				
				frm.setBounds(200, 30, 900, 700);
				
				frm.setTitle("sajib pal");
			} 
			
			
		}
	

