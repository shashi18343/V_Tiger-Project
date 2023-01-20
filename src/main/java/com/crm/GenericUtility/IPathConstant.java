package com.crm.GenericUtility;

public interface IPathConstant
{
	//String DBURL="jdbc:mysql://localhost:3306/sdet45";
	//String DBURL="http://rmgtestingserver:8888/";
	String DBURL="jdbc:mysql://rmgtestingserver:3333/projects";
	//String DBUSERNAME="root";
	String DBUSERNAME="root@%";
	
	String DBPASSWORD="root";
	String Filepath="./src/test/resources/CommonData1.properties";
	String ExcelPath="./src/test/resources/TestData.xlsx";
}
