package ThirdWeek;

public class Combination {
    public static void main(String[] args) {
        int kombinasyon, nfaktoriyel = 0, rfaktoriyel = 0, nrfaktoriyel = 0;
        int n = 10, r = 2, total1 = 1, total2 = 1, total3 = 1;

        for (int i = 1; i <= n; i++) {
            total1 = total1 * i;
            nfaktoriyel = total1;

        }
        System.out.println(nfaktoriyel);

        for (int i = 1; i <= r; i++) {
            total2 = total2 * i;
            rfaktoriyel = total2;

        }
        System.out.println(rfaktoriyel);


        for (int i = 1; i <= (n - r); i++) {
            total3 = total3 * i;
            nrfaktoriyel = total3;

        }
        System.out.println(nrfaktoriyel);

        kombinasyon = nfaktoriyel / (rfaktoriyel * nrfaktoriyel);
        System.out.println(n + " eleman sayili kumenin " + r + " eleman sayili alt kumelerenin kombinasyonu = " + kombinasyon);
    }
}
