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
		
		JPanel phonePanel = new JPanel();
		phonePanel.setLayout(new BoxLayout(phonePanel, BoxLayout.X_AXIS));
		phonePanel.add(new JLabel("회원 전화번호 : "));
		phonePanel.add(new JTextField(15));
		
		JPanel enterPanel = new JPanel();
		enterPanel.add(new JButton("입력"));
		
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
		inputPanel.add(namePanel);
		inputPanel.add(phonePanel);
		inputPanel.add(enterPanel);
		
		add(inputPanel, BorderLayout.CENTER);
		
		setVisible(true);
		
		
		
		
		
		
		
		
		/*
		
		// JPanel 생성 및 설정
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));	// 세로 정렬  
		
		// JLabel과 JTextField 추가
		// 회원 이름 입력
		JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel nameLabel = new JLabel("회원 이름 : ");
		JTextField nameField = new JTextField(15);
		add(nameLabel);
		add(nameField);
		
		// 회원 전화번호 입력
		JPanel phonePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel phoneLabel = new JLabel("회원 전화번호 : ");
		JTextField phoneField = new JTextField(15);
		add(phoneLabel);
		add(phoneField);
		
		// JPanel을 프레임에 추가
		inputPanel.add(namePanel);
		inputPanel.add(phonePanel);
		
		setLayout(new GridBagLayout());
		add(inputPanel);
		
		inputPanel.add(phonePanel);
				
		setVisible(true);
		
		*/
	}
	
	public static void main(String[] args) throws InterruptedException {
		new SearchMemberScreen();
	}
}