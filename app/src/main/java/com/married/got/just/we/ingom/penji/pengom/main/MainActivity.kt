package com.married.got.just.we.ingom.penji.pengom.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import com.married.got.just.we.ingom.penji.pengom.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = MainPagerAdapter(supportFragmentManager)
        view_pager_main.adapter = fragmentAdapter;
        lyt_main_tab.setupWithViewPager(view_pager_main)
    }

    inner class MainPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        internal var MAX_FRAGMENT_COUNT = 2;

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> MottoFragment()
                1 -> AnniversaryFragment()
                else -> return throw IllegalArgumentException("there is no main fragment any more.")
            }
        }

        override fun getCount(): Int {
            return MAX_FRAGMENT_COUNT
        }

        override fun getPageTitle(position: Int): CharSequence {
            return when (position) {
                0 -> getString(R.string.motto)
                1 -> getString(R.string.anniversary)
                else -> {
                    ""
                }
            }
        }
    }
}
