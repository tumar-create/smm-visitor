# SMM Post Statistics

This Java program uses the Visitor pattern to calculate statistics for image and video posts in an SMM campaign.

## How to Run

```sh
javac -d out src/*.java
java -cp out Main
```

## How the Visitor Pattern Works

`ImagePost` and `VideoPost` are elements. Each one accepts a visitor and calls the matching method. `Campaign` stores the posts and runs a visitor on each post.

There are two visitors:

- `EngagementRateVisitor` calculates the engagement rate for each post.
- `CampaignReportVisitor` prints the statistics for each post.

Another operation can be added by creating a new visitor. The post classes do not need to change.

## Clean Code Principles

- Class and method names describe their purpose.
- Each visitor has one responsibility.
- Post data is private and accessed through getters.
- There are no `instanceof` checks. The `accept` method calls the matching visitor method.
- A new visitor can be added without changing the post classes.
