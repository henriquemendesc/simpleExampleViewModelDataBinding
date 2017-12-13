package com.dev.bob.datamodel.viewmodels

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.view.View
import android.widget.Toast
import com.dev.bob.datamodel.bindings.ScoreData
import com.dev.bob.datamodel.databinding.ActivityMainBinding

/**
 * Created by Bob on 13/12/2017.
 */
class ScoreViewModel : ViewModel() {

    val toastData = MutableLiveData<String>()

    val score = ScoreData("0")

    fun onClickToScore() {
        var scoreInt: Int = score.score.toInt()+1
        score.score = scoreInt.toString()

        toastData.postValue("Increase score")
    }
}