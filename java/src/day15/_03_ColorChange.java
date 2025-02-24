package day15;

import javax.swing.*; // Gui 라이브러리
import java.awt.*; // 색상 및 레이아웃 관련 클래스
import java.awt.event.ActionEvent; // 버튼 클릭 이벤트 처리
import java.awt.event.ActionListener; 

class ColorChanger extends JFrame{
	JPanel panel = new JPanel();
	JButton btn_red = new JButton("빨간휴지");
	JButton btn_blue = new JButton("파란휴지");
	
	ColorChanger(){
		setTitle("빨간휴지줄까? 파란휴지줄까?");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		//BorderLayout.CENTER : 창의 가운데 배치하겠다~
		//BorderLayout.SOUTH : 창의 아래쪽에 배치하겠다~
		add(panel,BorderLayout.CENTER);
		
		JPanel btnPanel = new JPanel();
		btnPanel.add(btn_red);
		btnPanel.add(btn_blue);
		add(btnPanel,BorderLayout.SOUTH);
		
		btn_red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.RED);
			}
		});
		
		btn_blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.BLUE);
			}
		});
		
		setVisible(true);
	}
	
	
}

public class _03_ColorChange {

	public static void main(String[] args) {
		new ColorChanger();
		/*
		 * JFrame : 창만들기
		 * JButton : 버튼
		 * JPanel : 배경패널
		 * addActionListener() : 클릭이벤트 처리
		 * */

	}

}
