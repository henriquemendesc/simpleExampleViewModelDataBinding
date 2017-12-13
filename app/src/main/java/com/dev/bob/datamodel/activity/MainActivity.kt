package com.dev.bob.datamodel.activity

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dev.bob.datamodel.bindings.HandlerButton
import com.dev.bob.datamodel.R
import com.dev.bob.datamodel.bindings.ScoreData
import com.dev.bob.datamodel.databinding.ActivityMainBinding
import com.dev.bob.datamodel.viewmodels.ScoreViewModel

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)
        binding.viewModel = scoreViewModel

        scoreViewModel.toastData.observe(this, Observer {
            Toast.makeText(this, it ?: "lol", Toast.LENGTH_SHORT).show()
        })
    }
}
