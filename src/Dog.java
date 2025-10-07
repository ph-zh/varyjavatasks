public class Dog extends Pet {

    protected Dog() {
        super(4);
    }

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }

    @Override
    public void giveVoice() {
        System.out.println("bark bark");
    }
}