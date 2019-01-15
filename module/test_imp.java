import mypanel.*;
import mypanel.label.*;
//swing
import javax.swing.*;
import java.awt.*; 
import java.awt.Color;
import java.awt.Container;
public class test_imp extends JFrame{
	public imp p1 = new imp("board.png",1,100,0);
	public imbtn p2 = new imbtn("board.png",1,300,0);
	public test_imp(){
		//开头：
		super("fish");
		//设置绝对布局：
		GridLayout grid =new GridLayout(2,2);
		setLayout(null);
		//去掉边框，这句话必须往前放，否则会报错：
		//放置在需要读取屏幕大小的语句之前
		setUndecorated(true);
		//背景色：
		Color ilike=new Color(0,0,0,0);
		this.setBackground(ilike);
		//得到窗体大小：
		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();
		int height = (int)screensize.getHeight();
		
		//窗体透明设置：
		/* double value = 1;
		if (com.sun.awt.AWTUtilities.isWindowOpaque(this)) {
            com.sun.awt.AWTUtilities.setWindowOpacity(this, (float)(1 - value));
        } else {
            JOptionPane.showMessageDialog(this, "系统不支持 JDK版本过低或 JRE 系统库缺损");
        } */
		
		
		//add(p1,10,0);
		add(p2,10,0);
		
		
		//big:
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(width, height); 
        setVisible(true);
		//用于彻底关闭程序：
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		test_imp t1=new test_imp();
	}
}