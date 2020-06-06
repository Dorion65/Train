import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class DownloadMaster {
	
	public static void main(String[] args) {
		String YTUrl = "pPwzjKv0chc"; //please enter the part of the YT URL after the =    Example: pPwzjKv0chc
		//String YTUrlDownload ="https://i1.ytimg.com/vi/" + YTUrl + "/hqdefault.jpg"; // High Quality Full Size Thumbnail
		String YTUrlDownload = "https://i1.ytimg.com/vi/" + YTUrl + "/maxresdefault.jpg";	// maximum resolution Thumbnail
		//String YTUrlDownload = "https://i1.ytimg.com/vi/" + YTUrl + "/default.jpg";	// default Thumbnail
				
				try {
					YTThumbnailDownload(YTUrlDownload, "C:\\Users\\Dórion\\Pictures\\YT Thumbnails\\" + YTUrl + ".jpg");
				}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	private static void YTThumbnailDownload(String urlPiece, String filePath) throws IOException
	{
		URL url = new URL(urlPiece);
		BufferedInputStream bis = new BufferedInputStream(url.openStream());
		FileOutputStream fos = new FileOutputStream(filePath);
		byte [] buffer = new byte[1024];
		int count = 0;
		
		while ((count = bis.read(buffer, 0, 1024)) != -1)
		{
			fos.write(buffer, 0, count);
				
		}
	
	fos.close();
	bis.close();
	}
}
