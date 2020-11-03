package day8;
import java.util.*;
public class ResourceBundleExample {

	public static void main(String[] args) throws  MissingResourceException{
		String resourceName="day8.RBExample";//RBExample should be the base name of properties file..this is user defined
		ResourceBundle rb;//resourcebundle is of util package
		//Default locale
		rb=ResourceBundle.getBundle(resourceName);
		System.out.println("Default :" +rb.getString("Hello.text"));
		
		//Request a resurce bundle with explicitly specified locale
		rb=ResourceBundle.getBundle(resourceName,Locale.GERMANY);
		System.out.println("German :" +rb.getString("Hello.text"));
		
		
		//no property file for china then uses default
		rb=ResourceBundle.getBundle(resourceName,Locale.CHINA);
		System.out.println("China :" +rb.getString("Hello.text"));
		
		//An other way..
		Locale.setDefault(Locale.FRANCE);
		rb=ResourceBundle.getBundle(resourceName);
		System.out.println("French :" +rb.getString("Hello.text"));
	}

}
