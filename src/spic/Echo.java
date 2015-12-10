package spic;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;

public class Echo implements ActionListener, Runnable {

	private static final String HOST = "127.0.0.1";
	private static final int PORT = 12345;
	private final JTextField tf;
	private final JTextArea ta;
	private final JButton send;
	private volatile PrintWriter out;
	private Scanner in;
	private Thread thread;
	private Kind kind;

	
	public enum Kind {
		Client(100, "Trying"), Server(500, "Awaiting");
		private int offset;
		private String activity;

		private Kind(int offset, String activity) {
			this.offset = offset;
			this.activity = activity;
		}

	}
	public Echo(Kind server, JTextField tf, JTextArea ta, JButton send) {
		this.kind = server;
		this.tf = tf;
		this.ta = ta;
		this.send = send;
		send.addActionListener(this);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		DefaultCaret caret = (DefaultCaret) ta.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		// display(kind.activity + HOST + " on port " + PORT);
		thread = new Thread(this, server.toString());
	}

	public void start() {
		thread.start();
	}

	// @Override
	public void actionPerformed(ActionEvent ae) {
		if(!GUI_final.son_mode)
		{
		String s = tf.getText();
		if (out != null) {
			out.println(s);
		}
		display(s);
		
		
		/*try{
			GUI_final.chat_panel.removeAll();
			GUI_final.chat_panel.revalidate();
			GUI_final.chat_panel.repaint();
			for (int i=0; i < entries.size(); i++){
				
				BufferedImage myPicture = ImageIO.read(entries.get(i).image);
	    		JLabel picLabel2 = new JLabel(new ImageIcon(myPicture));
	    		GUI_final.chat_panel.add(picLabel2);
	    		
	    		picLabel2.setSize(150, 150);
	    		picLabel2.setLocation(200, 200);
			}
		}
		catch (Exception e){}*/
		}else{
			try{
				GUI_final.chat_panel.removeAll();
				GUI_final.chat_panel.revalidate();
				GUI_final.chat_panel.repaint();
				for (int i=0; i < GUI_final.image_sentence.size(); i++){
					
					BufferedImage myPicture = ImageIO.read(GUI_final.image_sentence.get(i));
		    		JLabel picLabel2 = new JLabel(new ImageIcon(myPicture));
		    		GUI_final.chat_panel.add(picLabel2);
		    		Dimension s=GUI_final.chat_panel.getSize();
		    		System.out.println("Size "+s.height +" and "+ s.width);
		    		picLabel2.setSize(150, 150);
		    		picLabel2.setLocation(200, 200);
				}
			}
			catch (Exception e){}
			String s = Parser.get_sentence_from_images(GUI_final.image_sentence);
			if (out != null) {
				out.println(s);
			}
			display(s);
			GUI_final.image_sentence = new ArrayList<File>();
			GUI_final.clean_panel(GUI_final.messege_panel);
		}
		tf.setText("");
	}

	// @Override
	public void run() {
		try {
			Socket socket;
			if (kind == Kind.Client) {
				socket = new Socket(HOST, PORT);
			} else {
				ServerSocket ss = new ServerSocket(PORT);
				socket = ss.accept();
			}
			in = new Scanner(socket.getInputStream());
			out = new PrintWriter(socket.getOutputStream(), true);
			//display("Connected");
			while (true) {
				if (!GUI_final.son_mode) display(in.nextLine());
				else{
					String s = in.nextLine();
					List<Entry> entries = Parser.get_entries(GUI_final.path, s, GUI_final.dictio);
					try{
						GUI_final.chat_panel.removeAll();
						GUI_final.chat_panel.revalidate();
						GUI_final.chat_panel.repaint();
						for (int i=0; i < entries.size(); i++){
							
							BufferedImage myPicture = ImageIO.read(entries.get(i).image);
				    		JLabel picLabel2 = new JLabel(new ImageIcon(myPicture));
				    		GUI_final.chat_panel.add(picLabel2);
				    		
				    		picLabel2.setSize(150, 150);
				    		picLabel2.setLocation(200, 200);
						}
					}
					catch (Exception e){}
				}
			}
		} catch (Exception e) {
			display(e.getMessage());
			e.printStackTrace(System.err);
		}
	}

	private void display(final String s) {
		EventQueue.invokeLater(new Runnable() {
			// @Override
			public void run() {
				ta.append(s + "\n");
			}
		});
	}

	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { //@Override public void run() { new
	 * Echo(Kind.Server).start(); } }); }
	 */

}
