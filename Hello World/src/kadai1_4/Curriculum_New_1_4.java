package curriculum_New_question;

public class Curriculum_New_1_4 {

     public static void main(String[] args) {
    	 
	     // Q1 下記9個をローカル変数として宣言のみしてください
	     //		・バイト型・短整数型・整数型・長整数型
	     // 	・単精度浮動小数点数型・倍精度浮動小数点数型
	     //   	・文字型・文字列型
	     //	 	・ブーリアン型 
    	 byte ;
    	 short ;
    	 int ;
    	 long ;
    	 float ;
    	 double ;
    	 char ;
    	 String ;
    	 boolean ;
    	 
	     // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
    	 byte = short = int = long = float = double = char = String = boolean = 0;
    	 
	     // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
	
	     // ・バイト型                 10
	     // ・短整数型                 100
	     // ・整数型                	 1000
	     // ・長整数型                 10000
	     // ・単精度浮動小数点数型   	 9.5
	     // ・倍精度浮動小数点数型		 10.5
	     // ・文字型                   a
	     // ・文字列型              	 ハロー
	     // ・ブーリアン型          	 true
    	 byte num = 10;
    	 short num = 100;
    	 int num = 1000;
    	 long num = 10000;
    	 float num = 9.5;
    	 double num = 10.5;
    	 char num = a;
    	 String num = 'ハロー'
    	 boolean num = true
	    	 
	     // Q4 下記の通りにコンソール出力されるようにしてください
	     // 必ず変数を使用すること
	
	     // 11110
	     // 20.0
	     // a ハロー true
	     // 11130.0                    数字を全て足す
	     // 10000000000                小数点以外の数字を全てかける
	     // 0.105                      10.5割る100をする
	     // -90                        10引く100をする
    	 
    	// Q5 
    	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
    	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
 		String num = "20";
 		int num1 = 23;
 		System.out.println("ハローJAVA" + (num + num1));
 		 
     }

}