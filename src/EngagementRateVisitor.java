public class EngagementRateVisitor implements CampaignVisitor {
    @Override
    public void visitImagePost(ImagePost post) {
        printRate(post.getTitle(), post.getReach(), post.getLikes(),
                post.getComments(), post.getShares());
    }

    @Override
    public void visitVideoPost(VideoPost post) {
        printRate(post.getTitle(), post.getReach(), post.getLikes(),
                post.getComments(), post.getShares());
    }

    private void printRate(String title, int reach, int likes, int comments, int shares) {
        double rate = reach == 0 ? 0 : (likes + comments + shares) * 100.0 / reach;
        System.out.printf("%s: engagement rate is %.2f%%%n", title, rate);
    }
}
