package Screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SearchMemberScreen extends JFrame {
	public SearchMemberScreen() {
		setTitle("Kiosks for study cafe");
		
		setSize(500, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			}
	
	public static void main(String[] args) throws InterruptedException {
		new SearchMemberScreen();
	}
}