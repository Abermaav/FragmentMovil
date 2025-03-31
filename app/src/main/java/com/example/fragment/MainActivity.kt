package com.example.fragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById(R.id.viewPager) as ViewPager
        var tabLayout = findViewById(R.id.tabLayout) as TabLayout

        val fragmentAdapter = FragmentAdapter(supportFragmentManager) //7poner y agregar yk
        fragmentAdapter.addFragment(BackFragment(), "Backend")
        fragmentAdapter.addFragment(FrontFragment(), "Frontend")
        fragmentAdapter.addFragment(FullFragment(), "FullStack")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)!!.setIcon(R.drawable.back)
        tabLayout.getTabAt(0)!!.setIcon(R.drawable.front)
        tabLayout.getTabAt(0)!!.setIcon(R.drawable.full)


    }
}