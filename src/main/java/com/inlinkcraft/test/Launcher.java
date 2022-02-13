package com.inlinkcraft.test;
import com.inlinkcraft.core.WindowManager;
import org.lwjgl.Version;

public class Launcher {

    public static void main(String[] args) {
        System.out.println(Version.getVersion());
        WindowManager window = new WindowManager("INLINKCRAFT SPACE ENGINE", 0, 0, false);
        window.init();

        while (!window.windowShouldClose()){
            window.update();
        }

        window.cleanup();
    }

}
