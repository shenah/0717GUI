package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class CommonsDialog extends Frame {

	public CommonsDialog() {
		// Frame ����
		setBounds(200, 200, 600, 600);// setBounds(int x,int y,int width,int height)
		setTitle("���� ��ȭ ����");
		// FileDialog ����� - ù��° �Ű������� Dialog�� Frame �ּ�
		FileDialog filedialog = new FileDialog(this, "��ȭ ����");
		// ���� ��ȭ������ ���丮 ����
		filedialog.setDirectory("C:\\JavaProgramming\\source");
		// ���� ��ȭ���ڸ� ȭ�鿡 ���
		filedialog.setVisible(true);
		// ������ ������ ��θ� ��������
		String filepath = filedialog.getDirectory() + filedialog.getFile();

		Label lab = new Label(filepath);
		add(lab);

		// ȭ�� ���
		setVisible(true);
	}
}
