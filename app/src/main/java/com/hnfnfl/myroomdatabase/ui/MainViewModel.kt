package com.hnfnfl.myroomdatabase.ui

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.hnfnfl.myroomdatabase.db.Menu
import com.hnfnfl.myroomdatabase.repository.MenuRepository

class MainViewModel(application: Application) : ViewModel() {

    private val repository: MenuRepository = MenuRepository(application)

    fun getALlMenu(): LiveData<List<Menu>> = repository.getAllMenu()

    fun deleteMenu(menu: Menu) = repository.deleteMenu(menu)
}