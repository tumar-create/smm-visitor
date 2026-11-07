import java.util.List;

public class Main {
    public static void main(String[] args) {
        Campaign campaign = new Campaign(List.of(
                new ImagePost("Product teaser", 2400, 310, 28, 42),
                new VideoPost("Behind the scenes", 3100, 420, 61, 75, 4800),
                new ImagePost("Launch announcement", 5000, 690, 84, 130)
        ));

        System.out.println("Engagement rates:");
        campaign.analyze(new EngagementRateVisitor());

        System.out.println("\nCampaign report:");
        campaign.analyze(new CampaignReportVisitor());
    }
}
