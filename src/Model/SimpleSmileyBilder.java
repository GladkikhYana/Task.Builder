package Model;

public class SimpleSmileyBilder implements SmileyBuilder{
    private Smiley smile;
    public SimpleSmileyBilder()
    {
        smile = new Smiley();
    }
    @Override
    public void buildEyes() {
    Eyes e = new Eyes();
    smile.setEyes(e);
    }
    @Override
    public void buildHead() {
        Head h=new Head();
        smile.setHead(h);
    }
    @Override
    public void buildBrows() {
    Brows br = new Brows();
    smile.setBrows(br);
    }
    @Override
    public void buildMouth() {
        smile.setMouth(new Mouth());
    }
    @Override
    public Smiley getSmiley() {
        return smile;
    }
}
