package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public Properties p;
  public WebDriver driver;

	
	public void setup(String os,String br) throws IOException {
	    File file = new File("./src/test/resources/config.properties"); // single / is enough
	    FileInputStream fis = new FileInputStream(file); // ✅ convert file to input stream
	    p = new Properties();
	    p.load(fis); 
	   
	    switch (br) {
	    
	    case"chrome" :
	    	driver= new ChromeDriver ();
	    	
	    	break;
	    
	    case"edge":
	    	driver=new EdgeDriver();
	    	break;
	    
	    case"firefox":
	    	driver = new FirefoxDriver();
	    
	    
	    
	    
	    
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
