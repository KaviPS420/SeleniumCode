package SeleniumBegins;

public class OpenCart {

	public static void main(String[] args) {
		
		ReadProp prop = new ReadProp();
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser("Chrome");
		brUtil.launchUrl("https://www.facebook.com");
		String title = brUtil.getPageTitle();
		System.out.println("Page title is " + title);
		
		//verify title
				if (title.equals("Facebook - log in or sign up")) {
					System.out.println("Title is corect" + " " + title);
					
				}else {
					System.out.println("Title is not correct" +" " + title);
				}
				
				
		brUtil.closeDriver();

	}

}
