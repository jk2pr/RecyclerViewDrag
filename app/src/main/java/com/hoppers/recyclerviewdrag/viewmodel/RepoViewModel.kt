package com.hoppers.recyclerviewdrag.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hoppers.recyclerviewdrag.model.Repo

class RepoViewModel : ViewModel() {
    var liveData = MutableLiveData<Repo>()
}