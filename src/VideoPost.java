public class VideoPost implements CampaignContent {
    private final String title;
    private final int reach;
    private final int likes;
    private final int comments;
    private final int shares;
    private final int views;

    public VideoPost(String title, int reach, int likes, int comments, int shares, int views) {
        this.title = title;
        this.reach = reach;
        this.likes = likes;
        this.comments = comments;
        this.shares = shares;
        this.views = views;
    }

    public String getTitle() { return title; }
    public int getReach() { return reach; }
    public int getLikes() { return likes; }
    public int getComments() { return comments; }
    public int getShares() { return shares; }
    public int getViews() { return views; }

    @Override
    public void accept(CampaignVisitor visitor) {
        visitor.visitVideoPost(this);
    }
}
