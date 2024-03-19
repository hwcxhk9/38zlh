package KaiY;

class Linead {
    private double a;
    private double b;

    public Linead(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double solve() {
        return -b / a;
    }

    public static void main(String[] args) {
        Linead solver = new Linead(2, 4);
        System.out.println("Solution for 2x + 4 = 0 is x = $" + solver.solve());

        Linead solvers = new Linead(-3, 9);
        System.out.println("Solution for -3x + 9 = 0 is x = $" + solvers.solve());
    }
}

