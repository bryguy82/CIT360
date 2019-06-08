/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpUrl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Bryan
 */
public class HttpUrlExample {
    
    public HttpUrlExample() {
        // Empty constructor
    }
    // Model variables included here for simplicity.
    String urlSite = null;
    URL url = null;
    HttpURLConnection connect = null;
    BufferedReader reader = null;
    String outputMessage = "";
    String message = "";
    int code = 0;
        
    // String to hold the data
    String websiteData = null;
    
    public String httpUrl() throws MalformedURLException, IOException {
        
        urlSite = "https://byui-cit230.github.io/weather/data/towndata.json";
        url = new URL(urlSite);
        connect = (HttpURLConnection) url.openConnection();
        connect.setReadTimeout(5000);
        connect.setRequestMethod("GET");
        connect.connect();
        
        message = connect.getResponseMessage();
        code = connect.getResponseCode();
        outputMessage = "Everything is " + message.concat(" code#: ") + code;
        
        InputStream inputStream = connect.getInputStream();
        StringBuilder buffer = new StringBuilder();
        if (inputStream == null) {
            return null;
        }
        reader = new BufferedReader(new InputStreamReader(inputStream));
        
        String lineHolder;
        while ((lineHolder = reader.readLine()) != null) {
            // Read in file line by line while adding a return
            buffer.append(lineHolder).append("\n");
        }
        
        if (buffer.length() == 0) {
            // nothing in the buffer
            return null;
        }
        
        websiteData = outputMessage.concat("\n" + buffer.toString());
        
        return websiteData;
    }

    public BufferedReader getReader() {
        return reader;
    }

    public HttpURLConnection getConnect() {
        return connect;
    }
    
    public String getOutputMessage() {
        return outputMessage;
    }
}
