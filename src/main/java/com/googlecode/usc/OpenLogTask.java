package com.googlecode.usc;

<<<<<<< HEAD
=======
import java.io.File;
>>>>>>> 4716c4ec1356a0fc9f9360b8a6cc28aba72dc344
import java.io.IOException;

/**
 *
 * @author ShunLi
 */
class OpenLogTask extends java.util.TimerTask {
<<<<<<< HEAD
    @Override
    public void run() {
        try {
            Runtime.getRuntime().exec("notepad.exe " + System.getProperty("user.dir") + "\\log\\copier.log");
=======
    private final static String NOTEPAD_PLUS_PLUS_PATH = "C:/Program Files/Notepad++/notepad++.exe";
    private final static String NOTEPAD_PATH = "notepad.exe";

    @Override
    public void run() {
        try {
            String execName = null;

            File file = new File(NOTEPAD_PLUS_PLUS_PATH);
            if (file.exists()) {
                execName = NOTEPAD_PLUS_PLUS_PATH;
            } else {
                execName = NOTEPAD_PATH;
            }

            Runtime.getRuntime().exec(execName + " " + System.getProperty("user.dir") + "\\log\\copier.log");
>>>>>>> 4716c4ec1356a0fc9f9360b8a6cc28aba72dc344
        } catch (IOException e) {
        }
    }
}
