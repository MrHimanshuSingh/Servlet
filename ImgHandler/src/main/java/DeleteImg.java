import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteImg {

	public static void main(String[] args) {
		String applicationPath2 = "D:\\Workspace\\servlet\\ImgHandler";
		String imgPath = "\\src\\main\\webapp\\images";
		try {
			Path path = Paths.get(applicationPath2+imgPath+File.separator+"1902585898.jpg");
			Files.delete(path);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
