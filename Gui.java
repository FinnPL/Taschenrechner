import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 14.07.2022
 * @author 
 */

public class Gui extends JFrame {
  // Anfang Attribute
  private JTextField jTextField1 = new JTextField();
  private JButton b1 = new JButton();
  private JButton b2 = new JButton();
  private JButton b3 = new JButton();
  private JButton b7 = new JButton();
  private JButton b8 = new JButton();
  private JButton b9 = new JButton();
  private JButton b4 = new JButton();
  private JButton b5 = new JButton();
  private JButton b6 = new JButton();
  private JButton b0 = new JButton();
  private JButton b = new JButton();
  private JButton b10 = new JButton();
  private JButton b11 = new JButton();
  private JButton b13 = new JButton();
  private JButton b12 = new JButton();
  private JButton b15 = new JButton();
  private JTextField jTextField2 = new JTextField();
  Steuerung st;
  private JButton bEntf = new JButton();
  // Ende Attribute
  
  public Gui() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 369; 
    int frameHeight = 605;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Gui");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jTextField1.setBounds(32, 16, 289, 73);
    jTextField1.setForeground(Color.WHITE);
    jTextField1.setBackground(new Color(0x202020));
    jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    cp.add(jTextField1);
    b1.setBounds(32, 392, 65, 65);
    b1.setText("1");
    b1.setMargin(new Insets(2, 2, 2, 2));
    b1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b1_ActionPerformed(evt);
      }
    });
    b1.setForeground(Color.WHITE);
    b1.setBackground(new Color(0x3B3B3B));
    b1.setBorderPainted(false);
    cp.add(b1);
    b2.setBounds(104, 392, 65, 65);
    b2.setText("2");
    b2.setMargin(new Insets(2, 2, 2, 2));
    b2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b2_ActionPerformed(evt);
      }
    });
    b2.setForeground(Color.WHITE);
    b2.setBackground(new Color(0x3B3B3B));
    b2.setBorderPainted(false);
    cp.add(b2);
    b3.setBounds(176, 392, 65, 65);
    b3.setText("3");
    b3.setMargin(new Insets(2, 2, 2, 2));
    b3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b3_ActionPerformed(evt);
      }
    });
    b3.setForeground(Color.WHITE);
    b3.setBackground(new Color(0x3B3B3B));
    b3.setBorderPainted(false);
    cp.add(b3);
    b7.setBounds(32, 232, 65, 65);
    b7.setText("7");
    b7.setMargin(new Insets(2, 2, 2, 2));
    b7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b7_ActionPerformed(evt);
      }
    });
    b7.setForeground(Color.WHITE);
    b7.setBackground(new Color(0x3B3B3B));
    b7.setBorderPainted(false);
    cp.add(b7);
    b8.setBounds(104, 232, 65, 65);
    b8.setText("8");
    b8.setMargin(new Insets(2, 2, 2, 2));
    b8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b8_ActionPerformed(evt);
      }
    });
    b8.setForeground(Color.WHITE);
    b8.setBackground(new Color(0x3B3B3B));
    b8.setBorderPainted(false);
    cp.add(b8);
    b9.setBounds(176, 232, 65, 65);
    b9.setText("9");
    b9.setMargin(new Insets(2, 2, 2, 2));
    b9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b9_ActionPerformed(evt);
      }
    });
    b9.setForeground(Color.WHITE);
    b9.setBackground(new Color(0x3B3B3B));
    b9.setBorderPainted(false);
    cp.add(b9);
    b4.setBounds(32, 312, 65, 65);
    b4.setText("4");
    b4.setMargin(new Insets(2, 2, 2, 2));
    b4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b4_ActionPerformed(evt);
      }
    });
    b4.setForeground(Color.WHITE);
    b4.setBackground(new Color(0x3B3B3B));
    b4.setBorderPainted(false);
    cp.add(b4);
    b5.setBounds(104, 312, 65, 65);
    b5.setText("5");
    b5.setMargin(new Insets(2, 2, 2, 2));
    b5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b5_ActionPerformed(evt);
      }
    });
    b5.setForeground(Color.WHITE);
    b5.setBackground(new Color(0x3B3B3B));
    b5.setBorderPainted(false);
    cp.add(b5);
    b6.setBounds(176, 312, 65, 65);
    b6.setText("6");
    b6.setMargin(new Insets(2, 2, 2, 2));
    b6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b6_ActionPerformed(evt);
      }
    });
    b6.setForeground(Color.WHITE);
    b6.setBackground(new Color(0x3B3B3B));
    b6.setBorderPainted(false);
    cp.add(b6);
    b0.setBounds(32, 472, 137, 65);
    b0.setText("0");
    b0.setMargin(new Insets(2, 2, 2, 2));
    b0.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b0_ActionPerformed(evt);
      }
    });
    b0.setForeground(Color.WHITE);
    b0.setBackground(new Color(0x3B3B3B));
    b0.setBorderPainted(false);
    cp.add(b0);
    b.setBounds(176, 472, 65, 65);
    b.setText(",");
    b.setMargin(new Insets(2, 2, 2, 2));
    b.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b_ActionPerformed(evt);
      }
    });
    b.setForeground(Color.WHITE);
    b.setBackground(new Color(0x3B3B3B));
    b.setBorderPainted(false);
    cp.add(b);
    b10.setBounds(256, 392, 65, 145);
    b10.setText("=");
    b10.setMargin(new Insets(2, 2, 2, 2));
    b10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b10_ActionPerformed(evt);
      }
    });
    b10.setForeground(Color.WHITE);
    b10.setBackground(new Color(0x323232));
    b10.setBorderPainted(false);
    cp.add(b10);
    b11.setBounds(256, 312, 65, 65);
    b11.setText("+");
    b11.setMargin(new Insets(2, 2, 2, 2));
    b11.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b11_ActionPerformed(evt);
      }
    });
    b11.setForeground(Color.WHITE);
    b11.setBackground(new Color(0x323232));
    b11.setBorderPainted(false);
    cp.add(b11);
    b13.setBounds(256, 232, 65, 65);
    b13.setText("-");
    b13.setMargin(new Insets(2, 2, 2, 2));
    b13.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b13_ActionPerformed(evt);
      }
    });
    b13.setForeground(Color.WHITE);
    b13.setBackground(new Color(0x323232));
    b13.setBorderPainted(false);
    cp.add(b13);
    b12.setBounds(176, 160, 65, 65);
    b12.setText("*");
    b12.setMargin(new Insets(2, 2, 2, 2));
    b12.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b12_ActionPerformed(evt);
      }
    });
    b12.setForeground(Color.WHITE);
    b12.setBackground(new Color(0x323232));
    b12.setBorderPainted(false);
    cp.add(b12);
    b15.setBounds(256, 160, 65, 65);
    b15.setText("/");
    b15.setMargin(new Insets(2, 2, 2, 2));
    b15.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b15_ActionPerformed(evt);
      }
    });
    b15.setForeground(Color.WHITE);
    b15.setBackground(new Color(0x323232));
    b15.setBorderPainted(false);
    cp.add(b15);
    jTextField2.setBounds(200, 96, 121, 49);
    jTextField2.setForeground(Color.WHITE);
    jTextField2.setBackground(new Color(0x202020));
    jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    cp.add(jTextField2);
    cp.setBackground(new Color(0x202020));
    bEntf.setBounds(32, 160, 137, 65);
    bEntf.setText("entf");
    bEntf.setMargin(new Insets(2, 2, 2, 2));
    bEntf.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bEntf_ActionPerformed(evt);
      }
    });
    bEntf.setBackground(new Color(0x323232));
    bEntf.setFont(new Font("Dialog", Font.BOLD, 12));
    bEntf.setForeground(Color.WHITE);
    cp.add(bEntf);
    // Ende Komponenten
    
    st = new Steuerung(this);
    
    setVisible(true);
  } // end of public Gui
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Gui();
  } // end of main
  
  public void setDisplay(String field1,String field2){
    jTextField1.setText(field1);
    jTextField2.setText(field2);
  }
  
  public void b1_ActionPerformed(ActionEvent evt) {
    st.button('1');
  } // end of b1_ActionPerformed

  public void b2_ActionPerformed(ActionEvent evt) {
    st.button('2');
    
  } // end of b2_ActionPerformed

  public void b3_ActionPerformed(ActionEvent evt) {
    st.button('3');
    
  } // end of b3_ActionPerformed

  public void b7_ActionPerformed(ActionEvent evt) {
    st.button('7');
    
  } // end of b7_ActionPerformed

  public void b8_ActionPerformed(ActionEvent evt) {
    st.button('8');
    
  } // end of b8_ActionPerformed

  public void b9_ActionPerformed(ActionEvent evt) {
    st.button('9');
    
  } // end of b9_ActionPerformed

  public void b4_ActionPerformed(ActionEvent evt) {
    st.button('4');
    
  } // end of b4_ActionPerformed

  public void b5_ActionPerformed(ActionEvent evt) {
    st.button('5');
    
  } // end of b5_ActionPerformed

  public void b6_ActionPerformed(ActionEvent evt) {
    st.button('6');
    
  } // end of b6_ActionPerformed

  public void b0_ActionPerformed(ActionEvent evt) {
    st.button('0');
    
  } // end of b0_ActionPerformed

  public void b_ActionPerformed(ActionEvent evt) {
    st.button('.');
    
  } // end of b_ActionPerformed

  public void b10_ActionPerformed(ActionEvent evt) {
    st.button('=');
    
  } // end of b10_ActionPerformed

  public void b11_ActionPerformed(ActionEvent evt) {
    st.button('+');
    
  } // end of b11_ActionPerformed

  public void b13_ActionPerformed(ActionEvent evt) {
    st.button('-');
    
  } // end of b13_ActionPerformed

  public void b12_ActionPerformed(ActionEvent evt) {
    st.button('*');
    
  } // end of b12_ActionPerformed

  public void b15_ActionPerformed(ActionEvent evt) {
    st.button('/');
    
  } // end of b15_ActionPerformed

  public void bEntf_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    st.button('r');
  } // end of bEntf_ActionPerformed

  // Ende Methoden
} // end of class Gui
