class Mean {
    private int X;
    private int Y;

    public Mean(int K, int N) {
        X = K;
        Y = N;
    }

    public static int findMean(Mean M) {
        return (M.X + M.Y) / 2;
    }
}

 class Main {
    public static void main(String[] args) {
        Mean M1 = new Mean(6, 8);
        System.out.println("Mean of X and Y is:");
        int result = Mean.findMean(M1);
        System.out.println("=" + result);
    }
}

