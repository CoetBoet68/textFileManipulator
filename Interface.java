package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.Desktop;  
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Interface class provides the user with a GUI to manipulate and view the data
 * @author Johannes Coetsee
 * 
 */
public class Interface extends javax.swing.JFrame {
    VideoGames vgList = new VideoGames();
    ArrayList<Game> filteredList = new ArrayList();
    /**
     * Constructor for the interface class
     */
    public Interface() {
        Locale lUS = new Locale("US");  
	Locale.setDefault(lUS);
        initComponents();
        printButton.setEnabled(false);
        saveButton.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        display01 = new javax.swing.JTextArea();
        printButton = new javax.swing.JButton();
        fileDisplayLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        filterListDisplay = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        sortByList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderMethodList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        filterDeveloper = new javax.swing.JComboBox<>();
        filterGenre = new javax.swing.JComboBox<>();
        filterName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        filterYearMin = new javax.swing.JSpinner();
        filterPriceMin = new javax.swing.JSpinner();
        filterRatingMin = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        filterYearMax = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        filterPriceMax = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        filterRatingMax = new javax.swing.JSpinner();
        generateButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOptionFile = new javax.swing.JMenu();
        importFileItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        helpItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display01.setEditable(false);
        display01.setColumns(20);
        display01.setRows(5);
        jScrollPane1.setViewportView(display01);
        display01.getAccessibleContext().setAccessibleName("");
        display01.getAccessibleContext().setAccessibleDescription("");

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        fileDisplayLabel.setText("Imported File: None");

        filterListDisplay.setEditable(false);
        filterListDisplay.setColumns(20);
        filterListDisplay.setRows(5);
        jScrollPane2.setViewportView(filterListDisplay);

        jLabel1.setText("Sort by:");

        sortByList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Name", "Year", "Price", "Rating", "Genre", "Developer" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        sortByList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        sortByList.setToolTipText("");
        sortByList.setSelectedIndex(0);
        jScrollPane4.setViewportView(sortByList);

        orderMethodList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ascending", "Descending" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        orderMethodList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        orderMethodList.setToolTipText("");
        orderMethodList.setSelectedIndex(0);
        jScrollPane3.setViewportView(orderMethodList);

        jLabel2.setText("Order Direction:");

        jLabel3.setText("Filter By Name:");

        jLabel4.setText("Filter by Developer:");

        jLabel5.setText("Filter By Genre:");

        filterName.setText("Starts with...");
        filterName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterNameMouseClicked(evt);
            }
        });
        filterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterNameActionPerformed(evt);
            }
        });

        jLabel6.setText("Filter By Year:");

        jLabel7.setText("Filter By Price:");

        jLabel8.setText("Filter by Rating:");

        filterYearMin.setModel(new javax.swing.SpinnerNumberModel(1990, 1990, 2021, 1));
        filterYearMin.setEditor(new javax.swing.JSpinner.NumberEditor(filterYearMin, "####"));
        filterYearMin.setValue(1990);

        filterPriceMin.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 1.0d));

        filterRatingMin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel9.setText("Min");

        jLabel10.setText("Min");

        jLabel11.setText("Min");

        jLabel12.setText("Max");

        filterYearMax.setModel(new javax.swing.SpinnerNumberModel(2021, 1990, 2021, 1));
        filterYearMax.setEditor(new javax.swing.JSpinner.NumberEditor(filterYearMax, "####"));

        jLabel13.setText("Max");

        filterPriceMax.setModel(new javax.swing.SpinnerNumberModel(100.0d, 0.0d, 100.0d, 1.0d));

        jLabel14.setText("Max");

        filterRatingMax.setModel(new javax.swing.SpinnerNumberModel(10, 1, 10, 1));

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save File");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        menuOptionFile.setText("File");

        importFileItem.setText("Import File");
        importFileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFileItemActionPerformed(evt);
            }
        });
        menuOptionFile.add(importFileItem);

        jMenuBar1.add(menuOptionFile);

        jMenu2.setText("Help");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(aboutMenuItem);

        helpItem.setText("Help");
        helpItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpItemActionPerformed(evt);
            }
        });
        jMenu2.add(helpItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fileDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterGenre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterDeveloper, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filterYearMin)
                            .addComponent(filterRatingMin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filterPriceMin, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filterYearMax)
                            .addComponent(filterPriceMax)
                            .addComponent(filterRatingMax)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveButton)
                            .addComponent(generateButton))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filterYearMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(filterName))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filterGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filterPriceMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(filterPriceMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(generateButton))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filterDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filterRatingMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(filterRatingMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(filterYearMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addGap(115, 115, 115))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Method for when import file menu option is selected, it imports the file and populates the video game array
     * @param evt 
     */
    private void importFileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFileItemActionPerformed
        JFileChooser jfc = new JFileChooser("C:\\Users\\Coets\\Documents\\NetBeansProjects\\listPractise");
        File importFile = null;
        int response = jfc.showOpenDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {
            display01.setText("");
            filterListDisplay.setText("");
            clearCombos();
            importFile = jfc.getSelectedFile();
            vgList.populateList(importFile);
            JOptionPane.showMessageDialog(null, "File is imported");
            System.out.println(importFile);
            fileDisplayLabel.setText("Imported File: " + importFile);
            printButton.setEnabled(true);
            populateCombos();
	}
    }//GEN-LAST:event_importFileItemActionPerformed
    /**
     * clearCombos is a method that clears all the comboBoxes that helps filter the list
     */
    private void clearCombos(){
        filterGenre.removeAllItems();
        filterDeveloper.removeAllItems();
        filterGenre.addItem("None");
        filterDeveloper.addItem("None");
        filterGenre.setSelectedIndex(0);
        filterDeveloper.setSelectedIndex(0);
    }
    /**
     * populateCombos takes the available options from the text file and populates the combo
     * boxes with those options
     */
    private void populateCombos(){
        ArrayList<String> devNames = new ArrayList(vgList.getDevelopers());
        ArrayList<String> genTypes = new ArrayList(vgList.getGenres());
        for(String d: devNames){
            filterDeveloper.addItem(d);
        }
        for(String g: genTypes){
            filterGenre.addItem(g);
        }
    }
    /**
     * a method for when the print button is pressed which prints the contents of
     * the list in the desired order
     * @param evt 
     */
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        display01.setText("");
        display01.append("Imported List:\n");
        display01.append("Name\t\tYear\tPrice\tRating\tGenre\tDeveloper\n");
        vgList.sort(sortByList.getSelectedIndex(), orderMethodList.getSelectedIndex());
        display01.append(vgList.toString());
    }//GEN-LAST:event_printButtonActionPerformed

    private void filterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterNameActionPerformed
        
    }//GEN-LAST:event_filterNameActionPerformed
    /**
     * method for the generateButton, it looks through the filtered criteria
     * and then prints the filtered list into the display area
     * @param evt 
     */
    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        String fName = "";
        if(filterName.getText().equals("Starts with...")){
            fName = "No filter";
        }else{
            fName= filterName.getText();
        }
        String fGenre = String.valueOf(filterGenre.getSelectedItem());
        String fDev = String.valueOf(filterDeveloper.getSelectedItem());
        int fYearMin = (Integer)filterYearMin.getValue();
        int fYearMax = (Integer)filterYearMax.getValue();
        fYearMin=fixMinValInt(fYearMin, fYearMax);
        double fPriceMin = (Double)filterPriceMin.getValue();
        double fPriceMax = (Double)filterPriceMax.getValue();
        fPriceMin = fixMinValDouble(fPriceMin, fPriceMax);
        int fRatingMin = (Integer)filterRatingMin.getValue();
        int fRatingMax = (Integer)filterRatingMax.getValue();
        fRatingMin = fixMinValInt(fRatingMin, fRatingMax);
        filteredList = new ArrayList(vgList.getFilteredList(fName, fGenre, fDev,fYearMin, fYearMax,fPriceMin, fPriceMax,fRatingMin, fRatingMax));
        filterListDisplay.setText("");
        filterListDisplay.append("Generated List:\n");
        filterListDisplay.append("Name\t\tYear\tPrice\tRating\tGenre\tDeveloper\n");
        filterListDisplay.append(VideoGames.listToString(filteredList));
        saveButton.setEnabled(true);
    }//GEN-LAST:event_generateButtonActionPerformed
    /**
     * fixMinValInt is a method that checks that the minVal doesn't exceed the maxVal
     * and if it does it adjusts it accordingly
     * @param minVal
     * @param maxVal
     * @return integer that is the new minimum value
     */
    private int fixMinValInt(int minVal, int maxVal){
        if(minVal > maxVal){
            minVal = maxVal;
        }
        return minVal;
    }
    /**
     * fixMinValDouble is a method that checks that the minVal doesn't exceed the maxVal
     * and if it does it adjusts it accordingly
     * @param minVal
     * @param maxVal
     * @return double that is the new minimum value
     */
    private double fixMinValDouble(double minVal, double maxVal){
        if(minVal > maxVal){
            minVal = maxVal;
        }
        return minVal;
    }
    /**
     * Method for when the user clicks on the filterName text box, it clears
     * this text box so user doesn't have to do it manually
     * @param evt 
     */
    private void filterNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterNameMouseClicked
        filterName.setText("");
    }//GEN-LAST:event_filterNameMouseClicked
    /**
     * Method for the save button, saves the filtered t=list in the desired file
     * @param evt 
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        JFileChooser sf = new JFileChooser("C:\\Users\\Coets\\Documents\\NetBeansProjects\\listPractise"); 
        int result = sf.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
                File save = sf.getSelectedFile();
                VideoGames.saveFile(filteredList, save);
                JOptionPane.showMessageDialog(null,"The list was saved to specified file.");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JOptionPane.showMessageDialog(this,"Laboratory 2\nBy Johannes Coetsee\nMade for Programming with Java course\nEmail johannes.coetsee@ktu.edu for any queries", "Enjoy...",
                                        JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void helpItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpItemActionPerformed
        File help = new File("C:\\Users\\Coets\\Documents\\NetBeansProjects\\listPractise\\target\\site\\apidocs\\main\\package-summary.html");
        Desktop top = Desktop.getDesktop();
        try {
            top.open(help);
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_helpItemActionPerformed

    /**
     * Main class that makes the GUI visible to the user
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JTextArea display01;
    private javax.swing.JLabel fileDisplayLabel;
    private javax.swing.JComboBox<String> filterDeveloper;
    private javax.swing.JComboBox<String> filterGenre;
    private javax.swing.JTextArea filterListDisplay;
    private javax.swing.JTextField filterName;
    private javax.swing.JSpinner filterPriceMax;
    private javax.swing.JSpinner filterPriceMin;
    private javax.swing.JSpinner filterRatingMax;
    private javax.swing.JSpinner filterRatingMin;
    private javax.swing.JSpinner filterYearMax;
    private javax.swing.JSpinner filterYearMin;
    private javax.swing.JButton generateButton;
    private javax.swing.JMenuItem helpItem;
    private javax.swing.JMenuItem importFileItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenu menuOptionFile;
    private javax.swing.JList<String> orderMethodList;
    private javax.swing.JButton printButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JList<String> sortByList;
    // End of variables declaration//GEN-END:variables

}