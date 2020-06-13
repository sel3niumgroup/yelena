package com.gurubank;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	/*
	public static Properties config = new Properties();
	public File f;
	public FileInputStream FI;
	
	
	 * @BeforeTest public void setup() throws IOException { init(); } public void
	 * init() throws IOException { loadPropertiesFile();
	 * selectBrowser(config.getProperty("browser"));
	 * driver.navigate().to(config.getProperty("url")); }
	 * 
	 * public void loadPropertiesFile() throws IOException {
		f = new File(System.getProperty("user.dir")+"/src/main/java/config/config.properties");
		FI = new FileInputStream(f);
		config.load(FI);
	}
	 */
	
	@BeforeTest
	public void setUp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url =  dataFile("data.json","URLs",0,"url");
		driver.navigate().to(url);
	}
	
	@AfterTest
	public void endTest() {
		driver.close();
	}	
	
	
	
	
	public WebDriver selectBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return null;
	}
	
	public  String dataFile(String fileName, String arrayName,int index,String Key) {
		try {
			JSONParser jsonParser = new JSONParser();
			Object obj = jsonParser.parse(new FileReader("./testData/" + fileName));
			JSONObject jsonObj = (JSONObject) obj;
			JSONArray jsonArray = (JSONArray) jsonObj.get(arrayName);
			JSONObject Obj = (JSONObject) jsonArray.get(index);
			String str = (String) Obj.get(Key);
			return str;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
