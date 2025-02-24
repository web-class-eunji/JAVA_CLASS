package day15;

import javax.swing.*; // Gui 라이브러리
import java.awt.event.ActionEvent; // 버튼 클릭 이벤트 처리
import java.awt.event.ActionListener; 
import java.util.Random;
import java.util.ArrayList;

class LuckyNumberMaker extends JFrame{
	JLabel label = new JLabel("숫자 출력");
	JButton btn_luckyNumButton = new JButton("로또 번호 추첨!");
	
	ArrayList<Integer> numbers = new ArrayList<>();
	Random rand = new Random();
	
	LuckyNumberMaker(){
		setTitle("로또 번호 추첨기"); 
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		label.setBounds(20,50,300,30);
		btn_luckyNumButton.setBounds(20,100,150,30);
		btn_luckyNumButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int newNumber = 0;
				if(numbers.size() < 6) {
					do {
						newNumber = rand.nextInt(45)+1;
					}while(numbers.contains(newNumber));
				}
				numbers.add(newNumber);
				label.setText("번호 : " + numbers.toString());
				
				if(numbers.size() == 6) {
					btn_luckyNumButton.setEnabled(false);
					label.setText("이번주 로또 번호 : " + numbers.toString());
				}
			}
		});
		
		add(label);
		add(btn_luckyNumButton);
		setVisible(true);
	}
}

public class _04_LuckyNumMaker {

	public static void main(String[] args) {
		new LuckyNumberMaker();

	}

}
