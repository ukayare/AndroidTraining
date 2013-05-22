Practice Report for 3.1
------

実習のレポートを下記に記述してください

デバッグ

1. (実習) 実習プロジェクト`DebugPractice`をビルド・インストールし、起動してから画面が立ち上がるまでのメソッドのプロファイリングを実行し、どのメソッドに時間がかかっているかレポートしてください。

excl cpu time で一番かかっているのは　java/lang/String.foldCase
呼び出し回数も１番多い
UIにおける文字の折り返し処理をやってるっぽいので、長文表示をするときに大量に呼び出されていると予想される
次点でString.equals

自動ビルド

2. (実習) 適用したプロジェクトを ant でビルドし、ログを見て、ビルドに必要な手順をレポートしてください。

以下ant debug install test-pro したときのコンソール出力

Buildfile: [reporoot]/AndroidTraining/projects/fundamentals/10th/SQLiteSample/build.xml

-set-mode-check:

-set-debug-files:

-check-env:
 [checkenv] Android SDK Tools Revision 21.1.0
 [checkenv] Installed at /Users/kohei.tokihara/android-sdks

-setup:
     [echo] Project Name: test-pro
  [gettype] Project Type: Application

-set-debug-mode:

-debug-obfuscation-check:

-pre-build:

-build-setup:
     [echo] Resolving Build Target for test-pro...
[gettarget] Project Target:   Android 4.2.2
[gettarget] API level:        17
     [echo] ----------
     [echo] Creating output directories if needed...
     [echo] ----------
     [echo] Resolving Dependencies for test-pro...
[dependency] Library dependencies:
[dependency] No Libraries
     [echo] ----------
     [echo] Building Libraries with 'debug'...
   [subant] No sub-builds to iterate on

-code-gen:
[mergemanifest] No changes in the AndroidManifest files.
     [echo] Handling aidl files...
     [aidl] No AIDL files to compile.
     [echo] ----------
     [echo] Handling RenderScript files...
[renderscript] No RenderScript files to compile.
     [echo] ----------
     [echo] Handling Resources...
     [aapt] No changed resources. R.java and Manifest.java untouched.
     [echo] ----------
     [echo] Handling BuildConfig class...
[buildconfig] No need to generate new BuildConfig.

-pre-compile:

-compile:

-post-compile:

-obfuscate:

-dex:
      [dex] input: /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/bin/classes
      [dex] input: /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/libs/android-support-v4.jar
      [dex] Using Pre-Dexed android-support-v4-ece6447e65493c5c71641729a9d85451.jar <- /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/libs/android-support-v4.jar
      [dex] No new compiled code. No need to convert bytecode to dalvik format.

-crunch:
   [crunch] Crunching PNG Files in source dir: /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/res
   [crunch] To destination dir: /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/bin/res
   [crunch] Crunched 0 PNG files to update cache

-package-resources:
     [aapt] No changed resources or assets. test-pro.ap_ remains untouched

-package:
[apkbuilder] No changes. No need to create apk.

-post-package:

-do-debug:
 [zipalign] Run cancelled: no changes to input file /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/bin/test-pro-debug-unaligned.apk
     [echo] Debug Package: /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/bin/test-pro-debug.apk
[propertyfile] Updating property file: /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/bin/build.prop
[propertyfile] Updating property file: /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/bin/build.prop
[propertyfile] Updating property file: /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/bin/build.prop
[propertyfile] Updating property file: /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/bin/build.prop

-post-build:

debug:

install:
     [echo] Installing /Users/kohei.tokihara/working/AndroidTraining/projects/fundamentals/10th/SQLiteSample/bin/test-pro-debug.apk onto default emulator or device...
     [exec] 6160 KB/s (197420 bytes in 0.031s)
     [exec] 	pkg: /data/local/tmp/test-pro-debug.apk
     [exec] Success

BUILD SUCCESSFUL

