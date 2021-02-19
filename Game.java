
package main;
import java.util.Comparator;
/**
 * Class game makes the game object and allows the program to manipulate the data 
 * of the object through this class
 * @author Johannes Coetsee
 */
public class Game implements Comparable<Game>{
    private String name = "";
    private int release = 0;
    private double price = 0.0;
    private int rating = 0;
    private String genre = "";
    private String developer = "";
    /**
     * Game  constructor that assigns all the local variables to the parameters 
     * initializes the object
     * @param _name
     * @param _release
     * @param _price
     * @param _rating
     * @param _genre
     * @param _developer 
     */
    public Game(String _name, int _release, double _price, int _rating, String _genre, String _developer){
        name= _name;
        release= _release;
        price = _price;
        rating = _rating;
        genre = _genre;
        developer = _developer;
    }
    /**
     * method that gets the name of the game
     * @return String name
     */
    public String getName(){
        return name;
    }
    /**
     * method that return the release date of the game
     * @return integer release date
     */
    public int getRelease(){
        return release;
    }
    /**
     * method that return the price of the game
     * @return double game price 
     */
    public double getPrice(){
        return price;
    }
    /**
     * method that return the rating of the game
     * @return integer rating
     */
    public int getRating(){
        return rating;
    }
    /**
     * method that returns the genre of the game
     * @return String genre
     */
    public String getGenre(){
        return genre;
    }
    /**
     * method that return the developer of the game
     * @return string developer
     */
    public String getDeveloper(){
        return developer;
    }
    /**
     * method that sets the name of the game to something new
     * @param _name 
     */
    public void setName(String _name){
        name = _name;
    }
    /**
     * Method that updates the release value of the game
     * @param _release 
     */
    public void setRelease(int _release){
        release= _release;
    }
    /**
     * Method that updates the price of the game
     * @param _price 
     */
    public void setPrice(double _price){
        price = _price;
    }
    /**
     * method that updates the rating value of the game
     * @param _rating 
     */
    public void setRating(int _rating){
        rating = _rating;
    }
    /**
     * method that updates the genre value of the game
     * @param _genre 
     */
    public void setGenre(String _genre){
        genre = _genre;
    }
    /**
     * method that updates the developer value of the game
     * @param _developer 
     */
    public void setDeveloper(String _developer){
        developer = _developer;
    }
    /**
     * A method that checks if the name of the game starts with a certain character
     * or phrase
     * @param _name the character or phrase that the name of the game is tested with
     * @return if the name contains these values
     */
    public boolean testName(String _name){
        String testName = name.toLowerCase();
        boolean satisfied = true;
        for(int i = 0; i < _name.length();i++){
            if(_name.charAt(i)!=testName.charAt(i)){
                satisfied = false;
                break;
            }
        }
        return satisfied;
    }
    /**
     * compare to method used by the arrayList.sort method and this sorts it
     * according to the name of the game
     * @param g
     * @return 
     */
    @Override
    public int compareTo(Game g){
        String gName1 = g.getName();
        if(name.compareTo(gName1) > 0){
            return 1;
        }else if(name.compareTo(gName1) < 0){
            return -1;    
        }else{
            return 0;
        }
    }
    /**
     * new comparator used by arrayList.sort that sorts according to the release 
     * date of the game
     */
    public final static Comparator<Game> sortByRelease = new Comparator<Game>(){
        @Override
        public int compare(Game g1, Game g2) {
            int r1 = g1.getRelease();
            int r2 =g2.getRelease();
            if(r1 > r2){
                return 1;
            }else if(r2 > r1){
                return -1;
            }else{
                return 0;
            }
        }
    };
    /**
     * comparator used by arrayList.sort() that sorts according to the price
     * of the game
     */
    public final static Comparator<Game> sortByPrice = new Comparator<Game>(){
        @Override
        public int compare(Game g1, Game g2) {
            double p1 = g1.getPrice();
            double p2 =g2.getPrice();
            if(p1 > p2){
                return 1;
            }else if(p2 > p1){
                return -1;
            }else{
                return 0;
            }
        }
    };
    /**
     * comparator used by the ArrayList.sort() method that sorts according to
     * the rating of the game
     */
    public final static Comparator<Game> sortByRating = new Comparator<Game>(){
        @Override
        public int compare(Game g1, Game g2) {
            int ra1 = g1.getRating();
            int ra2 =g2.getRating();
            if(ra1 > ra2){
                return 1;
            }else if(ra2 > ra1){
                return -1;
            }else{
                return 0;
            }
        }
    };
    /**
     * comparator used by arrayList.sort() that sorts according to the genre of 
     * the game
     */
    public final static Comparator<Game> sortByGenre = new Comparator<Game>(){
        @Override
        public int compare(Game g1, Game g2){
            String gn1 = g1.getGenre();
            String gn2 = g2.getGenre();
            if(gn1.compareTo(gn2) > 0){
                return 1;
            }else if(gn1.compareTo(gn2) < 0){
                return -1;    
            }else{
                return 0;
            }
        }
    };
    /**
     * comparator used by arrayList.sort() that sorts according to the developer 
     * of the game
     */
    public final static Comparator<Game> sortByDeveloper = new Comparator<Game>(){
        @Override
        public int compare(Game g1, Game g2){
            String d1 = g1.getDeveloper();
            String d2 = g2.getDeveloper();
            if(d1.compareTo(d2) > 0){
                return 1;
            }else if(d1.compareTo(d2) < 0){
                return -1;    
            }else{
                return 0;
            }
        }
    };
    /**
     * A method that converts the object into a string
     * @return string version of object
     */
    @Override        
    public String toString(){
        String game = "";
        String nName = makeSpaces(name);
        if(nName.length()>=14){
            game = nName + "\t" + release + "\t" + price + "\t" + rating + "\t" + genre + "\t" + developer;
        }else{
            game = nName + "\t\t" + release + "\t" + price + "\t" + rating + "\t" + genre + "\t" + developer;
        }  
        return game;
    }
    /**
     * private method that takes the name of the game and puts in the neccesary
     * spaces so it looks presentable when printed
     * @param title
     * @return 
     */
    private String makeSpaces(String title){
        String newTitle = "";
        newTitle += title.charAt(0);
        int counter = 0;
        for(int i = 1; i < title.length(); i++){
            char letter = title.charAt(i);
            if(Character.isUpperCase(letter) || Character.isDigit(letter)){
                if(counter ==0){
                    counter ++;
                    newTitle += " ";
                    newTitle += letter;
                }else{
                    newTitle += letter;
                }
            }else{
                counter = 0;
                newTitle += letter;
            }
        }
        return newTitle;
    }
    /**
     * A method that returns the object in the string form that can be saved to a
     * text file (therefore no spaces in the name)
     * @return 
     */
    public String toStringTxt(){
        return name + " " + release + " " + price + " " + rating + " " + genre + " " + developer;
    }
    
}
