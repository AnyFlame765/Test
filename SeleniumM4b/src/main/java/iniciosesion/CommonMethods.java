package iniciosesion;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CommonMethods {
    public static void takeSS(WebDriver webDriver, String testCaseName){
        File srcfile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        String screnPath = "src/test-output/ExecutionResults";
        try{
            org.openqa.selenium.io.FileHandler.createDir(new File(screnPath));
            FileHandler.copy(srcfile, new File(screnPath));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
