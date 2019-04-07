package proxy.staticproxy;

public class AgentTest {
    public static void main(String[] args) {
        IAgent agent = new BasketballAgent(new BasketballPlayer());
        agent.doAgreement();
    }
}
