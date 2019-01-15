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
	//�����ߵ���Ļ�߶ȣ�
	public int developer_height=768;
	
	//ui���֣�
	public ImageIcon ic1;
	//��ʾ���ԣ�
	public int x=0;
	public int y=0;
	public int UIwidth;
	public int UIheight;
	public double cRate=1;
	//�������ԣ�
	public boolean dirctor=true; 

	public imp(String imgname,double compressRate,int p_x,int p_y){
		//��ʼ��ͼƬ�����ü�image��
		super();
		ic1=new ImageIcon("image/" + imgname);
		//����x��y���ݣ�
		x=p_x;
		y=p_y;
		cRate=compressRate;
		//������ѹ����
		//ȷ��ͼƬ��С��
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
		//�õ������С��
		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();
		int height = (int)screensize.getHeight();
		//����UI�Ĵ�С��
		UIwidth=(int)((imgwidth-minx)*compressRate*(height/developer_height));
		UIheight=(int)((imgheight-miny)*compressRate*(height/developer_height));
		//��һ�����Ͻǵ�x���꣬�ڶ��������Ͻ�y��ߣ��������ǿؼ���ȣ����ĸ��Ǹ߶�
		ic1.setImage(ic1.getImage().getScaledInstance(UIwidth,UIheight,Image.SCALE_DEFAULT));
		this.setIcon(ic1);
		this.setBounds(p_x,p_y,UIwidth,UIheight);
	}
	
	
}