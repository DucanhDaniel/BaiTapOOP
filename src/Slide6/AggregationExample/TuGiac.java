package Slide6.AggregationExample;

public class TuGiac {
    private Diem d1, d2, d3, d4;
    /*
    --------------            --------
    | Tu giac    | <>1------4-| Diem |
    --------------            --------
     */

    public TuGiac(Diem d1, Diem d2, Diem d3, Diem d4) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
    }
    public TuGiac() {
        this.d1 = new Diem();
        this.d2 = new Diem(0, 1);
        this.d3 = new Diem(1, 1);
        this.d4 = new Diem(1, 0);
    }
    public void printTuGiac() {
        d1.printDiem(); d2.printDiem(); d3.printDiem(); d4.printDiem();
        System.out.println();
    }

}
