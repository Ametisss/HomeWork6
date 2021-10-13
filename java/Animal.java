public abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
    private final int MAX_JUMP_HEIGHT = 0;
    abstract void run(int length);
    abstract void swim(int length);
    abstract void jump(int height);
}
