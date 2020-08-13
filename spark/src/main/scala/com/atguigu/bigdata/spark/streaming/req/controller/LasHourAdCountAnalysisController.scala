package com.atguigu.bigdata.spark.streaming.req.controller

import com.atguigu.bigdata.spark.streaming.req.service.LasHourAdCountAnalysisService
import com.atguigu.summer.framework.core.TController

class LasHourAdCountAnalysisController extends TController{

    private val lasHourAdCountAnalysisService = new LasHourAdCountAnalysisService

    override def execute(): Unit = {
        val result = lasHourAdCountAnalysisService.analysis()
    }
}
