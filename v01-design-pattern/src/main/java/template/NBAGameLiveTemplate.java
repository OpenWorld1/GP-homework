package template;

public abstract class NBAGameLiveTemplate {
    public void liveGame()
    {
        //发布比赛日程
        publishGameSchedule();

        //预售门票
        preSaleTicket();

        //进入球馆
        goBasketballGym();

        //赛前活动
        activityBeforeGame();

        //观看比赛
        watchGame();

        //离场
        leaveTheGym();



    }

    public abstract void activityBeforeGame();

    private void leaveTheGym() {
        System.out.println("比赛结束，离场");
    }

    private void watchGame() {
        System.out.println("观看主队比赛");
    }

    protected void goBasketballGym(){
        System.out.println("进入球馆");
    };

    protected void preSaleTicket(){
        System.out.println("预售门票");
    };

    protected void publishGameSchedule(){
        System.out.println("发布比赛时间表");
    };
}
