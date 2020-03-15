package tools;

import java.util.Random;

//16桁のパスワードをランダムに自動生成する
public class CreatePassword {
    public static void main(String[] args) {
        //パスワードに使用する文字列を定義
        String passwordChars = "ABCDEFGHIJKRMNOPQRSTUVWXYZabcdefghijkrmnopqrstuvwxyz0123456789`~!@#$%^&*()_+-= {}[]\\|:;\"'<>,.?/";
        //出力用のパスワード
        String password = "";
        //Randomのインスタンスを生成
        Random random = new Random();
        //16桁のパスワードを生成する
        for (int i = 0; i < 16; i++) {
            password += passwordChars.charAt(random.nextInt(passwordChars.length() - 1));
        }
        //パスワードをコンソールに出力
        System.out.println(password);
    }
}
