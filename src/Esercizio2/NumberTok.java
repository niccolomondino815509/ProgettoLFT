package Esercizio2;

public class NumberTok extends Token {
    public int lexeme;
    public NumberTok(int tag, int s) { super(tag); lexeme=s; }
    // ... completare ...
    @Override
    public String toString() { return "< " + tag + ", " + lexeme + " >"; }


}
