import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import com.txt.TextToSpeech;


public class text2speech {

  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          text2speech window = new text2speech();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public text2speech() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 512, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel lblTextToSpeech = new JLabel("Text To Speech");
    lblTextToSpeech.setFont(new Font("Dialog", Font.BOLD, 20));
    lblTextToSpeech.setHorizontalAlignment(SwingConstants.CENTER);
    lblTextToSpeech.setBounds(147, 12, 216, 33);
    frame.getContentPane().add(lblTextToSpeech);
    
    JLabel lblEnterTheText = new JLabel("Enter The Text Please");
    lblEnterTheText.setBounds(12, 85, 165, 33);
    frame.getContentPane().add(lblEnterTheText);
    JEditorPane editorPane = new JEditorPane();
    editorPane.setBounds(190, 85, 296, 99);
    frame.getContentPane().add(editorPane);
    JButton btnSpeak = new JButton("Speak");
    btnSpeak.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        TextToSpeech t=new TextToSpeech();
        t.Speak(editorPane.getText());
      }
    });
    btnSpeak.setBounds(195, 211, 117, 25);
    frame.getContentPane().add(btnSpeak);
    
    
  }
}