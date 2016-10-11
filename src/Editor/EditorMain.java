package Editor;

import javax.swing.JFrame;

public class EditorMain {

	public static void main(String[] args) {
		
		EditorFrame myFrame = new EditorFrameBuilder().createEditorFrame();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
