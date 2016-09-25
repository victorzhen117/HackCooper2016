/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFiles;


import java.io.File;
import java.io.IOException;
import JavaFiles.JsonSave;
import static JavaFiles.JsonSave.loadData;

/**
 *
 * @author Garry
 */
public class testLoad {
    public static void main(String[] args) throws IOException{
        loadData(new File("data.JSON"));
    }
}
