import mypanel.*;
import mypanel.label.*;
//swing
import javax.swing.*;
import java.awt.*; 
import java.awt.Color;
import java.awt.Container;
public class test_imp extends JFrame{
	public imp p1 = new imp("board.png",1,100,0);
	public test_imp(){
		//��ͷ��
		super("fish");
		//���þ��Բ��֣�
		GridLayout grid =new GridLayout(2,2);
		setLayout(grid);
		//ȥ���߿���仰������ǰ�ţ�����ᱨ����
		//��������Ҫ��ȡ��Ļ��С�����֮ǰ
		setUndecorated(true);
		//����ɫ��
		Color ilike=new Color(153,168,205);
		getContentPane().setBackground(ilike);
		//�õ������С��
		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();
		int height = (int)screensize.getHeight();
		//add
		add(p1,10,0);
		//big:
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(width, height); 
        setVisible(true);
		//���ڳ��׹رճ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		test_imp t1=new test_imp();
	}
}