import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ITpractice extends JFrame implements ActionListener
{
	MenuBar m=new MenuBar();
	Menu File,Edit,Indent,Search,ctoc,cct;
	MenuItem New,Open,save,close,Undo,Redo,cut,copy,paste,Find,Findinfile,findn,findp,ild,dld,cff,cfn,cdp,upc,lwc,pc,pcb,sc,scb,ic,rc;
	
public ITpractice()
	{
		setMenuBar(m);
		setTitle("Notepad++");
		setSize(600,500);
		
//Menu Items		

		File=new Menu("File");
		m.add(File);
		
					Edit=new Menu("Edit");
					m.add(Edit);
					
					Indent=new Menu("Indent");
					Edit.add(Indent);
					
					ctoc=new Menu("Copy to Clipboard");
					Edit.add(ctoc);
					
					cct=new Menu("Convert Case To");
					Edit.add(cct);
					
								Search=new Menu("Search");
								m.add(Search);
								
				
//Items in Menu Items		

//A.File
		New=new MenuItem("New");
		Open=new MenuItem("Open");
		save=new MenuItem("Save");
		close=new MenuItem("Close");
		File.add(New);
				//ActionListner
				New.addActionListener(this);
		File.add(Open);
				//ActionListner
				Open.addActionListener(this);
		File.add(save);
				//ActionListner
				save.addActionListener(this);
		File.add(close);
				//ActionListner
				close.addActionListener(this);
//B.Edit
						Undo=new MenuItem("Undo");
						Redo=new MenuItem("Redo");
						cut=new MenuItem("Cut");
						copy=new MenuItem("Copy");
						paste=new MenuItem("Paste");
						Edit.add(Undo);
								//ActionListener
								Undo.addActionListener(this);
						Edit.add(Redo);
						Edit.add(cut);
						Edit.add(copy);
						Edit.add(paste);
						
//B.1.Indent
										ild=new MenuItem("Increase Line Indent");
										dld=new MenuItem("Decrease Line Indent");
										Indent.add(ild);
										Indent.add(dld);
//B.2.copy to clipboard
											cff=new MenuItem("Current Full File path to Clipboard");					
											cfn=new MenuItem("Current File Name to Clipboard");
											cdp=new MenuItem("Current Dir, Path to Clipboard");
											ctoc.add(cff);
											ctoc.add(cfn);
											ctoc.add(cdp);
//B.3.convert case to
												upc=new MenuItem ("UPPERCASE(Ctrl+Shift+U)");
												lwc=new MenuItem ("lowercase(Ctrl+U)");
												pc=new MenuItem  ("Proper Case(Alt+U)");
												pcb=new MenuItem ("Propeer Case (blend)(Alt+Shift+U)");
												sc=new MenuItem  ("Sentence Case(Ctrl+Alt+U)");
												scb=new MenuItem ("Sentence Case (blend)(Ctrl+Alt+Shift+U)");
												ic=new MenuItem  ("iNVERT cASE");
												rc=new MenuItem  ("ranDOm CasE");
												cct.add(upc);
												cct.add(lwc);
												cct.add(pc);
												cct.add(pcb);
												cct.add(sc);
												cct.add(scb);
												cct.add(ic);
												cct.add(rc);
//C.Search
														Find=new MenuItem("Find");
														Findinfile=new MenuItem("Find in Files");
														findn=new MenuItem("Find Next");
														findp=new MenuItem("Find Previous");
														Search.add(Find);
														Search.add(Findinfile);
														Search.add(findn);
														Search.add(findp);				
	}
// To Show our Main Menu Class or we can say that class we see on Panel\\	
		
		public static void main (String ar[])
		{
			ITpractice mm=new ITpractice();
			mm.setSize(900,900);
			mm.setVisible(true);
		}
		
//All the work related to Action Lister happens here\\

		
		public void actionPerformed(ActionEvent ea)
			{
				Object ob=ea.getSource();
				if(ob==Undo)
				{
				System.out.println("goinmg");
					frame sf=new frame();
					sf.setSize(800,800);
					sf.setVisible(true);
				}
				else
					if(ob==New)
				{
				System.out.println("goinmg");
					frame sf=new frame();
					sf.setSize(800,800);
					sf.setVisible(true);
				}
				else
					if(ob==Open)
				{
				System.out.println("goinmg");
					frame sf=new frame();
					sf.setSize(800,800);
					sf.setVisible(true);
				}
				else
					if(ob==save)
				{
				System.out.println("goinmg");
					frame sf=new frame();
					sf.setSize(800,800);
					sf.setVisible(true);
				}
				else
					if(ob==close)
				{
				System.out.println("goinmg");
					frame sf=new frame();
					sf.setSize(800,800);
					sf.setVisible(true);
				}
			}
}

// Here is the use of Inheritence class extending another Class

class frame extends ITpractice
{
	
	JPanel p;
	GridBagLayout gb;
	GridBagConstraints gc;
	JLabel mroll,mname,fname,mno,madd,mpinc,mcity,mstate;
	JTextField roll,name,fnme,no,add,pinc,city,state;
	JCheckBox jc1;          
	JButton jbb;
	
	
		frame()
		{
		System.out.println("going coming");
			p=new JPanel();
			gb=new GridBagLayout();
			gc=new GridBagConstraints();
			
			getContentPane().add(p);
			
			p.setLayout(gb);
			
			setSize(400,400);
			setTitle("ABC");
			
			mroll=new JLabel("Roll");
			roll=new JTextField(10);
			
			mname=new JLabel("Student Name");
			name=new JTextField(10);
			
			fname=new JLabel("Father Name");
			fnme=new JTextField(10);
			
			mno=new JLabel("Mobile No.");
			no=new JTextField(10);
			
			madd=new JLabel("Address");
			add=new JTextField(10);
			
			mpinc=new JLabel("Pin Code");
			pinc=new JTextField(10);
			
			mcity=new JLabel("City");
			city=new JTextField(10);
			
			mstate=new JLabel("State");
			state=new JTextField(10);
			
			jc1=new JCheckBox("Ba");
			jbb=new JButton ("Click");
			
				gc.gridx=0;
				gc.gridy=0;
				gb.setConstraints(mroll,gc);
				p.add(mroll);
				
				gc.gridx=1;
				gc.gridy=0;
				gb.setConstraints(roll,gc);
				p.add(roll);
				
				gc.gridx=2;
				gc.gridy=0;
				gb.setConstraints(mname,gc);
				p.add(mname);
				
				gc.gridx=3;
				gc.gridy=0;
				gb.setConstraints(name,gc);
				p.add(name);
				
				gc.gridx=0;
				gc.gridy=1;
				gb.setConstraints(fname,gc);
				p.add(fname);
				
				gc.gridx=1;
				gc.gridy=1;
				gb.setConstraints(fnme,gc);
				p.add(fnme);
				
				gc.gridx=2;
				gc.gridy=1;
				gb.setConstraints(mno,gc);
				p.add(mno);
			
				gc.gridx=3;
				gc.gridy=1;
				gb.setConstraints(no,gc);
				p.add(no);
				
				gc.gridx=0;
				gc.gridy=2;
				gb.setConstraints(madd,gc);
				p.add(madd);
				
				gc.gridx=1;
				gc.gridy=2;
				gb.setConstraints(add,gc);
				p.add(add);
				
				gc.gridx=2;
				gc.gridy=2;
				gb.setConstraints(mpinc,gc);
				p.add(mpinc);
				
				
				gc.gridx=3;
				gc.gridy=2;
				gb.setConstraints(pinc,gc);
				p.add(pinc);
				
				gc.gridx=0;
				gc.gridy=3;
				gb.setConstraints(mcity,gc);
				p.add(mcity);
				
				gc.gridx=1;
				gc.gridy=3;
				gb.setConstraints(city,gc);
				p.add(city);
				
				gc.gridx=2;
				gc.gridy=3;
				gb.setConstraints(mstate,gc);
				p.add(mstate);
				
				gc.gridx=3;
				gc.gridy=3;
				gb.setConstraints(state,gc);
				p.add(state);	

				gc.gridx=0;
				gc.gridy=4;
				gb.setConstraints(jc1,gc);
				p.add(jc1);
				
				gc.gridx=1;
				gc.gridy=4;
				gb.setConstraints(jbb,gc);
				p.add(jbb);
}	}				