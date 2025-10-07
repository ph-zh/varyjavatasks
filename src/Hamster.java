public class Hamster extends Pet {

    protected Hamster() {
        super(4);
    }

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }

    @Override
    public void giveVoice() {
        System.out.println("Don Hamsternello sends his regards");
    }
}
