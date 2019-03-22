package com.milo.loglib

import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy

object XLog {

    @JvmStatic
    fun init(tag: String, isDebug: Boolean) {
        val strategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(false)//（可选）是否显示线程信息。 默认值为true
//                .logStrategy(LogCatStrategy())
            .methodCount(1) // （可选）要显示的方法行数。 默认2
            .methodOffset(1)        // （可选）隐藏内部方法调用到偏移量。 默认5
            .tag(tag)
            .build()
        Logger.addLogAdapter(object : AndroidLogAdapter(strategy) {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return isDebug
            }
        })
    }


    @JvmStatic
    fun v(clazz: Class<*>, msg: String) = Logger.t(clazz.simpleName).v(msg)

    @JvmStatic
    fun v(any: Any, msg: String) = Logger.t(any::class.java.simpleName).v(msg)

    @JvmStatic
    fun v(tag: String, msg: String) = Logger.t(tag).v(msg)

    @JvmStatic
    fun d(clazz: Class<*>, msg: String?) = Logger.t(clazz.simpleName).d(msg)

    @JvmStatic
    fun d(any: Any, msg: String?) = Logger.t(any::class.java.simpleName).d(msg)

    @JvmStatic
    fun d(tag: String, msg: String?) = Logger.t(tag).d(msg)

    @JvmStatic
    fun i(clazz: Class<*>, msg: String) = Logger.t(clazz.simpleName).i(msg)

    @JvmStatic
    fun i(any: Any, msg: String) = Logger.t(any::class.java.simpleName).i(msg)

    @JvmStatic
    fun i(tag: String, msg: String) = Logger.t(tag).i(msg)

    @JvmStatic
    fun w(clazz: Class<*>, msg: String) = Logger.t(clazz.simpleName).w(msg)

    @JvmStatic
    fun w(any: Any, msg: String) = Logger.t(any::class.java.simpleName).w(msg)

    @JvmStatic
    fun w(tag: String, msg: String) = Logger.t(tag).w(msg)

    @JvmStatic
    fun e(clazz: Class<*>, msg: String) = Logger.t(clazz.simpleName).e(msg)

    @JvmStatic
    fun e(any: Any, msg: String) = Logger.t(any::class.java.simpleName).e(msg)

    @JvmStatic
    fun e(tag: String, msg: String) = Logger.t(tag).e(msg)

    @JvmStatic
    fun e(tag: String, throwable: Throwable) = Logger.t(tag).e(throwable.message.toString(), throwable)

    @JvmStatic
    fun e(clazz: Class<*>, throwable: Throwable) = Logger.t(clazz.simpleName).e(throwable.message.toString(), throwable)

    @JvmStatic
    fun e(any: Any, throwable: Throwable) =
        Logger.t(any::class.java.simpleName).e(throwable.message.toString(), throwable)

    @JvmStatic
    fun e(tag: String, msg: String, throwable: Throwable) = Logger.t(tag).e(throwable, msg)

    @JvmStatic
    fun e(clazz: Class<*>, msg: String, throwable: Throwable) = Logger.t(clazz.simpleName).e(throwable, msg)

    @JvmStatic
    fun e(any: Any, msg: String, throwable: Throwable) = Logger.t(any::class.java.simpleName).e(throwable, msg)

    @JvmStatic
    fun json(clazz: Class<*>, msg: String?) = Logger.t(clazz.simpleName).json(msg)

    @JvmStatic
    fun json(any: Any, msg: String?) = Logger.t(any::class.java.simpleName).json(msg)

    @JvmStatic
    fun json(tag: String, msg: String?) = Logger.t(tag).json(msg)

    @JvmStatic
    fun wtf(clazz: Class<*>, msg: String) = Logger.t(clazz.simpleName).wtf(msg)

    @JvmStatic
    fun wtf(any: Any, msg: String) = Logger.t(any::class.java.simpleName).wtf(msg)

    @JvmStatic
    fun wtf(tag: String, msg: String) = Logger.t(tag).wtf(msg)
}