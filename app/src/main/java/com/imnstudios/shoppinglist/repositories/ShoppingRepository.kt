package com.imnstudios.shoppinglist.repositories

import androidx.lifecycle.LiveData
import com.imnstudios.shoppinglist.data.local.ShoppingItem
import com.imnstudios.shoppinglist.data.remote.responses.ImageResponse
import com.imnstudios.shoppinglist.other.Resource

interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>
}