int mySqrt(int x) {
    int odd = 1, n = 0;
    while (x > 0) {
        x -= odd;
        odd += 2;
        n++;
    }
    if (x == 0) {
        return n;
    }
    return n - 1;
}