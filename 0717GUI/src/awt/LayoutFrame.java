package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class LayoutFrame extends Frame {

	public LayoutFrame() {
		setBounds(100, 100, 500, 500);
		setTitle("���̾ƿ�");

		Panel panel = new Panel();
		// panel�� ���̾ƿ��� ����

		/*panel.setLayout(new FlowLayout()); 
		 * //������Ʈ ��ġ
		 *  for(int i=0;i<10;i++) { Button
		 * btn = new Button("��ư"+ i); panel.add(btn); }
		 */
		
		/*panel.setLayout(new BorderLayout());
		Button btnWest = new Button("����");
		panel.add("West", btnWest);
		Button btnEest = new Button("����");
		panel.add("East", btnEest);
		Button btnCenter = new Button("�߾�");
		panel.add("Center", btnCenter);
		Button btnNorth = new Button("����");
		panel.add("North", btnNorth);
		Button btnSouth = new Button("����");
		panel.add("South", btnSouth);*/
		
		/*panel.setLayout(new GridLayout(2,3,10,10));
		for(int i=0;i<6;i++) { 
			Button btn = new Button("��ư"+ i); 
			panel.add(btn);
		}*/
		
		panel.setLayout(null);//null�� �ָ� Conponent�� ��ġ�� ũ�⸦ ��� �����ؾ� ��
		Label label = new Label("@");
		label.setBounds(50, 50, 30, 30);
		panel.add(label);
		
		Thread th = new Thread() {
			public void run() {
				while(true) {
					int x = label.getLocation().x;
					int y = label.getLocation().y;
					label.setLocation(x+10, y+10);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		th.start();
		
		add(panel);
		// ȭ�� ũ�� ���� ���ϵ��� ����
		setResizable(false);
		// ȭ�� ���
		setVisible(true);
	}
}
