public class Dog extends Pet {

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }

    @Override
    public void giveVoice() {
        System.out.println("bark bark");
    }
}