Assignment Report for 1.3
------

以下に、課題の回答を記入してください。

署名済みアプリの作成
======

3. 作成した apk ファイルの中にあるファイル・ディレクトリを列挙してください。
作成されたapk をunzip

unzip tokihara_test.apk
Archive:  tokihara_test.apk
* inflating: res/layout/activity_main.xml  
* inflating: res/menu/main.xml       
* inflating: AndroidManifest.xml     
* extracting: resources.arsc          
* extracting: res/drawable-hdpi/ic_launcher.png  
* extracting: res/drawable-mdpi/ic_launcher.png  
* extracting: res/drawable-xhdpi/ic_launcher.png  
* extracting: res/drawable-xxhdpi/ic_launcher.png  
* inflating: classes.dex             
* inflating: META-INF/MANIFEST.MF    
* inflating: META-INF/CERT.SF        
* inflating: META-INF/CERT.RSA  

4. 上記で列挙したファイル・ディレクトリについて、どのような役割を持っているか説明してください。
* res
  - アプリで使われるリソースファイル群
* AndroidManifest.xml
  - アプリの設定やら書いてあるやつ
* classes.dex
  - DalvicVMの実行ファイル形式らしいhttp://gsbina.com/?p=357
* META-INF
  - 　署名ファイル群らしいhttp://d.hatena.ne.jp/urandroid/20110818/1313656536
