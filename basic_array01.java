public class basic_array01 {
    public static void main(String[] args) {
        System.out.println("Basic array");
        System.out.println("=====================");
        int mValue[] = new int[5];
        mValue[0] = 10;
        mValue[1] = 14;
        mValue[2] = 55;
        mValue[3] = 89;
        mValue[4] = 68;
        int anwers;

        System.out.println("Value: " + mValue[2]);
        anwers = mValue[3] - mValue[1];
        System.out.println("Anwers: " + anwers);
        System.out.println(mValue[4] + " - " + mValue[1] + " = " + (mValue[4] - mValue[1]));
        System.out.println("=====================");
    }
}
