package proxy.staticproxy;

public class BasketballAgent implements IAgent {

    private BasketballPlayer player = null;
    public BasketballAgent(BasketballPlayer player) {
        this.player = player;
    }

    @Override
    public void doAgreement() {
        System.out.println("找球队商谈");
        player.doAgreement();
        System.out.println("为球队效力");

    }
}
