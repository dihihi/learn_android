package com.ddh.file.test;

import java.io.IOException;

import com.ddh.file.FileService;

import android.test.AndroidTestCase;
import android.util.Log;

public class TestFileService extends AndroidTestCase {
	public void testRead() throws IOException {
		FileService fileService = new FileService(getContext());
		String content = fileService.read("ddh.file");
		Log.v("ddh", content);
	}
}
