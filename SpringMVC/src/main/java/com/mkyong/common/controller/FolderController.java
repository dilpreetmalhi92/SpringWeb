package com.mkyong.common.controller;

import java.awt.List;

import com.mkyong.common.inbound.Folder;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class FolderController {
	@RequestMapping(value="/getfolder",produces = MediaType.APPLICATION_JSON_VALUE)
	public Folder getfolder(ModelMap model){
		Folder folder=new Folder("abcd",1,98.56,"yhfiifikk");
		return folder;
	}

	@RequestMapping(value="/subFolder", method=RequestMethod.GET)
	public @ResponseBody
    int[] getsubFolder(){
		Folder folder=new Folder();
	  	return folder.getSubFolder();
	}
}
