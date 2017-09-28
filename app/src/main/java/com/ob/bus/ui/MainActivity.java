package com.ob.bus.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ob.bus.R;
import com.ob.bus.base.ActivityLifeCycleEvent;
import com.ob.bus.base.BaseActivity;
import com.ob.bus.http.Api;
import com.ob.bus.http.ApiException;
import com.ob.bus.http.HttpUtil;
import com.ob.bus.http.ProgressSubscriber;
import com.ob.bus.model.DataBean;
import com.ob.bus.model.HttpResult;

import rx.Observable;
import rx.functions.Func1;
//http://www.jianshu.com/p/bd758f51742e   RxJava+Retrofit 缓存，请求，生命周期管理
public class MainActivity extends BaseActivity {

//    private TextView data;
//    private ListView list_view;
//    private ListAdapter listAdapter;
//    private Request request;
//    private int myPosition = 21;
//    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        findViewById(R.id.test_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Observable<HttpResult<DataModel>> data = Api.getDefault().getData(0);
                Observable ob = Api.getDefault().getData(0);
//                Observable ob = Api.getDefault().getDaJia("97", 1503486357916L, "rycxGci001", "4A1188073FCE7E67B3DAF9F7695638FBECAD636D");
                HttpUtil.getInstance().toSubscribe(ob, new ProgressSubscriber<DataBean>(MainActivity.this) {
                    @Override
                    protected void _onError(String message) {
                        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    protected void _onNext(DataBean data) {
                        Log.e("pds", "data:"+data.getBus().getRn());
                    }
                }, "cacheKey", ActivityLifeCycleEvent.DESTROY, lifecycleSubject, false, false);

            }
        });

//        initView();
//        long time = System.currentTimeMillis();
//        final Calendar mCalendar = Calendar.getInstance();
//        mCalendar.setTimeInMillis(time);
//        int apm = mCalendar.get(Calendar.AM_PM);
//        if(apm == 0){//上午
//            url = "http://h5.thecampus.cc/api/v1/line?line_number=2011&direction=0";
//            myPosition = 23;
//        }else {
//            url = "http://h5.thecampus.cc/api/v1/line?line_number=2011&direction=1";
//            myPosition = 21;
//        }
//        request = new Request.Builder().url(url).build();
//        final OkHttpClient okHttpClient = new OkHttpClient();
//        final Call call = okHttpClient.newCall(request);//请求加入调度
//        call.enqueue(new Callback() {
//            @Override
//            public void onFailure(@NonNull Call call, @NonNull IOException e) {
//                Log.e("pds", "-----------"+e.toString());
//                //失败
//            }
//
//            @Override
//            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
//                ResponseBody body = response.body();
//                Log.e("pds", "-----------"+body.string());
//                if(body != null) {
//                    String data = body.string();
//                    parseData(data);
//                }else{
//                    //失败
//
//                }
//            }
//        });
//        findViewById(R.id.refresh_data).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.e("pds", "-----------");
////                Request request = new Request.Builder().url("http://www.baidu.com").build();
//                Call call = okHttpClient.newCall(request);//请求加入调度
//                call.enqueue(new Callback() {
//                    @Override
//                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
//                        Log.e("pds", "-----------"+e.toString());
//                        //失败
//                    }
//
//                    @Override
//                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
//                        Log.e("pds", "-----------");
//                        ResponseBody body = response.body();
//                        if(body != null) {
//                            String data = body.string();
//                            parseData(data);
//                        }else{
//                            //失败
//
//                        }
//                    }
//                });
//                showToast("刷新成功");
//            }
//        });
//        findViewById(R.id.switch_data).setOnClickListener(new View.OnClickListener() {
//            private boolean isSwitch;
//            @Override
//            public void onClick(View view) {
//
//                if(isSwitch){
//                    url = "http://h5.thecampus.cc/api/v1/line?line_number=2011&direction=1";
//                    myPosition = 21;
//                    isSwitch = false;
//                }else{
//                    url = "http://h5.thecampus.cc/api/v1/line?line_number=2011&direction=0";
//                    myPosition = 23;
//                    isSwitch = true;
//                }
//                request = new Request.Builder().url(url).build();
//                Call call = okHttpClient.newCall(request);//请求加入调度
//                call.enqueue(new Callback() {
//                    @Override
//                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
//                        Log.e("pds", "-----------"+e.toString());
//                        //失败
//                    }
//
//                    @Override
//                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
//                        Log.e("pds", "-----------");
//                        ResponseBody body = response.body();
//                        if(body != null) {
//                            String data = body.string();
//                            parseData(data);
//                        }else{
//                            //失败
//
//                        }
//                    }
//                });
//                showToast("切换成功");
//            }
//        });
    }
    private class HttpResultFunc<T> implements Func1<HttpResult<T>, T> {
        @Override
        public T call(HttpResult<T> httpResult) {
            Log.e("error", httpResult.getSubjects().toString()  + "");
            if (httpResult.getCode() != 0) {
                throw new ApiException(httpResult.getCode());
            }
            return httpResult.getSubjects();
        }
    }
    public void testMethod(){

    }
//    private void initView() {
//        list_view = (ListView) findViewById(R.id.list_view);
//    }
//    private class ListAdapter extends BaseAdapter{
//        private Context context;
//        private List<DataModel.DataBean.BusBean.LBean> data;
//
//        ListAdapter(Context context, List<DataModel.DataBean.BusBean.LBean> data){
//            this.context = context;
//            this.data = data;
//        }
//
//        @Override
//        public int getCount() {
//            return myPosition;
//        }
//
//        @Override
//        public Object getItem(int i) {
//            return i;
//        }
//
//        @Override
//        public long getItemId(int i) {
//            return i;
//        }
//
//        @Override
//        public View getView(int position, View view, ViewGroup viewGroup) {
//            ViewHolder holder;
//            if(view == null){
//                view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
//                holder = new ViewHolder();
//                holder.item_img = (ImageView) view.findViewById(R.id.item_img);
//                holder.item_text = (TextView) view.findViewById(R.id.item_text);
//                view.setTag(holder);
//            }else{
//                holder = (ViewHolder) view.getTag();
//            }//position == 20 的时候是公司站
//            holder.item_text.setText(data.get(position).getN());
//            if(position == myPosition - 1){
//                holder.item_text.setTextColor(getColor(android.R.color.black));
//            }
//            if(data.get(position).getBus_comming().getBbl().size() != 0 || data.get(position).getBus_comming().getBl().size() != 0) {
//                holder.item_img.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.arrive));
//            }
//            return view;
//        }
//        class ViewHolder{
//            private ImageView item_img;
//            private TextView item_text;
////            ViewHolder(View view){
////                item_img = (ImageView) view.findViewById(R.id.item_img);
////                item_text = (TextView) view.findViewById(R.id.item_text);
////            }
//        }
//    }
//    private Handler handler = new Handler(){
//        @Override
//        public void handleMessage(Message msg) {
////            super.handleMessage(msg);
//            DataModel dataModel = (DataModel) msg.obj;
//            if(dataModel.getCode() == 200) {
//                DataModel.DataBean.BusBean bus = dataModel.getData().getBus();
//                List<DataModel.DataBean.BusBean.LBean> busData = bus.getL();
//                listAdapter = new ListAdapter(MainActivity.this, busData);
//                list_view.setAdapter(listAdapter);
//            }else{
//                showToast(dataModel.getMsg());
//            }
//        }
//    };
//    private void parseData(String data){
//        Gson gson = new Gson();
//        Message message = new Message();
//        message.obj = gson.fromJson(data, DataModel.class);
//        handler.sendMessage(message);
//    }
//    private void showToast(String str){
//        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
//    }
}
