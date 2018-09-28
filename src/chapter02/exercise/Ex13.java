package chapter02.exercise;

import java.io.FileReader;

import com.opencsv.*;
import com.opencsv.bean.*;
import com.opencsv.bean.CsvToBean;

public class Ex13 {

	public static void main(String[] args) throws Exception{
		String path = ".\\src\\chapter02\\exercise\\";
		CSVReader reader = new CSVReader(new FileReader(path + "yourfile.csv"), '\t');
		
		

	}

}
