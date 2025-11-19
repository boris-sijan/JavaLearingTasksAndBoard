public class Rating {
    int upvotes;
    int downvotes;

    public Rating(int upvotes, int downvotes) {
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }

    public double getRating() {
        return (double) upvotes / (upvotes + downvotes) * 10;
    }

}
