/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class WorldModelQuestionGenerator {

    public static WordModel[] createQuestion() {
        WordModel soal1 = new WordModel("Pondok Indah", "Daerah Jakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan Utama Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani", "Patung Deket Monas");
        WordModel soal4 = new WordModel("Tugu Tani", "Mall di Selatan Jakarta");
        WordModel soal5 = new WordModel("Gandaria City", "Mall anaka Muda");
        WordModel[]bankSoal = {soal1, soal2, soal3, soal4, soal5};
        return bankSoal;
    }
    
    public static List<WordModel> createQuestionInCollection(){
        WordModel soal1 = new WordModel("Pondok Indah", "Daerah Jakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan Utama Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani", "Patung Deket Monas");
        WordModel soal4 = new WordModel("Tugu Tani", "Mall di Selatan Jakarta");
        WordModel soal5 = new WordModel("Gandaria City", "Mall anaka Muda");
        List <WordModel> bankSoal1 = new ArrayList<>();
        bankSoal1.add(soal1);
        bankSoal1.add(soal2);
        bankSoal1.add(soal3);
        bankSoal1.add(soal4);
        bankSoal1.add(soal5);
        return bankSoal1;
    }
    
    public static List<WordModel> createQuestionFromFile(String fileName) throws FileNotFoundException, IOException{
        List <WordModel> bankSoal = new ArrayList<>();
        File file= new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = null;
        while ((line = reader.readLine()) != null) {//Perhatikan kurungnya, didalam kurung adalah funngsinya
            System.out.println(line);
            //Split Line, Assign Ke array
            String[] array = line.split(",");
            //Buat Object QuestionModel, array idx 0 kata dasar, idx 1 untuk Petunjuk
            WordModel  qmodel = new WordModel(array[0], array[1].trim());
            //Add question Model
            bankSoal.add(qmodel);
        }
  
        return bankSoal;
    }
}
