package com.michaldrabik.kotlintest.data.api

import com.michaldrabik.kotlintest.data.models.Joke
import com.michaldrabik.kotlintest.data.models.Response
import rx.Observable

interface Api {
  fun fetchRandomJokes(): Observable<Response<Joke>>
}