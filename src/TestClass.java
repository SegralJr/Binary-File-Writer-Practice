import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class TestClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DataOutputStream outputFile = new DataOutputStream(new FileOutputStream("TestFile.dat"));
		String testString = JOptionPane.showInputDialog("Insert your text");
		outputFile.writeUTF(testString); // To write
		
		DataInputStream inputFile = new DataInputStream(new FileInputStream("TestFile.dat"));
		
		String testString2 = ("Your file said: " + inputFile.readUTF());
		System.out.println(testString2);


	}

}
