package com.hoppers.recyclerviewdrag.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.hoppers.recyclerviewdrag.model.Repo

class RepoViewModel : ViewModel() {
    var liveData = MutableLiveData<Repo>()
}