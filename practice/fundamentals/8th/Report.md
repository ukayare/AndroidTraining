スタート
V/StartedService(14196): onCreate
V/StartedService(14196): onStartCommand
ストップ
V/StartedService(14196): onDestroy
バインド
V/BoundService(14196): onCreate
V/MainActivity(14196): onServiceConnected
アンバインド
V/BoundService(14196): onUnbind
V/BoundService(14196): onDestroy
call intent
V/MyIntentService(14196): onCreate
V/MyIntentService(14196): onStartCommand
V/MyIntentService(14196): onHandleIntent
V/MyIntentService(14196): onDestroy

起動
V/MainActivity(15282): onCreateLoader
V/MyAsyncTaskLoader(15282): onStartLoading
V/MyAsyncTaskLoader(15282): loadInBackground
V/MyAsyncTaskLoader(15282): deliverResult
V/MainActivity(15282): onLoadFinished
バックボタン
V/MyAsyncTaskLoader(15282): onStopLoading
V/MainActivity(15282): onLoaderReset
V/MyAsyncTaskLoader(15282): onReset
V/MyAsyncTaskLoader(15282): onStopLoading
起動
V/MainActivity(15282): onCreateLoader
V/MyAsyncTaskLoader(15282): onStartLoading
V/MyAsyncTaskLoader(15282): loadInBackground
V/MyAsyncTaskLoader(15282): deliverResult
V/MainActivity(15282): onLoadFinished
バックボタン
V/MyAsyncTaskLoader(15282): onStopLoading
V/MainActivity(15282): onLoaderReset
V/MyAsyncTaskLoader(15282): onReset
V/MyAsyncTaskLoader(15282): onStopLoading
起動
V/MainActivity(15282): onCreateLoader
V/MyAsyncTaskLoader(15282): onStartLoading
V/MyAsyncTaskLoader(15282): loadInBackground
V/MyAsyncTaskLoader(15282): deliverResult
V/MainActivity(15282): onLoadFinished
home
V/MyAsyncTaskLoader(15282): onStopLoading
V/MyAsyncTaskLoader(15282): onStartLoading
V/MyAsyncTaskLoader(15282): deliverResult
V/MyAsyncTaskLoader(15282): onStopLoading

UIの操作はメインスレッドからのみ操作が許されてるから例外が発生して落ちる
E/AndroidRuntime(18188): FATAL EXCEPTION: AsyncTask #1
E/AndroidRuntime(18188): java.lang.RuntimeException: An error occured while executing doInBackground()
E/AndroidRuntime(18188):at android.os.AsyncTask$3.done(AsyncTask.java:299)
E/AndroidRuntime(18188):at java.util.concurrent.FutureTask$Sync.innerSetException(FutureTask.java:273)
E/AndroidRuntime(18188):at java.util.concurrent.FutureTask.setException(FutureTask.java:124)
E/AndroidRuntime(18188):at java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:307)
E/AndroidRuntime(18188):at java.util.concurrent.FutureTask.run(FutureTask.java:137)
E/AndroidRuntime(18188):at android.os.AsyncTask$SerialExecutor$1.run(AsyncTask.java:230)
E/AndroidRuntime(18188):at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1076)
E/AndroidRuntime(18188):at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:569)
E/AndroidRuntime(18188):at java.lang.Thread.run(Thread.java:856)
E/AndroidRuntime(18188): Caused by: android.view.ViewRootImpl$CalledFromWrongThreadException: Only the original thread that created a view hierarchy can touch its views.
E/AndroidRuntime(18188):at android.view.ViewRootImpl.checkThread(ViewRootImpl.java:4865)
E/AndroidRuntime(18188):at android.view.ViewRootImpl.requestLayout(ViewRootImpl.java:947)
E/AndroidRuntime(18188):at android.view.View.requestLayout(View.java:15430)
E/AndroidRuntime(18188):at android.view.View.requestLayout(View.java:15430)
E/AndroidRuntime(18188):at android.view.View.requestLayout(View.java:15430)
E/AndroidRuntime(18188):at android.view.View.requestLayout(View.java:15430)
E/AndroidRuntime(18188):at android.widget.RelativeLayout.requestLayout(RelativeLayout.java:292)
E/AndroidRuntime(18188):at android.view.View.requestLayout(View.java:15430)
E/AndroidRuntime(18188):at android.widget.TextView.checkForRelayout(TextView.java:6616)
E/AndroidRuntime(18188):at android.widget.TextView.setText(TextView.java:3710)
E/AndroidRuntime(18188):at android.widget.TextView.setText(TextView.java:3568)
E/AndroidRuntime(18188):at android.widget.TextView.setText(TextView.java:3543)
E/AndroidRuntime(18188):at jp.mixi.sample.async.asynctask.MainActivity$MyAsyncTask.doInBackground(MainActivity.java:76)
E/AndroidRuntime(18188)at jp.mixi.sample.async.asynctask.MainActivity$MyAsyncTask.doInBackground(MainActivity.java:1)
E/AndroidRuntime(18188):at android.os.AsyncTask$2.call(AsyncTask.java:287)
E/AndroidRuntime(18188):at java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:305)
E/AndroidRuntime(18188):... 5 more

