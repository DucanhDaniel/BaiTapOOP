package Slide9.GenericProgramming;

public class Pair<F extends Comparable<F>, S extends Comparable<S>> implements Comparable<Pair<F, S>> {
    private final F f;
    private final S s;

    public Pair(F f, S s) {
        this.f = f;
        this.s = s;
    }

    Pair<F, S> make_pair(F f, S s) {
        return new Pair<>(f, s);
    }

    //Get the first element of the pair
    public F first() {
        return f;
    }

    //Get the second element of the pair
    public S second() {
        return s;
    }

    @Override
    public int compareTo(Pair<F, S> other) {
        if (!this.f.equals(other.f)) {
            return this.f.compareTo(other.f);
        }

        return this.s.compareTo(other.s);
    }

    @Override
    public String toString() {
        return "(" + f + ", " + s + ")";
    }
}