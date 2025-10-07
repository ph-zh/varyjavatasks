public class Hamster extends Pet {

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }

    @Override
    public void giveVoice() {
        System.out.println("Don Hamsternello sends his regards");
    }
}
