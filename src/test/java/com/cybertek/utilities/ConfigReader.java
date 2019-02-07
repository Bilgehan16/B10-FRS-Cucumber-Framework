package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
     //we use the value from properties file

    private static Properties properties;

    static {
        String path= "configuration.properties";

       /* java cannot read files drirectly,we need to use FileInput Stream
        class to read files.
        FileInputStream takes the location/path of the files a constructor.
        */
        try {
            FileInputStream fileInputStream=new FileInputStream(path);

            //Properties is used to read specifically Properties file,files with key-values pairs
            properties=new Properties();

            //file contents are loaded to properties from the FileInputStream
            properties.load(fileInputStream);

            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String property){
        //browser=chrome->(property) or url= ... returning get String  using this method

        return properties.getProperty(property);

    }


    /**
     * Or other one
     *
     *     private static Properties properties;
     *
     * 	public static String getProperty(String key){
     * 		String path = "configuration.properties";
     *
     * 		try {
     * 			FileInputStream stream = new FileInputStream(path);
     * 			properties = new Properties();
     * 			properties.load(stream);
     * 			stream.close();
     *                } catch (FileNotFoundException e) {
     * 			e.printStackTrace();
     *        } catch (IOException e) {
     * 			e.printStackTrace();
     *        }
     * 		return properties.getProperty(key);* 	}
     */
}
