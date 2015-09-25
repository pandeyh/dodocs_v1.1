package com.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@ComponentScan
public class FileProcess {
	
	/* @RequestMapping(value="/upload", method=RequestMethod.GET)
	   public @ResponseBody String provideUploadInfo() {
	        return "You can upload a file by posting to this same URL.";
	    }*/
	
	@RequestMapping(value = "/uploadFile" , method= RequestMethod.POST)
	public @ResponseBody String handleFileUpload(MultipartHttpServletRequest req, HttpServletResponse res)
	{
		MultipartFile file = req.getFile("userFile");
		String fileNm = file.getName();
		if(!file.isEmpty())
		{
			try{
				
				// Creating the directory to store file
                String rootPath = System.getProperty("catalina.home");
                File dir = new File(rootPath + File.separator + "tmpFiles");
                if (!dir.exists())
                    dir.mkdirs();
				String fileName=file.getOriginalFilename();
				
	            System.out.println("File Name:" +fileName);
	           // String path=request.getServletContext().getRealPath("/");
				//file.transferTo(p);
				File directory=    new File(dir+ "/"+fileName);
				file.transferTo(directory);
				//byte[] bytes = file.getBytes();
				//BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(fileNm));
			
				//stream.write(bytes);
				//stream.close();
				return "You successfully uploaded " + fileNm + "!";
			}catch(Exception e)
			{
				return "You failed to upload " + fileNm + " => " + e.getMessage();
			}
		
		}
		else
		{
            return "You failed to upload " + fileNm + " because the file was empty.";

		}
		
	}
	
	/*@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public @ResponseBody String uploadFile(MultipartHttpServletRequest req, HttpServletResponse res)
	{
		MultipartFile file = req.getFile("uploadFile");
		return "You successfully uploaded " + file.getName() + "!";
		
	}
	*/

}
