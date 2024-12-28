package Screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainScreen extends JFrame {
	public MainScreen() {	
		// JFrame 제목 설정
		setTitle("Kiosks for study Cafe");
		
		// 창 크기 설정
		setSize(500, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// 매개변수로 동작의 종류를 저장
													// EXIT_ON_CLOSE는 프레임을 닫을 때 프로그램 전체가 종료됨  
		// FlowLayout 객체 전달하기
		setLayout(new FlowLayout(FlowLayout.CENTER, 30, 550));
		
		// 버튼 만들어서
		JButton StartButton = new JButton("시작");
		//StartButton.setBackground(Color.BLUE);					// 배경색 변경
		StartButton.setForeground(Color.BLACK);						// 글자색 변경
		StartButton.setOpaque(true);								// 투명도 설정 (true)
		StartButton.setBackground(new Color(204, 255, 255, 200));	// (RED, GREEN, BLUE, 투명도) 
		
		
		
		JButton btn1 = new JButton("자리 변경??");
		btn1.setForeground(Color.BLACK);
		btn1.setOpaque(true);	
		btn1.setBackground(new Color(204, 255, 255, 200));
		
		// 버튼 크기와 위치 설정
		Dimension buttonSize = new Dimension(150, 50);
		StartButton.setPreferredSize(buttonSize);
		btn1.setPreferredSize(buttonSize);
		
		// 프레임에 추가하기
		add(StartButton);
		add(btn1);
		
		setVisible(true);
	}
	
	// RUN 했을 때 실행순서가 시작되는 main 메소드
	public static void main(String[] args) throws InterruptedException {
		
		new MainScreen();
	}
}