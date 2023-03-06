package testawt;

import java.awt.*;

public class FrameBut2 {
	 FrameBut2()
		{
			Frame f=new Frame("MY NEW fRAME");
			f.setSize(300,300);
			f.setLayout(null);
			f.setVisible(true);
			f.setBackground(Color.CYAN);
			
			Button b=new Button("TEST");
			b.setBounds(100,100,100,30);
			f.add(b);
			
			TextField t=new TextField("MY NAME");
			t.setBounds(50,50,100,30);
			f.add(t);
			
			Label l=new Label();
			l.setBounds(150,50,100,30);
			f.add(l);
				
		}
	public static void main(String[] args) {
		new  FrameBut2();

	}

}
