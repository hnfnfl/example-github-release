package com.hnfnfl.myroomdatabase.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.hnfnfl.myroomdatabase.db.Menu
import com.hnfnfl.myroomdatabase.db.MenuDao
import com.hnfnfl.myroomdatabase.db.MenuDatabase
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class MenuRepository(application: Application) {

    private val menuDao: MenuDao
    private val executorService: ExecutorService = Executors.newSingleThreadExecutor()

    init {
        val database = MenuDatabase.getDatabase(application)
        menuDao = database.menuDao()
    }

    fun getAllMenu(): LiveData<List<Menu>> = menuDao.getAllMenu()

    fun insertMenu(menu: Menu) = executorService.execute { menuDao.insertMenu(menu) }

    fun updateMenu(menu: Menu) = executorService.execute { menuDao.updateMenu(menu) }

    fun deleteMenu(menu: Menu) = executorService.execute { menuDao.deleteMenu(menu) }

}