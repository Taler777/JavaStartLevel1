package Java1Lesson6;

public class Animal {

    private int limitRun;
    private float limitJump;
    private int limitSwim;

    public Animal(int limitRun, float limitJump, int limitSwim) {
        this.limitRun = limitRun;
        this.limitJump = limitJump;
        this.limitSwim = limitSwim;
    }

    public void run(int distance) {
        if (this.limitRun >= distance) System.out.println("run: true");
        else System.out.println("run: false");
    }

    public void swim(int distance) {
        if (limitSwim >= distance) System.out.println("swim: true");
        else System.out.println("swim: false");
    }

    public void jump(float distance) {
        if (limitJump >= distance) System.out.println("jump: true");
        else System.out.println("jump: false");
    }
}
