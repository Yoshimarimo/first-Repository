import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputCommodity {
	public static void main (String[] args){
		try{
			File file = new File(args[0]+"\\commodity.out");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter (fw);
			bw.write("cTotal\r\n");
				//cTotaは「商品別集計結果」の変数（商品コード、商品名、合計金額）
			bw.close();
	}	catch(IOException e){
		System.out.print("予期せぬエラーが発生しました");
		}
	}
}
