
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        
        int cost = 1500;
        // cost は原価です。
        
        int taxIn = tax(cost);
        // taxIn　は税込み価格です。
        
        int result = (taxIn - cost);
        // result は消費税です。
        
        System.out.println(cost + "円の商品の税込価格は" + taxIn + "円"
    + "（消費税は" + result + "円)です。");
    }
    
    public static int tax (int cost) {
        
        int result = ((int)(cost*1.1));
        return result;
        
    }

}
