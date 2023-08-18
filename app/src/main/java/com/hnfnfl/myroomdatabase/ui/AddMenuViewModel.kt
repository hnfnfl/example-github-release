package com.hnfnfl.myroomdatabase.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import com.hnfnfl.myroomdatabase.db.Menu
import com.hnfnfl.myroomdatabase.repository.MenuRepository

class AddMenuViewModel(application: Application) : ViewModel() {

    private val repository: MenuRepository = MenuRepository(application)

    fun insertMenu(menu: Menu) = repository.insertMenu(menu)

    fun updateMenu(menu: Menu) = repository.updateMenu(menu)
}