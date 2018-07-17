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
		setTitle("�̺�Ʈ �����");

		Button btn1 = new Button("�ѱ���");
		Button btn2 = new Button("����");
		Button btn3 = new Button("����");

		Label label = new Label();

		Panel centerpanel = new Panel();
		centerpanel.add(btn1);
		centerpanel.add(btn2);
		centerpanel.add(btn3);

		
		add("Center", centerpanel);
		add("South", label);

		// ActionEvent�� ó���� �� �ִ� �ν���Ʈ �����
		/*ActionListener listener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("�ȳ��ϼ���.");

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
				case"�ѱ���": 
					label.setText("�ȳ��ϼ���.");
					break;
				case"����": 
					label.setText("Hello");
					break;
				case"����": 
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
