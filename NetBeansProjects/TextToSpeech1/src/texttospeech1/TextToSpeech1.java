import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech1 {

    public  void Speak(String text) {

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
       
        
        Voice textaudio;
        textaudio = VoiceManager.getInstance().getVoice("kevin16");
        if (textaudio != null) {
            textaudio.allocate();
        }
        try {
            textaudio.setRate(150);
            textaudio.setPitch(150);
            textaudio.setVolume(12);
            textaudio.speak(text);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


































