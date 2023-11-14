package Lab4;
import java.io.*;
import java.util.ArrayList; //these got automatically added when I was creating this program from Eclipse. I kept them in here. 
import java.util.Arrays;
import java.util.List;


public class FileOperations {
	public static void main(String[] args) {
		String filePath = "C:/JavaFiles/mod04_dataset.csv"; //filepath from assignment for crime data. 
		
		
		try (BufferedReader bReader = new BufferedReader(new FileReader(filePath))){ //suggestion from live class 
			List<List<String>> fileValues = new ArrayList<>();
			
    		//scan the file and create an array. 
			String readerLine;
    		while ((readerLine = bReader.readLine()) != null) {
    			String[] lineValues = readerLine.split(",");
    			fileValues.add(Arrays.asList(lineValues));
    		}

    		
    		//Find the total from Report Year Total and set the values to reportYearTotal
    		int reportYearTotal = 0; //variable set
			int lastColumnIndex = fileValues.get(0).size()-1; 
    		for(int i=1; i< fileValues.size();i++) { //starts at 1 due to headers. 
    			reportYearTotal += Integer.parseInt(fileValues.get(i).get(lastColumnIndex));
    		}
    		
    		//Print out total
    		System.out.println("Total for all Report Year Totals: " + reportYearTotal);
    		

    		
    	try (BufferedWriter bWriter = new BufferedWriter(new FileWriter("C:/JavaFiles/CrimeTotals.txt"))){
    			

    			//inserting information into file. This includes the header and the totals. 
    			StringBuilder sb = new StringBuilder();
    			sb.append("Total all crimes commited in Seattle:");
    			sb.append(",");
    			sb.append("\n" + reportYearTotal);
    			sb.append(",");
    			sb.append(System.lineSeparator());
    			
    			//Add the headers to the file
    			bWriter.write(sb.toString());
 
    			}
        	} 
    			
    	
    	catch (Exception e){ //exception. Will not often display since values are stored in a file.
    		System.out.print(e.getMessage());
    		System.out.print("Code Error");
    	}
		finally {
			System.out.println("Program End"); //program ends. 
		}
    }
}