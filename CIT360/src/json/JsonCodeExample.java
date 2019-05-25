/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Bryan
 */
public class JsonCodeExample {
    
    public void jsonFunction() throws IOException, ParseException, FileNotFoundException, NullPointerException {
        
        JSONObject studentObject = new JSONObject();
        studentObject.put("firstName", "Michael");
        studentObject.put("lastName", "Douglas");
        studentObject.put("favoriteColor", "black");
        
        JSONObject studentObject2 = new JSONObject();
        studentObject2.put("firstName", "John");
        studentObject2.put("lastName", "Smith");
        studentObject2.put("favoriteColor", "red");

        JSONObject studentObject3 = new JSONObject();
        studentObject3.put("firstName", "Sarah");
        studentObject3.put("lastName", "Johnson");
        studentObject3.put("favoriteColor", "purple");
        
        JSONArray students = new JSONArray();
        students.add(studentObject);
        students.add(studentObject2);
        students.add(studentObject3);
        
        try (FileWriter saveFile = new FileWriter("students.json")) {
            
            saveFile.write(students.toJSONString());
            saveFile.flush();
            System.out.println("JSON info saved to file students.json!");
        } catch (IOException ioex) {
        }
        
        //----------------------------------------------//
 
        JSONParser jsonParser = new JSONParser();
        
        try (FileReader readFile1 = new FileReader("students.json")) {
            
            JSONArray jsonStudentsArray = (JSONArray) jsonParser.parse(readFile1);
            
            System.out.println(jsonStudentsArray.toJSONString());
            System.out.println("Read from students.json just created.");
            
            for (int i = 0; i < jsonStudentsArray.size(); i ++) {
                JSONObject student = (JSONObject) jsonStudentsArray.get(i);
                System.out.format("%s %s's favorite color is %s.\n"
                        , student.get("firstName"), student.get("lastName"), student.get("favoriteColor"));
            }
        }
        //----------------------------------------------//

        try (FileReader readFile2 = new FileReader("jsonFile.json")) {

            JSONObject jsonTestObject = (JSONObject) jsonParser.parse(readFile2);

            JSONArray jsonTest = (JSONArray) jsonTestObject.get("words");
            System.out.println(jsonTest);
            
            // Set up an object and array for each set of words.
            JSONObject wordObject1 = (JSONObject) jsonTest.get(0);
            JSONArray jsonArrayPerson = (JSONArray) wordObject1.get("personNouns");
            System.out.println("----- person nouns -----");
            for (int i = 0; i < jsonArrayPerson.size(); i ++) {
                JSONObject nounPerson = (JSONObject) jsonArrayPerson.get(i);
                System.out.println(nounPerson.get("person"));
            }

            JSONObject wordObject2 = (JSONObject) jsonTest.get(1);
            JSONArray jsonArrayObject = (JSONArray) wordObject2.get("objectNouns");
            System.out.println("----- object nouns -----");
            for (int i = 0; i < jsonArrayObject.size(); i ++) {
                JSONObject nounObject = (JSONObject) jsonArrayObject.get(i);
                System.out.println(nounObject.get("object"));
            }

            JSONObject wordObject3 = (JSONObject) jsonTest.get(2);
            JSONArray jsonArrayVerbs = (JSONArray) wordObject3.get("verbs");
            System.out.println("------- verbs -------");
            for (int i = 0; i < jsonArrayVerbs.size(); i ++) {
                JSONObject verb = (JSONObject) jsonArrayVerbs.get(i);
                System.out.println(verb.get("present"));
                
// TODO use JSON files to populate vocabulary lists.
//                ArrayList<String> verbArray = new ArrayList<>();
//                verbArray.add((String) verb.get("present"));
//                example... cit360.CIT360.getCurrentGame.setVerbList(verbArray);
            }

        }

    }

}
