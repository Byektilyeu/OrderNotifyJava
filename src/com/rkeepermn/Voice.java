package com.rkeepermn;

public class Voice {
    static final String userDirectory = System.getProperty("user.dir");
    public String voiceP() throws Exception {
        voiceRead voiceread = new voiceRead();
        String[] arr = voiceread.getGreaterThanZero();
        String voice = arr[0];
        System.out.println("DIR PATH: " + userDirectory + "\\voices\\" + "KFC-" + voice + ".wav");
//        playVoice music = new playVoice("C:\\Users\\Lenovo T470\\Desktop\\R-Keeper\\QMSVoice\\voices\\" + voice + ".wav");
        new playVoice(userDirectory + "\\voices\\" + "KFC-" + voice + ".wav");
        voiceRead qmsnumber = new voiceRead();
        qmsnumber.updateVoiceState();
        return voice;
    }
}
