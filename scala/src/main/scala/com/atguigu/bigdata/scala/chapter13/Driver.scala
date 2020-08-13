package com.atguigu.bigdata.scala.chapter13

import java.io.ObjectOutputStream
import java.net.{ServerSocket, Socket}

object Driver {

    def main(args: Array[String]): Unit = {

        // TODO 数据准备
        val executorCount = 5
        val myHost = "localhost"
        val myPort = 1234

        // TODO 连接资源中信息
        val resourceCenterRef = new Socket("localhost", 9999)
        println("资源中心已经连接，数据准备中")
        val resourceCenterRefOut = new ObjectOutputStream(resourceCenterRef.getOutputStream)
        resourceCenterRefOut.writeObject(
            Message(s"executorCount=$executorCount&driverHost=$myHost&driverPort=$myPort"))
        resourceCenterRefOut.flush()
        // 释放和资源中心的连接
        resourceCenterRef.close

        // TODO 接收Executor端的数据
        val receiver = new ServerSocket(myPort)
        while ( true ) {
            val executorRef: Socket = receiver.accept()
            println("执行器已经连接上了。。。")
        }

    }
}
