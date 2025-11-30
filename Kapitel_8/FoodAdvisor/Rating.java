package Kapitel_8.FoodAdvisor;

/**
 * This class represents a rating for a restaurant, including the number of upvotes, downvotes, and the name of the restaurant.
 */
public class Rating {
    private int upvotes;
    private int downvotes;
    private String restaurant;

    /**
     * Constructs a Rating object with the specified number of upvotes and downvotes.
     *
     * @param upvotes   the number of upvotes
     * @param downvotes the number of downvotes
     */
    public Rating(int upvotes, int downvotes, String restaurant) {
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.restaurant = restaurant;
    }
    public Rating(int upvotes, int downvotes) {
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }

    /**
     * Returns the name of the restaurant.
     *
     * @return the restaurant name
     */
    public String getRestaurant() {
        return restaurant;
    }

   /**
     * @param restaurant the restaurant to set
     */
    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * @return int return the upvotes
     */
    public int getUpvotes() {
        return upvotes;
    }

    /**
     * @param upvotes the upvotes to set
     */
    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    /**
     * @return int return the downvotes
     */
    public int getDownvotes() {
        return downvotes;
    }

    /**
     * @param downvotes the downvotes to set
     */
    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }
 
     /**
     * Returns the overall rating calculated as upvotes minus downvotes.
     *
     * @return the overall rating
     */
    public int getRating() {
        return upvotes - downvotes;
    }

    public void addUpvote() {
        this.upvotes++;
    }

    public void addDownvote() {
        this.downvotes++;
    }
    
    public String toString() {
        return "Rating{" +
                "restaurant='" + restaurant + '\'' +
                ", upvotes=" + upvotes +
                ", downvotes=" + downvotes +
                ", rating=" + getRating() +
                '}';
    }

}