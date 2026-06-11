// クラスの定義

import java.util.ArrayList;
import java.util.List;

public class HelloWorld2 {
   // メインメソッド（プログラムのエントリーポイント）
   public static void main(String[] args) {
       // コンソールに文字列を出力
       System.out.println("こんにちは、世界！");

       //// ユーザー一覧を作成する
       List<String> ddd = new ArrayList<String>();
       ddd.add("田中");
       ddd.add("鈴木");
       ddd.add("遠藤");
       System.out.println(ddd);
   }

   @Override
   public String toString() {
    System.out.println("こんにちは、toStringだよ！");
    return super.toString();
   }
}
