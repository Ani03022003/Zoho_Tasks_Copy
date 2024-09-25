package com.example.dogpics.work

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.dogpics.database.DogDatabase
import com.example.dogpics.repository.DogRepository
import retrofit2.HttpException

class RefreshWork(appContext: Context, params: WorkerParameters) : CoroutineWorker(appContext, params) {
    override suspend fun doWork(): Result {
        val database = DogDatabase.getInstance(applicationContext)
        val repository = DogRepository(database)

        return try{
            repository.refreshPics()
            Result.success()
        }
        catch (e : HttpException){
            Result.retry()
        }
    }

    companion object {
        const val WORK_NAME = "RefreshDogData"
    }
}