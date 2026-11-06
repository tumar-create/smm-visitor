import java.util.List;

public class Campaign {
    private final List<CampaignContent> posts;

    public Campaign(List<CampaignContent> posts) {
        this.posts = List.copyOf(posts);
    }

    public void analyze(CampaignVisitor visitor) {
        for (CampaignContent post : posts) {
            post.accept(visitor);
        }
    }
}
