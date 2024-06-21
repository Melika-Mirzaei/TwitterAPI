//In the name of Allah
import twitter4j.*;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.Status;
import twitter4j.conf.ConfigurationBuilder;
import java.util.List;
import java.util.List;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.auth.AccessToken;
public class APITwitter1 {
    public static void main(String[] args) throws TwitterException{

        System.setProperty("java.net.useSystemProxies", "true");
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setDebugEnabled(true).setOAuthConsumerKey("f3bdqnsn5AeCDAdBM2dIShhs0").setOAuthConsumerSecret("plma4EPtKU1cmmanMchg5C02SEPKZ9LYJP8maOowpHFyro7u55").setOAuthAccessToken("1548594265751707649-nEe1QuwTfHVSKMtlWuAya26frKuLkw").setOAuthAccessTokenSecret("oaf6ujWcjjwXfWJgFqCriigYbnd4WqtLOekw0IGE5ntxV");
        TwitterFactory tf = new TwitterFactory(configurationBuilder.build());
        twitter4j.Twitter twitter = tf.getInstance();
        Paging paging = new Paging(1,100);
        List<Status> status = twitter.getUserTimeline("nonahal1355",paging);





        for (Status s:status){
            System.out.println(s.getUser().getName()+"    "+s.getText());
            System.out.println(s.getRetweetCount());
            System.out.println(s.getId());
            System.out.println(s.isRetweet());
        }

        Twitter twitter = new TwitterFactory().getInstance();
        try {
            List<Status> statuses;
            String user;
            if (args.length == 1) {
                user = args[0];
                statuses = twitter.getUserTimeline(user);
            } else {
                user = twitter.verifyCredentials().getScreenName();
                statuses = twitter.getUserTimeline();
            }
            System.out.println("Showing @" + user + "'s user timeline.");
            for (Status status : statuses) {
                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
            }
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get timeline: " + te.getMessage());
            System.exit(-1);
        }








    }
}
