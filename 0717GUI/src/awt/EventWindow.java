package awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventWindow extends Frame {

	public EventWindow() {
		setBounds(200, 200, 1000, 1000);
		setTitle("이벤트 처리");

		Panel northpanel = new Panel();
		add("North", northpanel);
		Panel southpanel = new Panel();
		add("South", southpanel);

		// 체크박스, 라디오 버튼, 콤보박스를 처리하는 이벤트=>ItemEvent=>ItemListener

		Checkbox cnboo = new Checkbox("boolean");
		Checkbox cnint = new Checkbox("int");
		Checkbox cnshort = new Checkbox("short");
		Checkbox cnfloat = new Checkbox("float");
		Checkbox cndouble = new Checkbox("double");
		northpanel.add(cnboo);
		northpanel.add(cnint);
		northpanel.add(cnshort);
		northpanel.add(cnfloat);
		northpanel.add(cndouble);

		// 중앙에 TextArea 배치
		TextArea ta = new TextArea(10, 70);
		add("Center", ta);
		ta.setVisible(true);

		// 콤보박스 2개 배치
		// 콤보박스에 배치할 데이터 만들기
		String[] category = { "Programming", "Database", "IDE", "Framework" };
		String[][] content = { { "Java", "JavaScript", "Swift" }, { "Oracle", "MySQL", "MongoDB" },
				{ "Eclipse", "Android Studio", "dldl" }, { "fjoe", "doodjf", "dofjodjf" } };

		Choice cbcategory = new Choice();
		for (String imsi : category) {
			cbcategory.add(imsi);
		}

		Choice cbcontent = new Choice();
		for (String imsi : content[0]) {
			cbcontent.add(imsi);
		}

		southpanel.add(cbcategory);
		southpanel.add(cbcontent);

		// Checkbox 이벤트 처리
		ItemListener itemHandler1 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// ta.append(e.getSource().toString()+"을 눌렀습니다."+"\n");
				// 이벤트 객체 주소를 형변환해준다.
				Checkbox ed = (Checkbox) (e.getSource());
				String label = ed.getLabel();
				boolean b = ed.getState();
				ta.append(label + " " + b + "로 변경" + "\n");
			}
		};
		//체크박스와 이벤트 연결
		cnboo.addItemListener(itemHandler1);
		cnint.addItemListener(itemHandler1);
		cnshort.addItemListener(itemHandler1);
		cnfloat.addItemListener(itemHandler1);
		cndouble.addItemListener(itemHandler1);

		// 콤보박스(ChoiceBox)이벤트 처리
		// 카테고리 코보 박스의 선택이 변경되었을 때
		ItemListener itemHandler2 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// cbcategory의 선택된 행번호 가져오기
				int row = cbcategory.getSelectedIndex();
				// cbcontent 내용 전부 지우기
				cbcontent.removeAll();
				// 행번호에 해당하는 세부 내용을 cbcontent안에 넣기
				for (String temp : content[row]) {
					cbcontent.add(temp);
				}
			}
		};
		//콤보박스와 이벤트 연결
		cbcategory.addItemListener(itemHandler2);

		// 버튼을 클릭하는 이벤트 =>ActionEvent=>ActionListener
		// ActionListener는 인터페이스, 메소드를 재정의해야 함
		Button btn1 = new Button("종료");
		ActionListener listener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		Button btn2 = new Button("선택");
		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int ca = cbcategory.getSelectedIndex();
				int co = cbcontent.getSelectedIndex();
				ta.append(category[ca] + " " + content[ca][co] + "\n");
			}
			
		};
		// 버튼과 리스너 연결
		btn1.addActionListener(listener1);
		btn2.addActionListener(listener2);

		southpanel.add(btn1);
		southpanel.add(btn2);

		setVisible(true);
	}
}
