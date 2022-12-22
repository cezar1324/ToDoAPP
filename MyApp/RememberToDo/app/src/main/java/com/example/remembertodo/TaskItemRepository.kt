package com.example.remembertodo

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class TaskItemRepository(private val taskItemDao: TaskItemDao)
{
    var allTaskItems: Flow<List<TaskItem>> = taskItemDao.allTaskItems()


    @WorkerThread
    suspend fun insertTaskItem(taskItem: TaskItem){

        taskItemDao.insertTaskItem(taskItem)
    }

    @WorkerThread
    suspend fun updateTaskItem(taskItem: TaskItem){

        taskItemDao.insertTaskItem(taskItem)
    }
}