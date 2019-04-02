package Attractions;

abstract public class Attraction {

    String name;
    int rating;

    public Attraction(String Name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

}
