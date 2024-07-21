import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class TextGui {

  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          TextGui window = new TextGui();
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
  public TextGui() {
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
        TextToSpeech1 t=new TextToSpeech1();
        t.Speak(editorPane.getText());
      }
    });
    btnSpeak.setBounds(195, 211, 117, 25);
    frame.getContentPane().add(btnSpeak);
    
    
  }
}