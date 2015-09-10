package day5numbers;

public interface Number {
    Number add(Number num);
    Number negate();
    Number sub(Number num);
    // Number promote(); // Promote int to double, double to complex
}
