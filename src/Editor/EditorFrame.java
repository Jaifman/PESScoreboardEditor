package Editor;

import javax.swing.JFrame;

public class EditorFrame extends JFrame{
	
	public EditorFrame(){
		
		setBounds(325,100,550,550);
		
		EditorPanel myPanel = new EditorPanel();
		
		add(myPanel);
		
		setVisible(true);	
		
	}
}
