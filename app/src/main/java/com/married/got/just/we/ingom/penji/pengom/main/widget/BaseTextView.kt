package com.married.got.just.we.ingom.penji.pengom.main.widget

import android.annotation.TargetApi
import android.content.Context
import android.graphics.Typeface
import android.os.Build
import android.util.AttributeSet
import android.widget.TextView
import com.married.got.just.we.ingom.penji.pengom.R


class BaseTextView : TextView {
    @JvmOverloads
    constructor(
            context: Context,
            attrs: AttributeSet? = null,
            defStyleAttr: Int = 0)
            : super(context, attrs, defStyleAttr) {

        readTypeFace(context, attrs)
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int)
            : super(context, attrs, defStyleAttr, defStyleRes) {

        readTypeFace(context, attrs)
    }

    private fun readTypeFace(context: Context, attrs: AttributeSet?): Typeface? {
        attrs ?: return null
        val a = context.theme.obtainStyledAttributes(attrs, R.styleable.customfont, 0, 0)
        return try {
            val fontName = a.getString(R.styleable.customfont_android_fontFamily) ?: return null
            Typeface.createFromAsset(context.assets, fontName)
        } catch(e: Exception) {
            null
        } finally {
            a?.recycle()
        }
    }

}