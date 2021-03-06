/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spic;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import spic.Echo.Kind;

/**
 *
 * @author Itamar Talmon
 */
public class GUI_final extends javax.swing.JFrame {
	
	
    /**
     * Creates new form GUI_final
     */
    public GUI_final() {
        initComponents();
        EventQueue.invokeLater(new Runnable() {
            //@Override
            public void run() {
                new Echo(Kind.Client,text_field,textArea,send_button ).start();
            }
        });
        text_field.setVisible(false);
        textArea.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	setLayout(new BorderLayout());
        toggle_button = new javax.swing.JToggleButton();
        send_button = new javax.swing.JButton();
        backspace_button = new javax.swing.JButton();
        LowerLayeredPane = new javax.swing.JLayeredPane();
        text_field = new javax.swing.JTextField();
        messege_panel = new javax.swing.JPanel();
        choose_pic_panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        UpperLayeredPane = new javax.swing.JLayeredPane();
        chat_panel = new javax.swing.JPanel();
        textArea = new javax.swing.JTextArea();
        left_button = new javax.swing.JButton();
        right_button = new javax.swing.JButton();
        menu_bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("sPic");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        toggle_button.setText("Image");
        toggle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggle_buttonActionPerformed(evt);
            }
        });

        send_button.setBackground(new java.awt.Color(12, 255, 45));
        send_button.setText("Send");
        

        backspace_button.setText("Backspace");
        backspace_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspace_buttonActionPerformed(evt);
            }
        });

        LowerLayeredPane.setBorder(new javax.swing.border.MatteBorder(null));

        text_field.setFont(new java.awt.Font("FrankRuehl", 0, 48)); // NOI18N
        text_field.setText("");
        text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_fieldActionPerformed(evt);
            }
        });

        messege_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout messege_panelLayout = new javax.swing.GroupLayout(messege_panel);
        messege_panel.setLayout(messege_panelLayout);
        messege_panelLayout.setHorizontalGroup(
            messege_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1075, Short.MAX_VALUE)
        );
        messege_panelLayout.setVerticalGroup(
            messege_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        choose_pic_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setIcon(new ImageIcon(dictio.get(0).image.getPath()));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new ImageIcon(dictio.get(1).image.getPath()));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new ImageIcon(dictio.get(2).image.getPath()));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new ImageIcon(dictio.get(3).image.getPath()));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new ImageIcon(dictio.get(4).image.getPath()));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new ImageIcon(dictio.get(5).image.getPath()));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout choose_pic_panelLayout = new javax.swing.GroupLayout(choose_pic_panel);
        choose_pic_panel.setLayout(choose_pic_panelLayout);
        choose_pic_panelLayout.setHorizontalGroup(
            choose_pic_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choose_pic_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        choose_pic_panelLayout.setVerticalGroup(
            choose_pic_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choose_pic_panelLayout.createSequentialGroup()
                .addGroup(choose_pic_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        LowerLayeredPane.setLayer(text_field, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LowerLayeredPane.setLayer(messege_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LowerLayeredPane.setLayer(choose_pic_panel, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout LowerLayeredPaneLayout = new javax.swing.GroupLayout(LowerLayeredPane);
        LowerLayeredPane.setLayout(LowerLayeredPaneLayout);
        LowerLayeredPaneLayout.setHorizontalGroup(
            LowerLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LowerLayeredPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LowerLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(messege_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(choose_pic_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(363, 363, 363))
            .addGroup(LowerLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LowerLayeredPaneLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );
        LowerLayeredPaneLayout.setVerticalGroup(
            LowerLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LowerLayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choose_pic_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 23, Short.MAX_VALUE)
                .addComponent(messege_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(LowerLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LowerLayeredPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(189, Short.MAX_VALUE)))
        );

        UpperLayeredPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("FrankRuehl", 0, 36)); // NOI18N
        textArea.setRows(5);
        
        chat_panel.add(textArea);
        

        UpperLayeredPane.setLayer(chat_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout UpperLayeredPaneLayout = new javax.swing.GroupLayout(UpperLayeredPane);
        UpperLayeredPane.setLayout(UpperLayeredPaneLayout);
        UpperLayeredPaneLayout.setHorizontalGroup(
            UpperLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chat_panel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        UpperLayeredPaneLayout.setVerticalGroup(
            UpperLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chat_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        left_button.setText("Left");
        left_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left_buttonActionPerformed(evt);
            }
        });

        right_button.setText("Right");
        right_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                right_buttonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        menu_bar.add(jMenu1);

        jMenu2.setText("Edit");
        menu_bar.add(jMenu2);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle_button, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(left_button, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(right_button, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LowerLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(send_button, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspace_button, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpperLayeredPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpperLayeredPane)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(toggle_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(left_button, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(right_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LowerLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(send_button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backspace_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        this.setExtendedState( this.getExtendedState()|JFrame.MAXIMIZED_BOTH );
        pack();
    }// </editor-fold>                        

    private void toggle_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(son_mode){
        	son_mode = false;
            toggle_button.setText("Text");
            choose_pic_panel.setVisible(false);
            messege_panel.setVisible(false);
            text_field.setVisible(true);
            textArea.setVisible(true);
            left_button.setVisible(false);
            right_button.setVisible(false);
        }
        else{
        	son_mode = true;
            toggle_button.setText("Image");
            choose_pic_panel.setVisible(true);
            messege_panel.setVisible(true);
            text_field.setVisible(false);
            textArea.setVisible(false);
            left_button.setVisible(true);
            right_button.setVisible(true);
            
        }
    }                                             

    private void backspace_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    	if(!image_sentence.isEmpty()){
            image_sentence.remove(image_sentence.size()-1);
            clean_panel(messege_panel);
            int i = 1;
            for (File f : image_sentence){
            	print_image(f,messege_panel, 150*(i-1) +5*i , 1);
            	i++;
            }
        	}
    }                                                

    private void text_fieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          


    private void left_buttonActionPerformed(java.awt.event.ActionEvent evt) {
    	if (image_index>=6) image_index = (image_index - 6) % dictio.size();
    	else image_index = dictio.size() - (6 - image_index);
        jButton1.setIcon(new ImageIcon(dictio.get(image_index).image.getPath()));
        jButton2.setIcon(new ImageIcon(dictio.get((image_index+1)%dictio.size()).image.getPath()));
        jButton3.setIcon(new ImageIcon(dictio.get((image_index+2)%dictio.size()).image.getPath()));
        jButton4.setIcon(new ImageIcon(dictio.get((image_index+3)%dictio.size()).image.getPath()));
        jButton5.setIcon(new ImageIcon(dictio.get((image_index+4)%dictio.size()).image.getPath()));
        jButton6.setIcon(new ImageIcon(dictio.get((image_index+5)%dictio.size()).image.getPath()));
    }                                           

    private void right_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        image_index = (image_index + 6) % dictio.size();
        jButton1.setIcon(new ImageIcon(dictio.get(image_index).image.getPath()));
        jButton2.setIcon(new ImageIcon(dictio.get((image_index+1)%dictio.size()).image.getPath()));
        jButton3.setIcon(new ImageIcon(dictio.get((image_index+2)%dictio.size()).image.getPath()));
        jButton4.setIcon(new ImageIcon(dictio.get((image_index+3)%dictio.size()).image.getPath()));
        jButton5.setIcon(new ImageIcon(dictio.get((image_index+4)%dictio.size()).image.getPath()));
        jButton6.setIcon(new ImageIcon(dictio.get((image_index+5)%dictio.size()).image.getPath()));
        
    }                       
    
    private void addPic2Sentence(int i){
    	int index = image_index + i -1;
    	File img = dictio.get(index).image;
        image_sentence.add(img);
        int s = image_sentence.size();
        print_image(img,messege_panel, 150*(s-1) +5*s , 1);
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	addPic2Sentence(1);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	addPic2Sentence(3);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	addPic2Sentence(2);
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	addPic2Sentence(4);
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	addPic2Sentence(5);
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	addPic2Sentence(6);
    }  
    
    private void print_image(File file,JPanel panel, int x , int y) {
    	try{
    		BufferedImage myPicture = ImageIO.read(file);
    		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
    		panel.add(picLabel);
    		picLabel.setSize(150, 150);
    		picLabel.setLocation(x, y);
    		
    		/*JLabel picLabel2 = new JLabel(new ImageIcon(myPicture));
    		chat_panel.add(picLabel2);
    		
    		picLabel2.grabFocus();
    		picLabel2.setSize(150, 150);
    	    picLabel2.setVisible(true);*/
        }
    	catch (Exception e){
    		//
    	}
    	
    }
    
    static void clean_panel(JPanel panel){
    	panel.removeAll();
    	panel.revalidate();
    	panel.repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLayeredPane LowerLayeredPane;
    private javax.swing.JLayeredPane UpperLayeredPane;
    private javax.swing.JButton backspace_button;
    static javax.swing.JPanel chat_panel;
    private javax.swing.JPanel choose_pic_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JButton left_button;
    private javax.swing.JMenuBar menu_bar;
    static javax.swing.JPanel messege_panel;
    private javax.swing.JButton right_button;
    private javax.swing.JButton send_button;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField text_field;
    private javax.swing.JToggleButton toggle_button;
    static boolean son_mode = true;
    static int image_index = 0;
    static List<File> image_sentence = new ArrayList<File>();
    static String path = "C:\\Images";
	static List<Entry> dictio = Parser.get_dictionary(path);
    // End of variables declaration                   


}
