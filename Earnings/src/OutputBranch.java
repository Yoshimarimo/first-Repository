import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputBranch {
	public static void main (String[] args){
		try{
			File file = new File(args[0]+"\\branch.out");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter (fw);
			bw.write("bTotal\r\n");
					//bTotaは「支店別集計結果」の変数（支店コード、支店名、合計金額）
			bw.close();
	}	catch(IOException e){
		System.out.print("予期せぬエラーが発生しました");
		}
	}
}