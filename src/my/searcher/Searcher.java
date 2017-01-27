package my.searcher;

import java.awt.Color;
import static java.awt.Color.lightGray;
import java.awt.Cursor;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author C312044
 */
public class Searcher extends javax.swing.JFrame implements PropertyChangeListener {

    static File file;
    static long numberOfLines;

    static void returnFile(File file, long numberOfLines) {
        Searcher.file = file;
        Searcher.numberOfLines = numberOfLines;
    }

    public Searcher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        panel1 = new java.awt.Panel();
        helpFrame = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        helpContentsFrame = new javax.swing.JTextPane();
        aboutFrame = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        aboutContentsFrame = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        fileLocation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchString = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        progressBar = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        aboutMenu = new javax.swing.JMenu();
        searchAllCheckbox = new javax.swing.JCheckBoxMenuItem();
        showTimeElapsed = new javax.swing.JCheckBoxMenuItem();
        fastModeCheckbox = new javax.swing.JCheckBoxMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpContents = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();

        fileChooser.setApproveButtonToolTipText("");
        fileChooser.setCurrentDirectory(new java.io.File("C:\\"));
            fileChooser.setDialogTitle("Choose a file");

            javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );

            helpFrame.setTitle("Help Contents");

            helpContentsFrame.setEditable(false);
            jScrollPane1.setViewportView(helpContentsFrame);

            javax.swing.GroupLayout helpFrameLayout = new javax.swing.GroupLayout(helpFrame.getContentPane());
            helpFrame.getContentPane().setLayout(helpFrameLayout);
            helpFrameLayout.setHorizontalGroup(
                helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(helpFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addContainerGap())
            );
            helpFrameLayout.setVerticalGroup(
                helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(helpFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addContainerGap())
            );

            aboutFrame.setTitle("About");

            aboutContentsFrame.setEditable(false);
            jScrollPane3.setViewportView(aboutContentsFrame);

            javax.swing.GroupLayout aboutFrameLayout = new javax.swing.GroupLayout(aboutFrame.getContentPane());
            aboutFrame.getContentPane().setLayout(aboutFrameLayout);
            aboutFrameLayout.setHorizontalGroup(
                aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aboutFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            aboutFrameLayout.setVerticalGroup(
                aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aboutFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Searcher");
            setBackground(new java.awt.Color(115, 212, 215));
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            setMinimumSize(new java.awt.Dimension(558, 244));
            setType(java.awt.Window.Type.UTILITY);

            jLabel1.setText("File Location");

            fileLocation.setToolTipText("");

            jLabel2.setText("Search String");

            browseButton.setText("Browse..");
            browseButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    browseButtonActionPerformed(evt);
                }
            });

            searchButton.setText("Search");
            searchButton.setEnabled(false);
            searchButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    searchButtonActionPerformed(evt);
                }
            });

            scrollPane.setFocusable(false);

            textArea.setEditable(false);
            textArea.setColumns(20);
            textArea.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
            textArea.setRows(5);
            textArea.setText("Please select a file, enter your search string and press  the Search button.");
            textArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            textArea.setCaretPosition(0);
            scrollPane.setViewportView(textArea);

            jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            aboutMenu.setText("Options");

            searchAllCheckbox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
            searchAllCheckbox.setText("Search all (slower)");
            aboutMenu.add(searchAllCheckbox);

            showTimeElapsed.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
            showTimeElapsed.setSelected(true);
            showTimeElapsed.setText("Show Time Elapsed");
            aboutMenu.add(showTimeElapsed);

            fastModeCheckbox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
            fastModeCheckbox.setSelected(true);
            fastModeCheckbox.setText("Fast Mode");
            fastModeCheckbox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fastModeCheckboxActionPerformed(evt);
                }
            });
            aboutMenu.add(fastModeCheckbox);

            jMenuBar1.add(aboutMenu);

            helpMenu.setText("Help");

            helpContents.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
            helpContents.setText("Help Contents");
            helpContents.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    helpContentsActionPerformed(evt);
                }
            });
            helpMenu.add(helpContents);

            about.setText("About");
            about.setBorderPainted(true);
            about.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    aboutActionPerformed(evt);
                }
            });
            helpMenu.add(about);

            jMenuBar1.add(helpMenu);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchString)
                                .addComponent(fileLocation))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(browseButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fileLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(browseButton))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(searchButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        searchButton.setEnabled(false);
        fileLocation.setEnabled(false);
        fileLocation.setBackground(Color.lightGray);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        progressBar.setIndeterminate(true);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            textArea.setText("Please wait while the file is being loaded... \nIf the file is big it may take a while");
            System.out.println("Entering FileLoader");
            FileLoader loader = new FileLoader(fileChooser, textArea, fileLocation, progressBar, fastModeCheckbox.isSelected());
            loader.execute();
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            searchButton.setEnabled(true);
        } else {
            System.out.println("No file selected");
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            progressBar.setIndeterminate(false);
            fileLocation.setEnabled(true);
            fileLocation.setBackground(Color.white);
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        textArea.setText("");
        System.out.println("To search=" + searchString.getText());
        searchButton.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if (file.exists()) {
            System.out.println("Search all is: " + searchAllCheckbox.isSelected());
            SearchString doSearch = new SearchString(searchString.getText(), file, textArea, searchButton, searchAllCheckbox.isSelected(), showTimeElapsed.isSelected(), progressBar, numberOfLines);
            doSearch.execute();
        } else {
            textArea.setText("No file selected");
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

    }//GEN-LAST:event_searchButtonActionPerformed

    private void fastModeCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastModeCheckboxActionPerformed
        if (!fastModeCheckbox.isSelected()) {
            if (file != null) {
                progressBar.setIndeterminate(true);
                fileChooser.setSelectedFile(file);
                textArea.setText("Please wait while the file is being processed... \nIf the file is big it may take a while");
                FileLoader loader = new FileLoader(fileChooser, textArea, fileLocation, progressBar, fastModeCheckbox.isSelected());
                loader.execute();
            } else {
                //do nothing;
            }

        }
    }//GEN-LAST:event_fastModeCheckboxActionPerformed

    private void helpContentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpContentsActionPerformed
        helpFrame.setVisible(true);
        helpFrame.setSize(500, 500);
        helpContentsFrame.setText(Text.getHelpContents());

    }//GEN-LAST:event_helpContentsActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        aboutFrame.setVisible(true);
        aboutFrame.setSize(350, 150);
        aboutContentsFrame.setText(Text.getAbout());
    }//GEN-LAST:event_aboutActionPerformed

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        };
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Searcher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JTextPane aboutContentsFrame;
    private javax.swing.JFrame aboutFrame;
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JButton browseButton;
    private javax.swing.JCheckBoxMenuItem fastModeCheckbox;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JTextField fileLocation;
    private javax.swing.JMenuItem helpContents;
    private javax.swing.JTextPane helpContentsFrame;
    private javax.swing.JFrame helpFrame;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Panel panel1;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JCheckBoxMenuItem searchAllCheckbox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchString;
    private javax.swing.JCheckBoxMenuItem showTimeElapsed;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

}
