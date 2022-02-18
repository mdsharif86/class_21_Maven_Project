package class_21_Maven_Project;

public class Class21 {

	public static void main(String[] args) {
		System.setProperty("cellphone", "88998889");
		System.out.println(System.getProperty("phone"));
		System.setProperty("webdriver.chrome.driver", "");
		String projectPath = System.getProperty("user-dir");
			System.out.println("my project dir is " + projectPath);

	}

}
