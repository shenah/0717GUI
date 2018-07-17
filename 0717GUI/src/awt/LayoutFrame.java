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
		setTitle("레이아웃");

		Panel panel = new Panel();
		// panel의 레이아웃을 설정

		/*panel.setLayout(new FlowLayout()); 
		 * //컴포넌트 배치
		 *  for(int i=0;i<10;i++) { Button
		 * btn = new Button("버튼"+ i); panel.add(btn); }
		 */
		
		/*panel.setLayout(new BorderLayout());
		Button btnWest = new Button("서쪽");
		panel.add("West", btnWest);
		Button btnEest = new Button("동쪽");
		panel.add("East", btnEest);
		Button btnCenter = new Button("중앙");
		panel.add("Center", btnCenter);
		Button btnNorth = new Button("북쪽");
		panel.add("North", btnNorth);
		Button btnSouth = new Button("남쪽");
		panel.add("South", btnSouth);*/
		
		/*panel.setLayout(new GridLayout(2,3,10,10));
		for(int i=0;i<6;i++) { 
			Button btn = new Button("버튼"+ i); 
			panel.add(btn);
		}*/
		
		panel.setLayout(null);//null를 주면 Conponent의 위치와 크기를 모두 설정해야 됨
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
		// 화면 크기 조절 못하도록 설정
		setResizable(false);
		// 화면 출력
		setVisible(true);
	}
}
