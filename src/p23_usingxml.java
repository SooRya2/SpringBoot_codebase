import java.io.File;

public class p23_usingxml {

	public static void main(String[] args) {
		
		File inputFile=new File("C:\\Users\\nithish.soorya\\Desktop\\Java programs\\SeleniumDemo\\obj.xml");
		SAXReader saxReader=new SAXReader();
		Document document=saxREader.read(inputFile);
		

	}

}
