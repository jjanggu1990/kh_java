package pds.file;

import java.io.File;

public class FileRemoveHelper {
	public static boolean removeFile(String realpath){
		File file= new File(realpath);
		try{
			file.delete();
			return true;
		}catch(Exception e){
			return false;
		}
	}
}
