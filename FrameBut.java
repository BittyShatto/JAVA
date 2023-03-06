package testawt;

import java.awt.*;

public class FrameBut extends Frame{
	FrameBut()
	{
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
		Button b=new Button("test");
		b.setBounds(100,100,100,30);
		add(b);
		
		TextField t=new TextField("My Name");
		t.setBounds(50,50,100,30);
		add(t);
		
		Label l=new Label();
		l.setBounds(150,50,100,30);
		add(l);
		
		
	}
	public static void main(String[] args) {
		new FrameBut();

	}

}
