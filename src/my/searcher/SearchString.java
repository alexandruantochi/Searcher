/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.searcher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

/**
 *
 * @author C312044
 */
public class SearchString extends SwingWorker<String, Integer> {

    private static boolean searchAll;
    private static boolean showTime;
    private static String toSearch;
    private static File file;
    private static JTextArea textArea;
    private static StringBuilder results;
    private static JButton searchButton;
    private static long startTime = 0;
    private static long numberOfLines;
    private static JProgressBar progressBar;

    SearchString(String toSearch, File file, JTextArea textArea, JButton searchButton, boolean searchAll, boolean showTime, JProgressBar progressBar, long numberOfLines) {
        SearchString.toSearch = toSearch;
        SearchString.file = file;
        SearchString.textArea = textArea;
        SearchString.searchButton = searchButton;
        SearchString.searchAll = searchAll;
        SearchString.showTime = showTime;
        SearchString.numberOfLines = numberOfLines;
        SearchString.progressBar = progressBar;
    }

    @Override
    protected String doInBackground() {
        results = new StringBuilder("");
        String tempResult;
        long lineNumber = -1;
        startTime = System.currentTimeMillis();
        System.out.println("Starting SEARCH on " + file.getAbsolutePath());
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if ((lineNumber) % 1000 == 0) {
                    int progress = (int) (((double)(lineNumber+1) / (double)(numberOfLines + 1)) * 100.0);
                    publish(progress);
                }
                if (line.contains(toSearch)) {
                    if (!searchAll) { //search first
                        System.out.println("Found " + toSearch + "..exiting");
                        tempResult = "Found " + toSearch + " at line number " + lineNumber + "\n\n" + line + "\n";
                        results.append(tempResult);
                        return results.toString();
                    } else { //searchAll
                        System.out.println("Appending result..");
                        String resultTemp = "Found " + toSearch + " at line number " + lineNumber + "\n\n" + line + "\n\n";
                        results.append(resultTemp);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Search Error!");
        }
        if (results.toString().isEmpty()) {
            results.append("Search string not found.");
        }

        return results.toString();
    }

    @Override
    protected void process(List<Integer> chunks) {
        if (!chunks.isEmpty()) {
            progressBar.setValue(chunks.get(chunks.size() - 1));
        }
    }

    @Override
    protected void done() {
        double elapsedTime = (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println("Performing DONE..");
        textArea.setText(results.toString());
        searchButton.setEnabled(true);
        if (showTime) {
            textArea.append("\nFinished in " + elapsedTime + "seconds.");
        }
        progressBar.setValue(100);
    }
}
