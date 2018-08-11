# 概述
=============================
## Tools
```
ideaIU-2017.2.3.win
jdk1.8.0_121_x64
sbt-0.13.15
scala-2.11.12

# 配置环境变量
JAVA_HOME=
SBT_HOME=

# 配置文件
$SBT_HOME/conf/sbtconfig.txt
$SBT_HOME/conf/sbtopts
D:/yrepo/.sbt/repositories

# SBT plugins
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.7")
https://github.com/sbt/sbt-assembly
```

## 源码
```
https://github.com/jasongoodwin/learning-akka
# 每个项目下删除activator,activator-launch-1.2.12.jar文件，使用sbt代替。
```

## 基本配置
```
# project/build.properties
sbt.version=0.13.5
--[0.13.15]
# build.sbt
scalaVersion := "2.11.1"
--[2.11.12]
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor"   % "2.3.6",
  "com.typesafe.akka" %% "akka-remote"  % "2.3.6",
  "com.typesafe.akka" %% "akka-agent"   % "2.3.6",
  "com.typesafe.akka" %% "akka-cluster" % "2.3.6",
  "com.typesafe.akka" %% "akka-contrib" % "2.3.6",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.6"   % "test",
--[2.3.6,2.3.9]
  "com.typesafe.akka" % "akka-http-experimental_2.11" % "1.0-M4",
  "com.typesafe.akka" % "akka-http-core-experimental_2.11" % "1.0-M4",
--[1.0-M4]
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.7.0",
--[0.7.0]
  "com.syncthemall" % "boilerpipe" % "1.2.2",
--[1.2.2]
  "com.jason-goodwin" % "better-monads" % "0.2.0",
--[0.2.0]
  "junit"             % "junit"           % "4.11"  % "test",
--[4.11,4.12]
  "com.novocode"      % "junit-interface" % "0.11"  % "test"
--[0.11]
  "org.scalatest"     %% "scalatest"      % "2.1.6" % "test"
--[2.1.6,2.2.4]
)
```

# 编译
=============================
## SBT
```
$ sbt
> compile
> test
> package
> publish-local
```

# 运行
=============================
## ch6
```
# -----run cluster-----
$ cd akkademaid-java
$ sbt run
$ sbt -Dakka.remote.netty.tcp.port=2551 \
    -Dcom.sun.management.jmxremote.port=9551 \
    -Dcom.sun.management.jmxremote.authenticate=false \
    -Dcom.sun.management.jmxremote.ssl=false \
	run
$ sbt -Dakka.remote.netty.tcp.port=0 \
    -Dcom.sun.management.jmxremote.port=9551 \
    -Dcom.sun.management.jmxremote.authenticate=false \
    -Dcom.sun.management.jmxremote.ssl=false \
	run
# -----run client-----
$ cd akkademaid-client-java
$ sbt run
$ sbt run
```
