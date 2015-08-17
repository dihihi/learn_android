package com.ddh.file;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

import android.content.Context;

/**
 * 文件操作
 * @author ddh
 *
 */
public class FileService {
	private Context context;
	
	public FileService(Context context) {
		this.context = context;
	}
	
	/**
	 * 保存文件 
	 * @param filename
	 * @param content
	 * @throws IOException
	 */
	public void save(String filename, String content) throws IOException {
		FileOutputStream fos = context.openFileOutput(filename, Context.MODE_PRIVATE);
		fos.write(content.getBytes());
		fos.close();
	}
	
	public String read(String filename) throws IOException {
		FileInputStream fis = context.openFileInput(filename);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		byte[] buffer = new byte[1024];
		int len = 0;
		while ( (len = fis.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}
		return out.toString();
	}
	
}
