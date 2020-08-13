package com.atguigu.bigdata.spark.streaming.req.application

import com.atguigu.bigdata.spark.streaming.req.controller.LasHourAdCountAnalysisController
import com.atguigu.summer.framework.core.TApplication

object LasHourAdCountAnalysisApplication extends App with TApplication{

    start( "sparkStreaming" ) {
        val controller = new LasHourAdCountAnalysisController
        controller.execute()
    }
}
