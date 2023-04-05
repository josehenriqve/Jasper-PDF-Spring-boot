package br.jose.github.Jasper;

import net.sf.jasperreports.engine.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class JasperApplication {

	public static void main(String[] args) throws JRException {
		SpringApplication.run(JasperApplication.class, args);
		String var = "c:";
		Map<String,Object> parameters = new HashMap<>();
		parameters.put("firstName","Jose");
		parameters.put("lastName","Souza");
		JasperReport report = JasperCompileManager.compileReport("C:\\Users\\jqueiroz\\Documents\\Jasper-projects\\Jasper\\Jasper\\src\\main\\resources\\templates\\template.jrxml");
		JasperPrint print = JasperFillManager.fillReport(report,parameters, new JREmptyDataSource());
		JasperExportManager.exportReportToPdfFile(print,"C:\\Users\\jqueiroz\\Documents\\Jasper-projects\\Jasper\\Jasper\\src\\main\\resources\\static\\nutritionRepor2.pdf");
	}

}
