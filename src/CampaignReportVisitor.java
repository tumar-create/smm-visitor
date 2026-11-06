public class CampaignReportVisitor implements CampaignVisitor {
    @Override
    public void visitImagePost(ImagePost post) {
        System.out.printf("Image post %s: reach %d, likes %d, comments %d, shares %d%n",
                post.getTitle(), post.getReach(), post.getLikes(),
                post.getComments(), post.getShares());
    }

    @Override
    public void visitVideoPost(VideoPost post) {
        System.out.printf("Video post %s: reach %d, likes %d, comments %d, shares %d, views %d%n",
                post.getTitle(), post.getReach(), post.getLikes(),
                post.getComments(), post.getShares(), post.getViews());
    }
}
