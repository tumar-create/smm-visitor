public class ImagePost implements CampaignContent {
    private final String title;
    private final int reach;
    private final int likes;
    private final int comments;
    private final int shares;

    public ImagePost(String title, int reach, int likes, int comments, int shares) {
        this.title = title;
        this.reach = reach;
        this.likes = likes;
        this.comments = comments;
        this.shares = shares;
    }

    public String getTitle() { return title; }
    public int getReach() { return reach; }
    public int getLikes() { return likes; }
    public int getComments() { return comments; }
    public int getShares() { return shares; }

    @Override
    public void accept(CampaignVisitor visitor) {
        visitor.visitImagePost(this);
    }
}
