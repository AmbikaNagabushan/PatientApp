package com.sample.androinfotech.patientapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sample.androinfotech.patientapp.Adapters.DoctorsCardAdapter
import com.sample.androinfotech.patientapp.Adapters.HeaderCardAdapter
import com.sample.androinfotech.patientapp.Models.DoctorsCardModel
import com.sample.androinfotech.patientapp.Models.HeaderCardModel


class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var bottomNav: BottomNavigationView
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hamBurgerButton = findViewById<ImageView>(R.id.ham_menu)
        hamBurgerButton.setOnClickListener {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }

        bottomNav = findViewById(R.id.bottom_nav_view)

        drawerLayout = findViewById(R.id.my_drawer_layout)

        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val headerCardRV = findViewById<RecyclerView>(R.id.card_recycler_view)
        val headerCardArrayList: ArrayList<HeaderCardModel> = ArrayList()
        headerCardArrayList.add(HeaderCardModel(R.drawable.doctor, "Find a Doctor"))
        headerCardArrayList.add(HeaderCardModel(R.drawable.hospital, "Find a Clinic"))
        headerCardArrayList.add(HeaderCardModel(R.drawable.scope, "Find a Lab"))


        // we are initializing our adapter class and passing our arraylist to it.
        val courseAdapter = HeaderCardAdapter(headerCardArrayList)

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        headerCardRV.layoutManager = linearLayoutManager
        headerCardRV.adapter = courseAdapter


        val doctorCardRV = findViewById<RecyclerView>(R.id.doctor_rv)
        val doctorCardArrayList: ArrayList<DoctorsCardModel> = ArrayList()
        doctorCardArrayList.add(
            DoctorsCardModel(
                R.drawable.top_doctor,
                "Dr. Darren Elder",
                "MDS - Periodontology and Oral Implantology, BDS"
            )
        )
        doctorCardArrayList.add(
            DoctorsCardModel(
                R.drawable.top_doctor,
                "Dr. Darren Elder",
                "MDS - Periodontology and Oral Implantology, BDS"
            )
        )
        doctorCardArrayList.add(
            DoctorsCardModel(
                R.drawable.top_doctor,
                "Dr. Darren Elder",
                "MDS - Periodontology and Oral Implantology, BDS"
            )
        )


        // we are initializing our adapter class and passing our arraylist to it.
        val doctorAdapter = DoctorsCardAdapter(doctorCardArrayList)

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        val linearLayoutManagers = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        doctorCardRV.layoutManager = linearLayoutManagers
        doctorCardRV.adapter = doctorAdapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }


}