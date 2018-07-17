package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class CommonsDialog extends Frame {

	public CommonsDialog() {
		// Frame 설정
		setBounds(200, 200, 600, 600);// setBounds(int x,int y,int width,int height)
		setTitle("공통 대화 상자");
		// FileDialog 만들기 - 첫번째 매개변수가 Dialog나 Frame 주소
		FileDialog filedialog = new FileDialog(this, "대화 상자");
		// 파일 대화상자의 디렉토리 설정
		filedialog.setDirectory("C:\\JavaProgramming\\source");
		// 파일 대화상자를 화면에 출력
		filedialog.setVisible(true);
		// 선택한 파일의 경로를 가져오기
		String filepath = filedialog.getDirectory() + filedialog.getFile();

		Label lab = new Label(filepath);
		add(lab);

		// 화면 출력
		setVisible(true);
	}
}
