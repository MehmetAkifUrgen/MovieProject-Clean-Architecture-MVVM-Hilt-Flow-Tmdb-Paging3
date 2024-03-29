package com.example.movieproject.data.repository.popular

import com.example.movieproject.data.api.ServiceInterface
import com.example.movieproject.data.response.genre.GenreResponse
import com.example.movieproject.data.response.popular.PopularResponse
import com.example.movieproject.data.response.popular.PopularDetailsResponse
import com.example.movieproject.data.response.upcoming.UpComingResponse
import com.example.movieproject.data.response.watch.WatchResponse
import io.reactivex.rxjava3.core.Single
import kotlinx.coroutines.flow.Flow

class PopularRepositoryImpl(private val serviceInterface: ServiceInterface) : PopularRepository {

    override suspend fun getPopulars(page:Int): PopularResponse {
        return serviceInterface.getPopulars(page)
    }

    override suspend fun getUpComing(page: Int): UpComingResponse {
        return serviceInterface.getUpComing(page)
    }

    override suspend fun getWatch(id: String): Flow<WatchResponse> {
        return serviceInterface.getWatch(id)
    }

    override suspend fun getPopularDetails(id: String): Flow<PopularDetailsResponse> {
        return serviceInterface.getPopularDetails(id)
    }

    override suspend fun getRecommed(id: String,page: Int): PopularResponse {
        return serviceInterface.getRecommed(id, page)
    }
}