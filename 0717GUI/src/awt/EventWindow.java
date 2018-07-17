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
		setTitle("�̺�Ʈ ó��");

		Panel northpanel = new Panel();
		add("North", northpanel);
		Panel southpanel = new Panel();
		add("South", southpanel);

		// üũ�ڽ�, ���� ��ư, �޺��ڽ��� ó���ϴ� �̺�Ʈ=>ItemEvent=>ItemListener

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

		// �߾ӿ� TextArea ��ġ
		TextArea ta = new TextArea(10, 70);
		add("Center", ta);
		ta.setVisible(true);

		// �޺��ڽ� 2�� ��ġ
		// �޺��ڽ��� ��ġ�� ������ �����
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

		// Checkbox �̺�Ʈ ó��
		ItemListener itemHandler1 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// ta.append(e.getSource().toString()+"�� �������ϴ�."+"\n");
				// �̺�Ʈ ��ü �ּҸ� ����ȯ���ش�.
				Checkbox ed = (Checkbox) (e.getSource());
				String label = ed.getLabel();
				boolean b = ed.getState();
				ta.append(label + " " + b + "�� ����" + "\n");
			}
		};
		//üũ�ڽ��� �̺�Ʈ ����
		cnboo.addItemListener(itemHandler1);
		cnint.addItemListener(itemHandler1);
		cnshort.addItemListener(itemHandler1);
		cnfloat.addItemListener(itemHandler1);
		cndouble.addItemListener(itemHandler1);

		// �޺��ڽ�(ChoiceBox)�̺�Ʈ ó��
		// ī�װ� �ں� �ڽ��� ������ ����Ǿ��� ��
		ItemListener itemHandler2 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// cbcategory�� ���õ� ���ȣ ��������
				int row = cbcategory.getSelectedIndex();
				// cbcontent ���� ���� �����
				cbcontent.removeAll();
				// ���ȣ�� �ش��ϴ� ���� ������ cbcontent�ȿ� �ֱ�
				for (String temp : content[row]) {
					cbcontent.add(temp);
				}
			}
		};
		//�޺��ڽ��� �̺�Ʈ ����
		cbcategory.addItemListener(itemHandler2);

		// ��ư�� Ŭ���ϴ� �̺�Ʈ =>ActionEvent=>ActionListener
		// ActionListener�� �������̽�, �޼ҵ带 �������ؾ� ��
		Button btn1 = new Button("����");
		ActionListener listener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		Button btn2 = new Button("����");
		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int ca = cbcategory.getSelectedIndex();
				int co = cbcontent.getSelectedIndex();
				ta.append(category[ca] + " " + content[ca][co] + "\n");
			}
			
		};
		// ��ư�� ������ ����
		btn1.addActionListener(listener1);
		btn2.addActionListener(listener2);

		southpanel.add(btn1);
		southpanel.add(btn2);

		setVisible(true);
	}
}
