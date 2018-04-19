package com.married.got.just.we.ingom.penji.pengom.main

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.married.got.just.we.ingom.penji.pengom.R
import com.married.got.just.we.ingom.penji.pengom.R.id.moneyBook
import com.married.got.just.we.ingom.penji.pengom.R.id.shareNote
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = MainPagerAdapter(supportFragmentManager)
        view_pager_main.adapter = fragmentAdapter;
        lyt_main_tab.setupWithViewPager(view_pager_main)

        view_navigation_main.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            shareNote -> Toast.makeText(this, getString(R.string.i_will_make_it_soon), Toast.LENGTH_SHORT).show()
            moneyBook -> Toast.makeText(this, getString(R.string.i_will_make_it_soon), Toast.LENGTH_SHORT).show()
            else -> throw IllegalArgumentException("there is no drawer item any more.")
        }

        lyt_drawer_main.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        this.menuInflater.inflate(R.menu.navigation_view_element, menu)
        return super.onCreateOptionsMenu(menu)
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
