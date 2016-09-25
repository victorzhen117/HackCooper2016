/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;

        
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import report.Report;
import user.User;

/**
 *
 * @author Garry
 */
public class JsonSave {
    public static void saveData(ArrayList<Report> report, User user) throws IOException{
        JsonFactory jsonFactory = new JsonFactory();
        FileOutputStream file = new FileOutputStream(new File("data.json"));
        JsonGenerator jsonGenerator = jsonFactory.createJsonGenerator(file);
        jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
        jsonGenerator.setCodec(new ObjectMapper());
        //jsonGenerator.writeStartArray();
        jsonGenerator.writeObject(report);
        //jsonGenerator.writeEndArray();
        jsonGenerator.writeStartArray();
        jsonGenerator.writeObject(user);
        jsonGenerator.writeEndArray();
        
        
        
        
       
 
        
    }
    
}
