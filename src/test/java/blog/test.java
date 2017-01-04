package blog;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws Exception {
        Properties properties = System.getProperties();
        String property = properties.getProperty("os.version");
        // System.out.println(properties);
        System.out.println("property:----------" + property);
        Process exec = Runtime.getRuntime().exec("tskill 360tray");
        System.out.println(exec);
        System.out.println("-------------------------------");
        BufferedReader br = null;
        Process process = null;
        //for (int i = 0; i <= 100000; i++) {
        //cmd.exe /k start  打开cmd 新窗口
            process = Runtime.getRuntime().exec("cmd.exe /k start");
        //}
        br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String user;
        while ((user = br.readLine()) != null) {
            System.out.println("user--------------" + user);
        }
        if (br != null) {
            br.close();
        }
    }
}
