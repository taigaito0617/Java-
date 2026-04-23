package 演習5_3;

public class MyService extends SecureService{
    @Override
    protected void execute(){
        System.out.println("処理の実行内容");
    }
}
