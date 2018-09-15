import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MineSweeper {
	public static void main(String[] args) {
		int h=10,l=10,i,j;
		//雷的个数
		int num=30;
		int lz[]=new int[num];
		int count=0;
		int a[][]=new int [h][l];
		//去重复
		while(count<num){
			int x=(int)(Math.random()*100);
			boolean flag=true;
			for(j=0;j<num;j++){
				if(x==lz[j]){
					flag=false;
					break;
				}
			}
			if(flag){
				lz[count]=x;
				count++;
			}
		}
		for(i=0;i<num;i++)
		{
			//lz[i]=(int)(Math.random()*100);
			a[lz[i]/10][lz[i]%10]=9;
		}
		//
		
		for(i=0;i<h;i++)
			for(j=0;j<l;j++){
				if(a[i][j]==0){
					if(i-1>=0&&j-1>=0)
						a[i][j]=a[i][j]+a[i-1][j-1]/9;
					if(i-1>=0)
						a[i][j]=a[i][j]+a[i-1][j]/9;
					if(i-1>=0&&j+1<l)
						a[i][j]=a[i][j]+a[i-1][j+1]/9;
					if(i+1<h&&j-1>=0)
						a[i][j]=a[i][j]+a[i+1][j-1]/9;
					if(i+1<h)
						a[i][j]=a[i][j]+a[i+1][j]/9;
					if(i+1<h&&j+1<l)
						a[i][j]=a[i][j]+a[i+1][j+1]/9;
					if(j-1>=0)
						a[i][j]=a[i][j]+a[i][j-1]/9;
					if(j+1<l)
						a[i][j]=a[i][j]+a[i][j+1]/9;
				}
			}
			
		//
		JFrame f=new JFrame("扫雷3.0");
		JButton[][] mineboutton=new JButton[h][l];
		JPanel pane=new JPanel();
		f.setSize(h*28+25, l*28+45);
		//ImageIcon myicon=new ImageIcon("images/0.gif");
		//
		//ImageIcon myiconl=new ImageIcon("images/mine.gif");
		//
		ImageIcon[] ar_icon={new ImageIcon("images/blankb.gif"),new ImageIcon("images/1.gif"),
				new ImageIcon("images/2.gif"),new ImageIcon("images/3.gif"),
				new ImageIcon("images/4.gif"),new ImageIcon("images/5.gif"),
				new ImageIcon("images/6.gif"),new ImageIcon("images/7.gif"),
				new ImageIcon("images/8.gif"),new ImageIcon("images/mine.gif")};
		//
		for(i=0;i<h;i++)
			for(j=0;j<l;j++){
				//f(a[i][j]==9)
					mineboutton[i][j]=new JButton(ar_icon[a[i][j]]);
				//else
					//mineboutton[i][j]=new JButton(myicon);
				mineboutton[i][j].setMargin(new Insets(0,0,0,0));
				pane.add(mineboutton[i][j]);
			}
		f.setContentPane(pane);
		f.setLocation(200, 150);
		f.setVisible(true);
	}
}
