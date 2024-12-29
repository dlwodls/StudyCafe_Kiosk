package Screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SearchMemberScreen extends JFrame {
	public SearchMemberScreen() {
		setTitle("Kiosks for study cafe");
		
		// 창 크기 설정
		setSize(600, 900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// FlowLayout 객체 전달
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 400));
		
		// 회원 이름 입력
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new BoxLayout(namePanel, BoxLayout.X_AXIS));
		namePanel.add(new JLabel("회원 이름 : "));
		namePanel.add(new JTextField(15));
		
		// 생년월일 작성하는 란에 / 자동추가 할 수 있게!!
		JPanel birthPanel = new JPanel();
		birthPanel.setLayout(new BoxLayout(birthPanel, BoxLayout.X_AXIS));
		birthPanel.add(new JLabel("회원 생년월일 : "));
		birthPanel.add(new JTextField(15));
		
		JPanel phonePanel = new JPanel();
		phonePanel.setLayout(new BoxLayout(phonePanel, BoxLayout.X_AXIS));
		phonePanel.add(new JLabel("회원 전화번호 : "));
		phonePanel.add(new JTextField(15));
		
		JPanel enterPanel = new JPanel();
		enterPanel.add(new JButton("입력"));
		
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
		inputPanel.add(namePanel);
		inputPanel.add(birthPanel);
		inputPanel.add(phonePanel);
		inputPanel.add(enterPanel);
		
		add(inputPanel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args) throws InterruptedException {
		new SearchMemberScreen();
	}
}