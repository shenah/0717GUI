package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class LoginWindow extends Frame {
	// ������
	public LoginWindow() {
		// ũ��� ��ġ �� Ÿ��Ʋ ����
		setSize(1000, 1000);
		setLocation(500, 500);
		setTitle("�α���");

		// �г� ����
		Panel panel = new Panel();

		// �� ���� �ؽ�Ʈ�� �Է��� �� �ִ� TextField
		Label labId = new Label("���̵�:");
		TextField textId = new TextField(20);
		panel.add(labId);
		panel.add(textId);

		Label labPw = new Label("��й�ȣ:");
		TextField textPw = new TextField(20);
		textPw.setEchoChar('*');
		panel.add(labPw);
		panel.add(textPw);

		// ���� ���� �ؽ�Ʈ�� �Է��� �� �ִ� TextArea
		TextArea textarea = new TextArea();
		panel.add(textarea);

		// �޴��� �����
		MenuBar menubar = new MenuBar();
		Menu file = new Menu("����");
		menubar.add(file);

		MenuItem newfile = new MenuItem("���θ����");
		MenuItem open = new MenuItem("����");
		Menu save = new Menu("����");
		MenuItem saveone = new Menu("����");
		MenuItem saveall = new Menu("��� ����");

		file.add(newfile);
		file.add(open);
		file.add(save);
		save.add(saveone);
		save.add(saveall);

		// �޴��ٸ� �����ӿ� �߰�
		setMenuBar(menubar);

		// �г��� �����ӿ� ����
		add(panel);

		// ȭ�����
		setVisible(true);
	}

}
