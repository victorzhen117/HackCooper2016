/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFiles;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;

        
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import JavaFiles.Report;
import JavaFiles.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.util.List;
/**
 *
 * @author Garry
 */
public class JsonSave {
    public static void saveData(ArrayList<Report> report, ArrayList<User> user) throws IOException{
        JsonFactory jsonFactory = new JsonFactory();
        FileOutputStream file = new FileOutputStream(new File("data.json"));
        JsonGenerator jsonGenerator = jsonFactory.createJsonGenerator(file);
        jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
        jsonGenerator.setCodec(new ObjectMapper());
        
        jsonGenerator.writeObject(report);
        //jsonGenerator.writeStartArray();
        jsonGenerator.writeObject(user);
        //jsonGenerator.writeEndArray(); 
    }
    public static void loadData(File file)throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        ArrayList<Report> report = mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Report.class));
        ArrayList<User> user = mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(ArrayList.class, User.class));
        /*for(Report a : report){
            System.out.println(a.getTweet());
        }
        for(User b : user){
            System.out.println("@" + b.getUser());
        }*/
    }
    public void loadRequest() throws IOException{
        ArrayList<Report> report = new ArrayList<>();
        ArrayList<User> user = new ArrayList<>();
        TwitterAPI twitterAPI = new TwitterAPI();
        Report report1 = new Report();
        twitterAPI.getTweet(report1, "banana");
        report.add(report1);
        saveData(report, user);
        loadData(new File("data.json"));
    }
    
}
