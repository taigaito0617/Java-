package 演習5_3;

public abstract class SecureService {
    public final void process() {
        System.out.println("認証開始");
        execute();
        System.out.println("認証終了");
    }

    protected abstract void execute();
}

