import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Calculator {
    public Calculator(){
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(500, 500);
        jf.setVisible(true);
        jf.setLocation(300, 150);

        JLabel displayLabel = new JLabel("Hello");
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.LIGHT_GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayLabel);

 //BUTTONS
       
 //button = 7
         JButton sevenButton = new JButton("7");
         sevenButton.setBounds(30, 130, 80, 80);
         sevenButton.setFont (new Font("Arial", Font.PLAIN,25));
         jf.add(sevenButton);

 //button = 8:
         JButton eightButton = new JButton("8");
         eightButton.setBounds(130, 130, 80, 80);
         eightButton.setFont (new Font("Arial", Font.PLAIN,25));
         jf.add(eightButton);

 //button = 9:
         JButton nineButton = new JButton("9");
         nineButton.setBounds(230, 130, 80, 80);
         nineButton.setFont (new Font("Arial", Font.PLAIN,25));
         jf.add(nineButton);

 //button = 4
          JButton fourButton = new JButton("4");
          fourButton.setBounds(30, 230, 80, 80);
          fourButton.setFont (new Font("Arial", Font.PLAIN,25));
          jf.add(fourButton);
 
 //button = 5:
          JButton fiveButton = new JButton("5");
          fiveButton.setBounds(130, 230, 80, 80);
          fiveButton.setFont (new Font("Arial", Font.PLAIN,25));
          jf.add(fiveButton);
 
  //button = 6:
          JButton sixButton = new JButton("6");
          sixButton.setBounds(230, 230, 80, 80);
          sixButton.setFont (new Font("Arial", Font.PLAIN,25));
          jf.add(sixButton);

  //button = 1:
           JButton oneButton = new JButton("1");
           oneButton.setBounds(30, 330, 80, 80);
           oneButton.setFont (new Font("Arial", Font.PLAIN,25));
           jf.add(oneButton);
  
  //button = 2:
           JButton twoButton = new JButton("2");
           twoButton.setBounds(130, 330, 80, 80);
           twoButton.setFont (new Font("Arial", Font.PLAIN,25));
           jf.add(twoButton);
  
   //button = 3:
           JButton threeButton = new JButton("3");
           threeButton.setBounds(230, 330, 80, 80);
           threeButton.setFont (new Font("Arial", Font.PLAIN,25));
           jf.add(threeButton);
           
   //button = DOT:
           JButton dotButton = new JButton(".");
           dotButton.setBounds(30, 430, 80, 80);
           dotButton.setFont (new Font("Arial", Font.PLAIN,30));
           jf.add(dotButton);
  
  //button = 0:
           JButton zeroButton = new JButton("0");
           zeroButton.setBounds(130, 430, 80, 80);
           zeroButton.setFont (new Font("Arial", Font.PLAIN,30));
           jf.add(zeroButton);
  
   //button = =:
           JButton equalButton = new JButton("=");
           equalButton.setBounds(230, 430, 80, 80);
           equalButton.setFont (new Font("Arial", Font.PLAIN,40));
           jf.add(equalButton);
           equalButton.setBackground(Color.orange);
           equalButton.setOpaque(true);

   //button = /:
         JButton divButton = new JButton("/");
         divButton.setBounds(330, 130, 80, 80);
         divButton.setFont (new Font("Arial", Font.PLAIN,30));
         jf.add(divButton);

   //button = X:
         JButton mulButton = new JButton("X");
         mulButton.setBounds(330, 230, 80, 80);
         mulButton.setFont (new Font("Arial", Font.PLAIN,30));
         jf.add(mulButton);

   //button = -:
        JButton negButton = new JButton("-");
        negButton.setBounds(330, 330, 80, 80);
        negButton.setFont (new Font("Arial", Font.PLAIN,30));
        jf.add(negButton);
 

   //button = +:
        JButton plusButton = new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
        plusButton.setFont (new Font("Arial", Font.PLAIN,30));
        jf.add(plusButton);
 




        jf.add(displayLabel);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}