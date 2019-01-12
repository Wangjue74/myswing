import mypanel.*
import mypanel.label*
//swing
import javax.swing.*;
import java.awt.*; 
import java.awt.Color;
import java.awt.Container;
public class test1 extends JFrame{
	public static void main(String[] args){
		test1 t1=new test1();
	}
	public test1(){
		//开头：
		super("fish");
		//设置绝对布局：
		GridLayout grid =new GridLayout(2,2);
		setLayout(grid);
		//去掉边框，这句话必须往前放，否则会报错：
		//放置在需要读取屏幕大小的语句之前
		setUndecorated(true);
		//背景色：
		Color ilike=new Color(153,168,205);
		getContentPane().setBackground(ilike);
		//得到窗体大小：
		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();
		int height = (int)screensize.getHeight();
		//add
		
		//big:
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(width, height); 
        setVisible(true);
		//用于彻底关闭程序：
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}