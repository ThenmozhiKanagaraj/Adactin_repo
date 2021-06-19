package com.configration.com;

import com.adactinsite.helper.Configration_Reader;

public class File_Reader_Manager {
	private File_Reader_Manager() {
		// TODO Auto-generated constructor stub
	}
	
public static File_Reader_Manager getinstance() {
File_Reader_Manager fm=new File_Reader_Manager();
return fm;
	}
	
	
public static Configration_Reader getinstace_CR() throws Throwable {
Configration_Reader cr=new Configration_Reader();
return cr;
	}

}
