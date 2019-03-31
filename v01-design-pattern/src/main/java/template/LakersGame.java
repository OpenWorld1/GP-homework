package template;

public class LakersGame extends NBAGameLiveTemplate {

    @Override
    protected void preSaleTicket() {
        System.out.println("湖人VS勇士，价格880$");
    }

    public void activityBeforeGame() {
        System.out.println("湖人主场赛前暖场活动");
    }
}
