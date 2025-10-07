public class Spider extends Pet {

    protected int pawsCount = 8;

    public int getPawsCount() {
        return pawsCount;
    }

    @Override
    public void giveVoice() {
        System.out.println("Spider man, Spider man ...");
    }
}
