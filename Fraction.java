public class Fraction {

    private int numerator;
    private int denominator;
    private int change;
    private boolean superior;
    private boolean equal;

    public Fraction() {

    }

    public Fraction(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;
    }

    private int GetPgcd() {
        int a = this.numerator;
        int b = this.denominator;
        int pgcd = 1;

        if (a != 0 && b != 0) {
            if (a < 0)
                a = -a;
            if (b < 0)
                b = -b;

            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }

            pgcd = a;
        }

        return pgcd;
    }

    public void show() {
        System.out.println(numerator + "/" + denominator);
    }

    public void Oppose() {
        numerator = numerator * (-1);
        System.out.println(numerator + "/" + denominator);

    }

    public void Inverse() {
        change = numerator;
        numerator = denominator;
        denominator = change;
        if (denominator < 0) {
            denominator = denominator * (-1);
            numerator = numerator * (-1);
        }
        System.out.println(numerator + "/" + denominator);

    }

    public void SuperieurA(Fraction f2) {
        if ((numerator / denominator) > (f2.numerator / f2.denominator)) {
            superior = true;
            System.out.println("La fraction " + numerator + "/" + denominator + " est supérieure à la fraction"
                    + f2.numerator + "/" + f2.denominator + ".");
        } else {
            superior = false;
            System.out.println("La fraction " + numerator + "/" + denominator + " n'est PAS supérieure à la fraction "
                    + f2.numerator + "/" + f2.denominator + ".");
        }

    }

    public void EgalA(Fraction f2) {
        if (numerator / denominator == (f2.numerator / f2.denominator)) {
            equal = true;
            System.out.println("La fraction " + numerator + "/" + denominator + "est égale à la fraction"
                    + f2.numerator / f2.denominator + ".");
        } else {
            superior = false;
            System.out.println("La fraction " + numerator + "/" + denominator + "est égale à la fraction"
                    + f2.numerator / f2.denominator + ".");
        }

    }

    public void Reduire() {

        if (denominator < 0) {
            denominator = denominator * (-1);
            numerator = numerator * (-1);
        }

        int a = this.numerator;
        int b = this.denominator;
        int pgcd = 1;

        if (a != 0 && b != 0) {
            if (a < 0)
                a = -a;
            if (b < 0)
                b = -b;
            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
            pgcd = a;
        }

        numerator = numerator / pgcd;
        denominator = denominator / pgcd;

        System.out.println("La fraction réduite est " + numerator + "/" + denominator);

    }

    public void Plus(Fraction f1, Fraction f2) {

        int addidenominator = f1.denominator * f2.denominator;
        int f1numerator = f1.numerator * f2.denominator;
        int f2numerator = f2.numerator * f1.denominator;
        int addinumerator = f1numerator + f2numerator;

        int a = addinumerator;
        int b = addidenominator;
        int pgcd = 1;

        if (a != 0 && b != 0) {
            if (a < 0)
                a = -a;
            if (b < 0)
                b = -b;
            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
            pgcd = a;
        }

        addinumerator = addinumerator / pgcd;
        addidenominator = addidenominator / pgcd;

        System.out.println("\n" + addinumerator + "/" + addidenominator);

    }

    public void Moins(Fraction f1, Fraction f2) {

        int sousdenominator = f1.denominator * f2.denominator;
        int f1numerator = f1.numerator * f2.denominator;
        int f2numerator = f2.numerator * f1.denominator;
        int sousnumerator = f1numerator - f2numerator;

        int a = sousnumerator;
        int b = sousdenominator;
        int pgcd = 1;

        if (a != 0 && b != 0) {
            if (a < 0)
                a = -a;
            if (b < 0)
                b = -b;
            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
            pgcd = a;
        }

        sousnumerator = sousnumerator / pgcd;
        sousdenominator = sousdenominator / pgcd;

        System.out.println("\n" + sousnumerator + "/" + sousdenominator);

    }

    public void Multiplie(Fraction f1, Fraction f2) {

        int multidenominator = f1.denominator * f2.denominator;
        int multinumerator = f1.numerator * f2.numerator;   

        int a = multinumerator;
        int b = multidenominator;
        int pgcd = 1;

        if (a != 0 && b != 0) {
            if (a < 0)
                a = -a;
            if (b < 0)
                b = -b;
            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
            pgcd = a;
        }

        multinumerator = multinumerator / pgcd;
        multidenominator = multidenominator / pgcd;

        System.out.println("\n" + multinumerator + "/" + multidenominator);

    }

    public void Divise(Fraction f1, Fraction f2) {

        int dividenominator = f1.denominator * f2.numerator;
        int divinumerator = f1.numerator * f2.denominator;   

        int a = divinumerator;
        int b = dividenominator;
        int pgcd = 1;

        if (a != 0 && b != 0) {
            if (a < 0)
                a = -a;
            if (b < 0)
                b = -b;
            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
            pgcd = a;
        }

        divinumerator = divinumerator / pgcd;
        dividenominator = dividenominator / pgcd;

        System.out.println("\n" + divinumerator + "/" + dividenominator);

    }

}
