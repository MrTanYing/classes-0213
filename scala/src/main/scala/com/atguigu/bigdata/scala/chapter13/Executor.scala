package com.atguigu.bigdata.scala.chapter13

import java.net.Socket

case class Executor( id:Int, driverHost:String, driverPort:Int ) {

    /**
      * 启动执行器
      */
    def startup() {
        println(s"执行器【$id】开始启动")

        println(s"执行器【$id】开始链接驱动器")
        val driverRef = new Socket(driverHost, driverPort)
        driverRef.close
    }
}
