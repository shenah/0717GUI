package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {

	public EventRouting() {
		setBounds(200, 200, 200, 200);
		setTitle("이벤트 라우팅");

		Button btn1 = new Button("한국어");
		Button btn2 = new Button("영어");
		Button btn3 = new Button("종료");

		Label label = new Label();

		Panel centerpanel = new Panel();
		centerpanel.add(btn1);
		centerpanel.add(btn2);
		centerpanel.add(btn3);

		
		add("Center", centerpanel);
		add("South", label);

		// ActionEvent를 처리할 수 있는 인스턴트 만들기
		/*ActionListener listener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("안녕하세요.");

			}

		};
		btn1.addActionListener(listener1);

		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Hello");

			}

		};
		btn2.addActionListener(listener2);

		ActionListener listener3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}

		};
		btn3.addActionListener(listener3);*/

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//
				switch(e.getActionCommand()) {
				case"한국어": 
					label.setText("안녕하세요.");
					break;
				case"영어": 
					label.setText("Hello");
					break;
				case"종료": 
					System.exit(0);
					break;
					
				}

			}

		};
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		
		
		setVisible(true);
	}
}
