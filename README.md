# File Operations Readme

This README file provides an overview of the Java program in the `FileOperations` class, which is designed to read a CSV file containing crime data, calculate the total of a specific column, and write the result to a new text file.

## Program Overview

The `FileOperations` program performs the following tasks:

1. Reads a CSV file containing crime data.
2. Parses the CSV data and stores it in a data structure.
3. Calculates the total from the "Report Year Total" column.
4. Writes the total to a new text file named "CrimeTotals.txt."

## Usage

To use this program, follow these steps:

1. Ensure you have Java installed on your system.

2. Open the program file, which is named `FileOperations.java`, in your preferred Java development environment, such as Eclipse.

3. Modify the `filePath` variable with the path to your CSV file. The default value is `"C:/JavaFiles/mod04_dataset.csv"`.

4. Compile and run the program.

## Dependencies

This program uses the following Java libraries:

- `java.io.*`: Provides input and output functionality.
- `java.util.ArrayList`: Used to store the data read from the CSV file.
- `java.util.Arrays`: Used for array manipulation.
- `java.util.List`: Used to work with lists.

These dependencies were automatically added when the program was created in Eclipse and are necessary for its functionality.

## Program Flow

Here's a brief overview of how the program works:

1. It opens the CSV file specified by `filePath` using a `BufferedReader`.

2. It reads the CSV file line by line, splitting each line into an array of values and storing them in a list of lists called `fileValues`.

3. It calculates the total of the "Report Year Total" column and stores it in the `reportYearTotal` variable.

4. It writes the total to a new text file named "CrimeTotals.txt" using a `BufferedWriter`. The result is formatted with a header and the total value.

5. In case of any exceptions during file operations, the program catches and prints the error message.

6. The program ends with the "Program End" message printed to the console.

## Example Output

When you run this program, it will display the total for all "Report Year Total" values in the CSV file and write the result to the "CrimeTotals.txt" file.

```
Total for all Report Year Totals: 12345
Program End
```

## Error Handling

The program includes exception handling to catch and display error messages. If any issues occur during file operations, the program will print the error message and "Code Error."

## Conclusion

The `FileOperations` program is a simple Java utility for reading, processing, and writing data from a CSV file. It can be easily modified for different CSV formats or data processing tasks.
