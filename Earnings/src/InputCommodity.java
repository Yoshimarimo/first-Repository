import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


	public class InputCommodity {
		public static void main (String[] args){
			try{
				File file = new File(args[0]+"\\commodity.lst");
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader (fr);
				String s;
				while((s = br.readLine()) != null){
					String kaigyou = (s);
					String[] items = kaigyou.split(",");
					for(int i = 0; i<items.length; i++){
						System.out.println(items[i]);
					}
			br.close();
				}
			}catch(IOException e){
				System.out.println("商品定義ファイルが存在しません");
			}
	}
}