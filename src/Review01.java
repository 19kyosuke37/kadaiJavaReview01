
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int cost = 1500;
        // cost は原価です。

        
        int result = tax(cost);
        // result は消費税です。
        
        int taxIn = (cost + result);
        // taxIn　は税込み価格です。


        System.out.println(cost + "円の商品の税込価格は" + taxIn + "円"
    + "（消費税は" + result + "円)です。");
    }

    public static int tax (int cost) {

        int result = ((int)(cost*0.1));
        return result;

    }

}
