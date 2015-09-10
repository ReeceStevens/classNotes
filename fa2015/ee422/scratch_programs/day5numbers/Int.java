package day5numbers;

public class Int implements Number {

    int value;

    public Int (value) {
        this.value = value;
    }

    public Number add (Number num) {
        return add((Int)num); 
    }

    public Number negate() {
        return new Int (-this.value); 
    } 

    public sub (Number num) {
        return add(num.negate());
    }

    // No public = visible only to the package
    Int add (Int num) {
        return new Int (this.value + num.value);
    }
}
