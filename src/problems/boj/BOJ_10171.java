package problems.boj;

public class BOJ_10171 {
    public void solve() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\\    /\\").append("\n");
        stringBuilder.append(" )  ( ')").append("\n");
        stringBuilder.append("(  /  )").append("\n");
        stringBuilder.append(" \\(__)|");

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        new BOJ_10171().solve();
    }
}
