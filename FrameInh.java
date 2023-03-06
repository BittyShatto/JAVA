//By extending Frame class (inheritance)
//Frame

package testawt;

import java.awt.*;

public class FrameInh extends Frame {
	
	FrameInh()
	{
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FrameInh();
	}

}
