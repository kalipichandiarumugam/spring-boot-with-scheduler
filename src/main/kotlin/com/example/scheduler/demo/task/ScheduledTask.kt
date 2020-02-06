package com.example.scheduler.demo.task

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.text.SimpleDateFormat
import java.util.*


@Component
@EnableAsync
class ScheduledTask {
    private var logger: Logger = LoggerFactory.getLogger(ScheduledTask::class.java)
    private var dateFormat: SimpleDateFormat = SimpleDateFormat("HH:mm:ss")

    @Async
    @Scheduled(fixedRate = 5000)
    fun currentTime(){
        logger.info("The time is now {}", dateFormat.format(Date()))
    }
}