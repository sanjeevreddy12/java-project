/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texttospeech;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class TextToSpeech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ch;
        do{
        System.out.println("Enter text");
        String s = scan.nextLine();
        
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        // TODO code application logic here
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");
        //printall voices
        Voice []voicelist = VoiceManager.getInstance().getVoices();
        for(int i=0;i<voicelist.length;i++)
        {
            System.out.println("# Voice: "+voicelist[i].getName());
        }
        if(voice != null)
        {
            voice.allocate();
            System.out.println("Voice Rate: "+voice.getRate());
            System.out.println("Voice Pitch: "+voice.getPitch());
            System.out.println("Voice Volume: "+voice.getVolume());
            boolean status = voice.speak(s);
            System.out.println("Status: "+status);
            voice.deallocate();
            
            
        }
        else
        {
            System.out.println("Error in getting voices");
            
        }
        System.out.println("Do youwant to continue");
        ch=scan.nextInt();
        }while(ch!=0);
    }
    
}
 