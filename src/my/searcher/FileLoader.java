/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.searcher;

import java.awt.Color;
import java.awt.Cursor;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import static my.searcher.Searcher.file;

/**
 *
 * @author C312044
 */
public class FileLoader extends SwingWorker<Void, Void> {

    //<T,V>
    private static JFileChooser fileChooser;
    private static JTextArea textArea;
    private static JTextField fileLocation;
    private static JProgressBar progressBar;
    private static String fileInfo;
    private static long fileLines;
    private static boolean fastMode = false;
    
    
    FileLoader (JTextField fileLocation, JProgressBar progressBar){
        this.fileLocation=fileLocation;
        this.progressBar = progressBar;
    }

    FileLoader(JFileChooser fileChooser, JTextArea textArea, JTextField fileLocation, JProgressBar progressBar, boolean fastMode) {
        this.fileChooser = fileChooser;
        this.fileLocation = fileLocation;
        this.progressBar = progressBar;
        this.textArea = textArea;
        this.fastMode = fastMode;
    }

    protected void getNumeberOfLines() {

        LineNumberReader lineNumber;
        try {
            lineNumber = new LineNumberReader(new FileReader(file));
            lineNumber.skip(Long.MAX_VALUE);
            fileLines = lineNumber.getLineNumber() + 1;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileLoader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileLoader.class.getName()).log(Level.SEVERE, null, ex);
        }

        double fileSize = file.length() / (1024 * 1024);
        DecimalFormat df = new DecimalFormat("0.0");
        String[] fileName = file.getAbsolutePath().split("\\\\");
        fileInfo = fileName[fileName.length - 1] + " selected, size: " + df.format(fileSize) + "mb";
    }

    @Override
    protected Void doInBackground() {
        file = fileChooser.getSelectedFile();
        
        if (!fastMode) {
            System.out.println("Loading file..");
            getNumeberOfLines();
        } else {
            System.out.println("Fast mode selected");
        }
        return null;
    }
    
    public void reload(){
        doInBackground();
    }
    
    

    @Override
    protected void done() {
        Searcher.returnFile(file, fileLines);
        if (!fastMode) {
            textArea.setText(fileInfo + "\n" + "Number of lines: " + fileLines);
        } else {
            textArea.setText(file.getAbsolutePath() + " selected. Fast Mode enabled");
        }
        fileLocation.setEnabled(true);
        fileLocation.setBackground(Color.white);
        fileLocation.setText(file.getAbsolutePath());
        progressBar.setIndeterminate(false);
    }

}
