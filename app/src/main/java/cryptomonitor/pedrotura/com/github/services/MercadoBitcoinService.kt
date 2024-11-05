package cryptomonitor.pedrotura.com.github.services

import cryptomonitor.pedrotura.com.github.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {
    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}