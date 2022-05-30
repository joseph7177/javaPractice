package NaveenAutomationLabs_3;

import java.io.IOException;

public class OpeningApps__79 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Runtime run = Runtime.getRuntime();
		Process openNotepad = run.exec("notepad.exe C:\\Users\\AA\\Desktop\\Rahul Arora\\Interview Questions\\interview questions edited.txt");
			
		Thread.sleep(4000);
		openNotepad.destroy();
		
		String[] s = new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.google.com","amazon.in"};
		run.exec(s);

	}

}
