package mypanel.label;
//swing
import javax.swing.*;
import java.awt.*; 
import java.awt.Color;
import java.awt.Container;
//io
import java.awt.geom.AffineTransform;   
import java.awt.image.AffineTransformOp;   
import java.awt.image.BufferedImage;

import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 
import java.io.*;

public class imp extends JLabel{
	//ui部分：
	public ImageIcon ic1;
	//显示属性：
	public int x=0;
	public int y=0;
	public int UIwidth;
	public int UIheight;
	public double cRate=1;
	//正反属性：
	public boolean dirctor=true; 

	public imp(String imgname,double compressRate,int p_x,int p_y){
		//初始化图片，不用加image：
		super();
		ic1=new ImageIcon("image/" + imgname);
		//传入x，y数据：
		x=p_x;
		y=p_y;
		cRate=compressRate;
		//按比例压缩：
		//确定图片大小：
		File file = new File("image/" + imgname);
		BufferedImage bi=null; 
		try{
			bi = ImageIO.read(file); 
		}catch(Exception e){
			e.printStackTrace(); 
		}
		int imgwidth=bi.getWidth(); 
		int imgheight=bi.getHeight(); 
		int minx=bi.getMinX();
		int miny=bi.getMinY();
		//得到窗体大小：
		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();
		int height = (int)screensize.getHeight();
		//计算UI的大小：
		UIwidth=(int)((imgwidth-minx)*compressRate*(width/768));
		UIheight=(int)((imgheight-miny)*compressRate*(width/768));
		//第一是左上角的x坐标，第二个是左上角y左边，第三个是控件宽度，第四个是高度
		ic1.setImage(ic1.getImage().getScaledInstance(UIwidth,UIheight,Image.SCALE_DEFAULT));
		this.setIcon(ic1);
		this.setBounds(p_x,p_y,UIwidth,UIheight);
	}
	
	
}