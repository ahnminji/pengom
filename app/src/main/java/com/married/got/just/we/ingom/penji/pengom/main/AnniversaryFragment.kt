package com.married.got.just.we.ingom.penji.pengom.main


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.married.got.just.we.ingom.penji.pengom.R
import kotlinx.android.synthetic.main.fragment_anniversary.*

class AnniversaryFragment: Fragment() {

    companion object {
        lateinit var instance: AnniversaryFragment
            private set
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        instance = this
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater?.inflate(R.layout.fragment_anniversary, container, false)

        view_anniversary_list.layoutManager = LinearLayoutManager(this)
        view_anniversary_list.adapter = AnniversaryAdpater(this)
        return rootView
    }
}