package com.dev.bob.datamodel.bindings

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.dev.bob.datamodel.BR

/**
 * Created by Bob on 13/12/2017.
 */
class ScoreData(scores: String) : BaseObservable() {

    @get:Bindable
    var score: String = scores
    set(value) {
        field = value
        notifyPropertyChanged(BR.score)
    }
}