import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Total {
    public static void main(String[] args){
    		/*tutorial内のすべてのファイル名を表示、
    		 *「00000001.rcd」内のデータを表示する処理
    		 */
    	File dirName = new File (args[0] + "");
    	String filelist[] = dirName.list();
		for(int i = 0; i<filelist.length ;i++){
				System.out.println(filelist[i]);
		}
		try {
			File file = new File("C:\\tutorial\\00000001.rcd");
			/*ファイル名をlistに格納する。list内のソートを行い（8桁.rcd）を抽出。
			 *ここでできればいいなあ。。
			 */
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader (fr);
			String s;
			while((s = br.readLine()) != null){
				System.out.println(s);
			}
		br.close();
		}
	catch(IOException e){
		System.out.println("売上ファイルが存在しません");
	}
		/*
		 * ファイル名をlistに格納する。list内のソートを行い（8桁.rcd）を抽出。
		 *抽出したディレクトリ内のデータをMapに格納（支店コード、売上額）（商品コード、売上額）
		 *以上を用いそれぞれの売上に加算
		 *String[] list()
		 *フォルダに含まれるファイルまたはサブフォルダの一覧を文字列の配列でかえします。
		*/



    }
}