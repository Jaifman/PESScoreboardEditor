package Editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class EditorFrame extends JFrame{
	
	public EditorFrame(){
		
		//Frame properties
		setBounds(325,100,822,550);
		
		//We create a panel, add it to the frame & set a free layout
		EditorPanel myPanel = new EditorPanel();		
		getContentPane().add(myPanel);
		myPanel.setLayout(null);
		
		//We create a button, set its properties and add it to the panel
		JButton btnSelectFile = new JButton("Select File...");
		btnSelectFile.setBounds(0, 0, 119, 23);
		myPanel.add(btnSelectFile);
		setVisible(true);
		
		//We create a Filechooser
		final JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new File(System.getProperty("user.home")));
		
		//We give functionality to the button as a File Chooser
		btnSelectFile.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				int returnVal = fc.showOpenDialog(myPanel);
				
				if (returnVal == JFileChooser.APPROVE_OPTION){
					
		            File file = fc.getSelectedFile();
		            
		            try {
		            	
		              //What to do with the file 
		            	
		            }catch (Exception ex){
		            	
		              System.out.println("problem accessing file"+file.getAbsolutePath());
		            
		            }
		            
		        }else{
		        	
		            System.out.println("File access cancelled by user.");
		            
		        }      
				
			}
		
		});
		
	}
	
}
