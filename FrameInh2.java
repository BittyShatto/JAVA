//By creating the object of Frame class (association)


package testawt;

import java.awt.*;

public class FrameInh2{
        FrameInh2()
		{
			Frame f=new Frame("MY NEW fRAME");
			f.setSize(300,300);
			f.setLayout(null);
			f.setVisible(true);
			
		}
		public static void main(String[] args) {
			new  FrameInh2();
	}
}