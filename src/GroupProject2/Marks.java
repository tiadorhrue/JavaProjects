package GroupProject2;

public abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks{

    double subj1,subj2,subj3;

    public A(double subj1, double subj2, double subj3) {
        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3= subj3;
    }

    @Override
    double getPercentage() {
        double averagePercentage = (subj1+subj2+subj3)/3;
        return averagePercentage;
    }
}
class B extends Marks{
    double subj1,subj2,subj3,subj4;
    public B (double subj1, double subj2, double subj3,double subj4) {
        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3= subj3;
        this.subj4 = subj4;

    }
    @Override
    double getPercentage() {
        double averagePercentage = (subj1+subj2+subj3+subj4)/4;
        return averagePercentage;
    }
}
class MarksTester {
    public static void main(String[] args) {
        A obj1 = new A(90, 89, 65);
        B obj2 = new B(90, 79, 50, 100);

        System.out.println("The average = "+obj1.getPercentage());
        System.out.println("The average = "+obj2.getPercentage());
    }
}
