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
	// 생성자
	public LoginWindow() {
		// 크기와 위치 및 타이틀 설정
		setSize(1000, 1000);
		setLocation(500, 500);
		setTitle("로그인");

		// 패널 생성
		Panel panel = new Panel();

		// 한 줄의 텍스트를 입력할 수 있는 TextField
		Label labId = new Label("아이디:");
		TextField textId = new TextField(20);
		panel.add(labId);
		panel.add(textId);

		Label labPw = new Label("비밀번호:");
		TextField textPw = new TextField(20);
		textPw.setEchoChar('*');
		panel.add(labPw);
		panel.add(textPw);

		// 여러 줄의 텍스트를 입력할 수 있는 TextArea
		TextArea textarea = new TextArea();
		panel.add(textarea);

		// 메뉴바 만들기
		MenuBar menubar = new MenuBar();
		Menu file = new Menu("파일");
		menubar.add(file);

		MenuItem newfile = new MenuItem("새로만들기");
		MenuItem open = new MenuItem("열기");
		Menu save = new Menu("저장");
		MenuItem saveone = new Menu("저장");
		MenuItem saveall = new Menu("모두 저장");

		file.add(newfile);
		file.add(open);
		file.add(save);
		save.add(saveone);
		save.add(saveall);

		// 메뉴바를 프레임에 추가
		setMenuBar(menubar);

		// 패널을 프레임에 부착
		add(panel);

		// 화면출력
		setVisible(true);
	}

}
