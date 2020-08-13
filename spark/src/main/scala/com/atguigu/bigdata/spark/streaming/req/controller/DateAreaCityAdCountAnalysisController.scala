package com.atguigu.bigdata.spark.streaming.req.controller

import com.atguigu.bigdata.spark.streaming.req.service.DateAreaCityAdCountAnalysisService
import com.atguigu.summer.framework.core.TController

class DateAreaCityAdCountAnalysisController extends TController{

    private val dateAreaCityAdCountAnalysisService = new DateAreaCityAdCountAnalysisService

    override def execute(): Unit = {
        val result = dateAreaCityAdCountAnalysisService.analysis()
    }
}
