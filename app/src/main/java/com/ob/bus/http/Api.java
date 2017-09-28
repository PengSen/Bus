package com.ob.bus.http;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 初始化Retrofit 网络访问
 */
public class Api {
    private final static String url = "http://h5.thecampus.cc";
//    private final static String url = "http://rycxapi.gci-china.com:6006";
    private static ApiService SERVICE;
    /**
     * 请求超时时间
     */
    private static final int DEFAULT_TIMEOUT = 10000;

    public static ApiService getDefault() {
        if (SERVICE == null) {
            //手动创建一个OkHttpClient并设置超时时间
            OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
            httpClientBuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);


            SERVICE = new Retrofit.Builder()
                    .client(httpClientBuilder.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .baseUrl(url)
                    .build().create(ApiService.class);
//            /**
//             *  拦截器
//             */
//            httpClientBuilder.addInterceptor(new Interceptor() {
//                @Override
//                public okhttp3.Response intercept(@NonNull Chain chain) throws IOException {
//                    Request request = chain.request();
//
////                    Request.Builder requestBuilder = request.newBuilder();
////                    RequestBody formBody = new FormBody.Builder()
////                            .add("1","2")
////                            .build();
//
//                    HttpUrl.Builder authorizedUrlBuilder = request.url()
//                            .newBuilder()
//                            //添加统一参数 如手机唯一标识符,token等
//                            .addQueryParameter("key1","value1")
//                            .addQueryParameter("key2", "value2");
//
//                    Request newRequest = request.newBuilder()
//                            //对所有请求添加请求头
//                            .header("mobileFlag", "adfsaeefe").addHeader("type", "4")
//                            .method(request.method(), request.body())
//                            .url(authorizedUrlBuilder.build())
//                            .build();
//
////                    okhttp3.Response originalResponse = chain.proceed(request);
////                    return originalResponse.newBuilder().header("mobileFlag", "adfsaeefe").addHeader("type", "4").build();
//                    return  chain.proceed(newRequest);
//                }
//            });

        }
        return SERVICE;
    }


}
