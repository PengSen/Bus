package com.ob.bus.http;


import com.ob.bus.model.DataBean;
import com.ob.bus.model.HttpResult;

import okhttp3.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 网络访问的具体请求
 */
public interface ApiService {

//    @Headers("apikey:b86c2269fe6588bbe3b41924bb2f2da2")
    @GET("/api/v1/line?line_number=2011")//&direction=0
    Observable<HttpResult<DataBean>> getData(@Query("direction") int direction);

    @Headers({"Content-type:application/json",
            "Content-Length:59"})
    @POST("FundPaperTrade/AppUserLogin")
    Observable<Response> getTransData(@Body DataBean str);
}