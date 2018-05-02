package com.married.got.just.we.ingom.penji.pengom.main


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.married.got.just.we.ingom.penji.pengom.R

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

//        view_anniversary_list.layoutManager = LinearLayoutManager(this.context)
//        view_anniversary_list.adapter = AnniversaryAdapter(this)
        return rootView
    }
}