package com.ndev.makereport;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Report report = new Report();
		report.setNameFile("Reporte1");
		report.setExtension("txt");
		report.setTitle(" : : REPORTE : : \n");
		String content = report.getTitle();
		
		for (int i = 0; i < 5; i++) {
			
			content+= "\n Reporte: " + i ;
			
		}
		report.setContent(content);
		report.makeReport();
	}

}
