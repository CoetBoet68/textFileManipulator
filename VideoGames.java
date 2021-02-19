package main;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 * VideoGames class initializes the video games array and then manipulates it
 * according to instructions from the Interface class
 * @author Johannes Coetsee
 */
public class VideoGames {
    ArrayList<Game> games = new ArrayList<>();
    /**
     * populateList method reads the give file and then disects it to populate the arrayList
     * games
     * @param f the file received from the Interface class
     */
    public void populateList(File f){
        games.removeAll(games);
        
        Scanner scFile = null;
        try{
           scFile = new Scanner(f);
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "File was not found");
            scFile.close();
        }
        while(scFile.hasNext()){
            Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter(" ");
            try{
                while(scLine.hasNext()){
                    String gName = scLine.next();
                    int gYear = scLine.nextInt();
                    double gPrice = scLine.nextDouble();
                    int gRating = scLine.nextInt();
                    String gGenre = scLine.next();
                    String gDeveloper = scLine.next();
                    games.add(new Game(gName, gYear, gPrice, gRating, gGenre, gDeveloper));
                }
            }catch(InputMismatchException w){
                JOptionPane.showMessageDialog(null, "One Game was not valid, it wasn't added to the list");
            }catch(NoSuchElementException e){
                JOptionPane.showMessageDialog(null, "Game had missing data, therefore it was not added");    
            }
            scLine.close();
        }
    }
    /**
     * the sort method sorts the array according to 1. the field (e.g. name or release
     * and 2. ascending or descending order
     * @param field the field that is going to be ordered by
     * @param order the direction of sorting
     */
    public void sort(int field, int order){
        switch(field){
            case 0:
                if(order == 0){
                    games.sort(null);
                }else{
                    games.sort(null);
                    reverseList();
                }
            break;
            case 1:
                if(order == 0){
                    games.sort(Game.sortByRelease);
                }else{
                    games.sort(Game.sortByRelease);
                    reverseList();
                }
            break;
            case 2:
                if(order == 0){
                    games.sort(Game.sortByPrice);
                }else{
                    games.sort(Game.sortByPrice);
                    reverseList();
                }
            break;
            case 3:
                if(order == 0){
                    games.sort(Game.sortByRating);
                }else{
                    games.sort(Game.sortByRating);
                    reverseList();
                }
            break;
            case 4:
                if(order == 0){
                    games.sort(Game.sortByGenre);
                }else{
                    games.sort(Game.sortByGenre);
                    reverseList();
                }
            break;
            case 5:
                if(order == 0){
                    games.sort(Game.sortByDeveloper);
                }else{
                    games.sort(Game.sortByDeveloper);
                    reverseList();
                }
            break;
        }
    }
    /**
     * method reverseList reverses the ArrayList order where from element 0 to -1
     * to element -1 to 0
     */
    private void reverseList(){
        ArrayList<Game> temp = new ArrayList();
        for(int i = games.size()-1; i >= 0; i --){
            temp.add(games.get(i));
        }
        for(int i = 0; i < games.size(); i ++){
            games.set(i, temp.get(i));
        }
    }
    /**
     * method getDevelopers retrieves all the developers of the videogames to use 
     * in populating the comboboxes in the interface class
     * @return the ArrayList of developers (unique)
     */
    public ArrayList<String> getDevelopers(){
        ArrayList<String> devs = new ArrayList();
        String test = "";
        for(Game g:games){
            test = g.getDeveloper();
            if(isInList(test, devs) == false){
                devs.add(test);
            }   
        }
        return devs;
    }
    /**
     * method getGenres retrieves all the genres of the videogames to use in populating
     * the comoboboxes in the interface class
     * @return the ArrayList of genres (unique)
     */
    public ArrayList<String> getGenres(){
        ArrayList<String> gens = new ArrayList();
        String test = "";
        for(Game g:games){
            test = g.getGenre();
            if(isInList(test, gens) == false){
                gens.add(test);
            }   
        }
        return gens;
    }
    /**
     * A private method that checks if a certain element is in a given ArrayList
     * @param tester the element that is checked for
     * @param Alist the list that the element is checked for in
     * @return if the tester is in the Alist
     */
    private Boolean isInList(String tester, ArrayList<String> Alist){
        for(String s:Alist){
            if(s.equals(tester)){
                return true;
            }
        }
        return false;
    }
    /**
     * getFilteredList is a method that takes all the filter criteria and compiles a
     * list that adheres to all the criteria and then return that list to the interface class
     * @param name
     * @param genre
     * @param dev
     * @param yearMin
     * @param yearMax
     * @param priceMin
     * @param priceMax
     * @param ratingMin
     * @param ratingMax
     * @return the filtered list
     */
    public ArrayList<Game> getFilteredList(String name, String genre, String dev, int yearMin, int yearMax,double priceMin, double priceMax,int ratingMin, int ratingMax){
        ArrayList<Game> fillList = new ArrayList(getStringList(name));
        fillList = new ArrayList(getGenreList(genre, fillList));
        fillList = new ArrayList(getDevList(dev, fillList));
        fillList = new ArrayList(getYearList(yearMin, yearMax, fillList));
        fillList = new ArrayList(getPriceList(priceMin, priceMax, fillList));
        fillList = new ArrayList(getRatingList(ratingMin, ratingMax, fillList));
        return fillList;
    }
    /**
     * Method that generates a list adhering to all the name criteria
     * @param name
     * @return 
     */
    private ArrayList<Game> getStringList(String name){
        ArrayList<Game> sList = new ArrayList();
        if(name.equals("No filter")){ 
            sList = new ArrayList(games);
        }else{
            for(Game g:games){
                if(g.testName(name)){
                    sList.add(g);
                }
            }
        }
        return sList;
    }
    /**
     * A Method that returns a list that adheres to all the genre criteria
     * @param genre
     * @param fList
     * @return 
     */
    private ArrayList<Game> getGenreList(String genre, ArrayList<Game> fList){
        ArrayList<Game> gList = new ArrayList();
        if(genre.equals("None")){
            gList = new ArrayList(fList);
        }else{
            for(Game f:fList){
                if(f.getGenre().equals(genre)){
                    gList.add(f);
                }
            }
        }
        return gList;
    }
    /**
     * Generates a list that adheres to all the developer filter criteria
     * @param dev
     * @param fList
     * @return 
     */
    private ArrayList<Game> getDevList(String dev, ArrayList<Game> fList){
        ArrayList<Game> dList = new ArrayList();
        if(dev.equals("None")){
            dList = new ArrayList(fList);
        }else{
            for(Game f:fList){
                if(f.getDeveloper().equals(dev)){
                    dList.add(f);
                }
            }
        }
        return dList;
    }
    /**
     * method generates a list that adheres to all the release date filter criteria
     * @param minYear
     * @param maxYear
     * @param fList
     * @return 
     */
    private ArrayList<Game> getYearList(int minYear, int maxYear, ArrayList<Game> fList){
        ArrayList<Game> yList = new ArrayList();
        for(Game g:fList){
            if(g.getRelease() >= minYear && g.getRelease() <= maxYear){
                yList.add(g);
            }
        }
        return yList;
    }
    /**
     * method that generates a list that adheres to all the price filter criteria
     * @param minPrice
     * @param maxPrice
     * @param fList
     * @return 
     */
    private ArrayList<Game> getPriceList(double minPrice, double maxPrice, ArrayList<Game> fList){
        ArrayList<Game> pList = new ArrayList();
        for(Game g:fList){
            if(g.getPrice() >= minPrice && g.getPrice() <= maxPrice){
                pList.add(g);
            }
        }
        return pList;
    }
    /**
     * method that generates a list that adheres to all the rating filter criteria
     * @param minRate
     * @param maxRate
     * @param fList
     * @return 
     */
    private ArrayList<Game> getRatingList(int minRate, int maxRate, ArrayList<Game> fList){
        ArrayList<Game> rList = new ArrayList();
        for(Game g:fList){
            if(g.getRating() >= minRate && g.getRating() <= maxRate){
                rList.add(g);
            }
        }
        return rList;
    }
    /**
     * a toString method that takes all the game objects and compiles them in string
     * format
     * @return 
     */
    @Override
    public String toString(){
        String allGames = "";
        for(Game g:games){
            allGames+= g.toString() + "\n";
        }
        return allGames;
    }
    /**
     * a static Method that turns a list not local to the VideoGames class but still
     * consisting of Game objects into the string format
     * @param newList
     * @return 
     */
    public static String listToString(ArrayList<Game> newList){
        String allGames = "";
        for(Game g:newList){
            allGames+= g.toString() + "\n";
        }
        return allGames;
    }
    /**
     * Method saveFile saves a list into a specified text file
     * @param newList
     * @param newF 
     */
    public static void saveFile(ArrayList<Game> newList, File newF){
        try{
            PrintWriter textFile = new PrintWriter(new FileWriter(newF));
            for(Game g:newList){
                textFile.println(g.toStringTxt());
            }
            textFile.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "There was a problem while saving your file");
        }
    }
}
