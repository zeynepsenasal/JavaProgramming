package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = "Chrome";
        String result = "";
        boolean validBrowser = browserName == "Chrome" || browserName == "Firefox" || browserName == "Opera"
                || browserName == "Safari" || browserName == "edge" || browserName == "Safari";


        if (validBrowser) {
            if (browserName == "Chrome") {
                result = "Chrome is Selected";
            } else if (browserName == "Firefox") {
                result = "Firefox is selected";
            }

        } else {
            result = "Invalid Browser";
        }
    }
}
