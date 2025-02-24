package day15;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class SwingDemo extends JFrame{
	
	JTextField tf_01 = new JTextField();
	JTextField tf_02 = new JTextField();
	JButton btn_plus = new JButton("더하기");
	JLabel result = new JLabel("결과 출력");
	
	SwingDemo() {
		setTitle("내 첫 번째 GUI 프로그램"); 
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		tf_01.setBounds(50,50,40,40);
		tf_02.setBounds(100,50,40,40);
		btn_plus.setBounds(150,50,80,40);
		result.setBounds(50,100,200,40);
		// (x,y,width,height)
		
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// 액션이벤트 발생 시 실행
				try {
					//try : 예외가 발생하지 않았을 때
					//Integer.parseInt(문자열) : 문자열(String)을 정수형(int)로 변환하는 메서드
					int num1 = Integer.parseInt(tf_01.getText());
					int num2 = Integer.parseInt(tf_02.getText());
					int sum = num1 + num2;
					result.setText("결과 : " + sum);
				}catch(NumberFormatException ex) {
					//NumberFormatException : 숫자가 아닌 값을 parseInt로 변환하려고 할 때 발생하는 오류
					//catch : 예외가 발생했을 때 처리할 코드
					result.setText("숫자를 입력하세요!");
				}
			}
		});
		
		add(tf_01);
		add(tf_02);
		add(btn_plus);
		add(result);
		
		setVisible(true);
	}
}
public class _02_Swing {
	public static void main(String[] args) {
		new SwingDemo();
	}
}
