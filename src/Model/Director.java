package Model;

public class Director {
    public Smiley build(SmileyBuilder builder) {
        builder.buildHead();
        builder.buildEyes();
        builder.buildBrows();
        builder.buildMouth();
        return builder.getSmiley();
    }
}
