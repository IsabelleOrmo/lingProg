public class Funcoes {
    private int aa;
    private static String bb;

    public String getBb() {
		return bb;
	}

    public void setBb(String bb) {
		Funcoes.bb = bb;
	}

    public int getAa() {
        return this.aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public static float doubleIt(int num) {
        return num * 2;
    }

    public static float invertIt(int num) {
        return 1 / num;
    }

    public static float squareIt(int num) {
        return (float) Math.sqrt(num);
    }

    public static float pow2(float num) {
        return num * num;
    }

    public static float sum(int num1, int num2) {
        return num1 + num2;
    }

    public static float minus(int num1, int num2) {
        return num1 - num2;
    }

    public static float divide(int num1, int num2) {
        return num1 / num2;
    }
}
