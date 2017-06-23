import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;


public class Safe extends JFrame {

	public Safe() {
		
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelCode = new JPanel();
		getContentPane().add(panelCode, BorderLayout.CENTER);
		panelCode.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel l1 = new JLabel("x");
		panelCode.add(l1);
		
		JLabel l2 = new JLabel("x");
		panelCode.add(l2);
		
		JLabel l3 = new JLabel("x");
		panelCode.add(l3);
		
		JPanel panelNumber = new JPanel();
		getContentPane().add(panelNumber, BorderLayout.SOUTH);
		panelNumber.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton b1 = new JButton("1");
		panelNumber.add(b1);
		
		JButton b2 = new JButton("2");
		panelNumber.add(b2);
		
		JButton b3 = new JButton("3");
		panelNumber.add(b3);
		
		JButton b4 = new JButton("4");
		panelNumber.add(b4);
		
		JButton b5 = new JButton("5");
		panelNumber.add(b5);
		
		JButton b6 = new JButton("6");
		panelNumber.add(b6);
		
		JButton b7 = new JButton("7");
		panelNumber.add(b7);
		
		JButton b8 = new JButton("8");
		panelNumber.add(b8);
		
		JButton b9 = new JButton("9");
		panelNumber.add(b9);
		
		JPanel panelResult = new JPanel();
		getContentPane().add(panelResult, BorderLayout.WEST);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(10);
		textArea.setColumns(10);
		textArea.setText("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		panelResult.add(textArea);
		
		pack();
		setVisible(true);
		
		generateNumber();
	}

	public static void main(String[] args) {
	new Safe();

	}
public void generateNumber(){
//генерация чисел	
int [] m={1,2,3,4,5,6,7,8,9};
int[] code=new int [3];

for (int i=0;i<3;i++){ 
int j = (int) (Math.random()*9);	

if (m[j]!=0){
	code[i]=m[j];	
	m [j]=0;
	
}else{
	i--;
}



System.out.print(code[i]);
}
}
}


