public class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    private final double MAX_JUMP_HEIGTH = 2;

    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    public void swim(int length) {
        System.out.println("swim: false");
    }

    @Override
    public void jump(int height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("jump: true");
        else System.out.println("jump: fase");

    }
}