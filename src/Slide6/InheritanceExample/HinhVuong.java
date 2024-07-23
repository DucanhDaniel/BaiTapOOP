package Slide6.InheritanceExample;

import Slide6.AggregationExample.TuGiac;
import Slide6.AggregationExample.Diem;

public class HinhVuong extends TuGiac{
    public HinhVuong() {
        d1 = new Diem(0, 0);
        d2 = new Diem(0, 1);
        d3 = new Diem(1, 0);
        d4 = new Diem(1, 1);
    }
}
