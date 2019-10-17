package com.monkey.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.monkey.model.JsonData;

@Controller
@PropertySource("classpath:application.properties")
public class FileUpAndDownloadController {

	@Value("${upload.path}")
	private String path;
	
	@RequestMapping(path="/upload", method=RequestMethod.POST)
	@ResponseBody
	public JsonData upload(@RequestParam("myFile") MultipartFile file,
			@RequestParam("name") String name) {
		System.out.println("name = " + name);
		
		String fileName = file.getOriginalFilename();
		System.out.println("upload file name = " + fileName);
		
		String suffixName = fileName.substring(fileName.lastIndexOf("."));
		System.out.println("upload file suffix name = " + suffixName);
		
		fileName = UUID.randomUUID() + suffixName;
		File dest = new File(path + fileName);
		
		try {
			file.transferTo(dest);
			return new JsonData(fileName);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new JsonData(null, "上传失败");
	}
}
