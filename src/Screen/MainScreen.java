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
		setSize(600, 900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// 매개변수로 동작의 종류를 저장
													// EXIT_ON_CLOSE는 프레임을 닫을 때 프로그램 전체가 종료됨  
		// FlowLayout 객체 전달하기
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 550));
		
		// 버튼 만들어서
		// 입실 버튼
		JButton CheckInButton = new JButton("입실");
		//CheckInButton.setBackground(Color.BLUE);					// 배경색 변경
		CheckInButton.setForeground(Color.BLACK);					// 글자색 변경
		CheckInButton.setOpaque(true);								// 투명도 설정 (true)
		CheckInButton.setBackground(new Color(204, 255, 255, 200));	// (RED, GREEN, BLUE, 투명도) 
		
		// 퇴실 버튼
		JButton CheckOutButton = new JButton("퇴실");
		CheckOutButton.setForeground(Color.BLACK);
		CheckOutButton.setOpaque(true);	
		CheckOutButton.setBackground(new Color(204, 255, 255, 200));
		
		// 좌석이동 버튼
		JButton SeatMovementButton = new JButton("좌석이동");
		SeatMovementButton.setForeground(Color.BLACK);
		SeatMovementButton.setOpaque(true);
		SeatMovementButton.setBackground(new Color(204, 255, 255, 200));
		
		// JButton 클릭 이벤트 처리
		CheckInButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SelectTimeScreen();
				
				// MainScreen 닫기
				dispose();
			}
		});
		
		CheckOutButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		// 버튼 크기와 위치 설정
		Dimension buttonSize = new Dimension(150, 50);
		CheckInButton.setPreferredSize(buttonSize);
		CheckOutButton.setPreferredSize(buttonSize);
		SeatMovementButton.setPreferredSize(buttonSize);
		
		// 프레임에 추가하기
		add(CheckInButton);
		add(CheckOutButton);
		add(SeatMovementButton);
		
		setVisible(true);
	}
	
	// RUN 했을 때 실행순서가 시작되는 main 메소드
	public static void main(String[] args) throws InterruptedException {
		
		/*
		Object[] title = {"요금제", "이용시간", "결제금액"};
		
		Object[][] TimeData = {
				{"1회 시간권", "2시간", "5,000원"},
				{"1회 시간권", "3시간", "7,000원"},
				{"1회 시간권", "4시간", "8,000원"},
				{"1회 시간권", "6시간", "12,000원"},
				{"1회 시간권", "10시간", "16,000원"}
		};
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		new MainScreen();
	}
}