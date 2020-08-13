package com.atguigu.bigdata.spark.streaming.req.application

import com.atguigu.bigdata.spark.streaming.req.controller.DateAreaCityAdCountAnalysisController
import com.atguigu.summer.framework.core.TApplication

object DateAreaCityAdCountAnalysisApplication extends App with TApplication {

    start( "sparkStreaming" ) {
        val controller = new DateAreaCityAdCountAnalysisController
        controller.execute()
    }
}
