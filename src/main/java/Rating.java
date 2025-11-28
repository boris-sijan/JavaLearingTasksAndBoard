import java.lang.String;
/**
 * This class represents a rating for a restaurant, including the number of upvotes,
 * downvotes, and the name of the restaurant.
 */
public class Rating {

    private String restaurantName;
    private int upvotes;
    private int downvotes;

    // public Rating(String restaurantName, int upvotes, int downvotes) {
    public Rating(int upvotes, int downvotes) {
        // this.restaurantName = restaurantName;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }

    /*public String getRestaurantName() {
        return restaurantName;
    }
     */

    public int getUpvotes() {
        return upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void addUpvote() {
        upvotes++;
    }

    public void addDownvote() {
        downvotes++;
    }

    public int getScore() {
        return upvotes - downvotes;
    }

    public String getRating() {
        return /*restaurantName + " (↑" + */upvotes + " | ↓" + downvotes + ")";
    }
}
