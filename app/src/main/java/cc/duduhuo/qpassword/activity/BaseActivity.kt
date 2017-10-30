package cc.duduhuo.qpassword.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cc.duduhuo.qpassword.service.MainBinder

/**
 * =======================================================
 * Author: liying - liruoer2008@yeah.net
 * Datetime: 2017/10/28 17:05
 * Description: Activity的基类
 * Remarks:
 * =======================================================
 */
@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {
    protected var mMainBinder: MainBinder? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}