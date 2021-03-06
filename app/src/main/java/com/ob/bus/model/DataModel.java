package com.ob.bus.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by pengs on 2017/6/14.
 */

public class DataModel {


    /**
     * code : 200
     * msg : ok
     * data : {"bus":{"rn":"番97路","d":"1","c":"70970","ft":"0700","lt":"2030","l":[{"i":"317428","n":"北滘公园站","sni":"13028","si":"15653","bus_comming":{"bl":[],"bbl":[]}},{"i":"317429","n":"北滘医院站","sni":"13033","si":"15654","bus_comming":{"bl":[],"bbl":[]}},{"i":"317472","n":"林头西站","sni":"3223","si":"12791","bus_comming":{"bl":[],"bbl":[]}},{"i":"317430","n":"林头村站","sni":"13020","si":"15655","bus_comming":{"bl":[],"bbl":[]}},{"i":"317431","n":"君兰高尔夫生活村站","sni":"13034","si":"15656","bus_comming":{"bl":[],"bbl":[{"i":"1730417","si":"976084","t":"1"}]}},{"i":"317432","n":"碧桂园","sni":"11165","si":"15009","bus_comming":{"bl":[],"bbl":[]}},{"i":"317400","n":"陈村路口站","sni":"5699","si":"12133","bus_comming":{"bl":[],"bbl":[]}},{"i":"317433","n":"南涌站","sni":"1335","si":"13082","bus_comming":{"bl":[],"bbl":[]}},{"i":"317434","n":"顺联广场站","sni":"5768","si":"12789","bus_comming":{"bl":[],"bbl":[]}},{"i":"317401","n":"陈村医院(新君悦酒店)","sni":"5697","si":"13074","bus_comming":{"bl":[],"bbl":[]}},{"i":"317435","n":"陈村客运站","sni":"5698","si":"13073","bus_comming":{"bl":[],"bbl":[]}},{"i":"317436","n":"广珠路碧江立交站","sni":"2586","si":"13078","bus_comming":{"bl":[],"bbl":[]}},{"i":"317402","n":"广珠路碧江站","sni":"2587","si":"12795","bus_comming":{"bl":[],"bbl":[]}},{"i":"317437","n":"碧桂西苑站","sni":"4545","si":"13077","bus_comming":{"bl":[],"bbl":[]}},{"i":"317438","n":"碧桂园天玺湾站","sni":"4543","si":"12495","bus_comming":{"bl":[],"bbl":[{"i":"3001520","si":"976084","t":"1"}]}},{"i":"317495","n":"都那村站","sni":"5451","si":"10024516","bus_comming":{"bl":[],"bbl":[]}},{"i":"317403","n":"碧桂东苑站","sni":"4542","si":"10024519","bus_comming":{"bl":[],"bbl":[]}},{"i":"317439","n":"屏二村站","sni":"2292","si":"10024514","bus_comming":{"bl":[],"bbl":[]}},{"i":"317440","n":"钟村交警中队站","sni":"5540","si":"10024512","bus_comming":{"bl":[],"bbl":[]}},{"i":"317404","n":"屏一村站","sni":"2290","si":"10024507","bus_comming":{"bl":[],"bbl":[]}},{"i":"317441","n":"钟村文化广场（钟屏路）站","sni":"1000064","si":"10024504","bus_comming":{"bl":[],"bbl":[]}},{"i":"317442","n":"锦绣生态园南门站","sni":"5586","si":"10024501","bus_comming":{"bl":[],"bbl":[]}},{"i":"317443","n":"大夫山公园北门站","sni":"1836","si":"10002215","bus_comming":{"bl":[],"bbl":[]}},{"i":"317444","n":"锦绣生态园站","sni":"5587","si":"10005784","bus_comming":{"bl":[],"bbl":[]}},{"i":"317445","n":"钟村小学站","sni":"5541","si":"10011680","bus_comming":{"bl":[],"bbl":[]}},{"i":"317446","n":"钟韦路口站","sni":"5560","si":"10000156","bus_comming":{"bl":[],"bbl":[]}},{"i":"317405","n":"钟村市场站","sni":"5543","si":"10000138","bus_comming":{"bl":[],"bbl":[]}},{"i":"317447","n":"锦绣文化中心站","sni":"5584","si":"10009997","bus_comming":{"bl":[],"bbl":[]}},{"i":"317406","n":"钟村站","sni":"5547","si":"10000139","bus_comming":{"bl":[],"bbl":[]}},{"i":"317448","n":"汉溪路口站","sni":"3529","si":"10009992","bus_comming":{"bl":[],"bbl":[{"i":"1730992","si":"976084","t":"1"}]}},{"i":"317449","n":"钟二村站","sni":"5537","si":"11803","bus_comming":{"bl":[],"bbl":[]}},{"i":"317450","n":"隆辉站","sni":"5711","si":"10010000","bus_comming":{"bl":[],"bbl":[{"i":"1730485","si":"976082","t":"2"}]}},{"i":"317451","n":"祈福新村站","sni":"4562","si":"10010002","bus_comming":{"bl":[],"bbl":[]}},{"i":"317467","n":"金山谷花园站","sni":"5481","si":"10011205","bus_comming":{"bl":[],"bbl":[]}},{"i":"317452","n":"易兴工业区站","sni":"3070","si":"10001153","bus_comming":{"bl":[],"bbl":[]}},{"i":"317453","n":"富豪山庄站","sni":"2223","si":"10002818","bus_comming":{"bl":[],"bbl":[{"i":"1730183","si":"976084","t":"1"}]}},{"i":"317454","n":"左边村站","sni":"2357","si":"10010010","bus_comming":{"bl":[],"bbl":[]}},{"i":"317455","n":"大罗村（市广路）站","sni":"1000142","si":"10009980","bus_comming":{"bl":[],"bbl":[]}},{"i":"317456","n":"丹山村（桥兴大道）站","sni":"1000052","si":"10002374","bus_comming":{"bl":[],"bbl":[]}},{"i":"317457","n":"丹山桥站","sni":"470","si":"10002372","bus_comming":{"bl":[],"bbl":[]}},{"i":"317458","n":"百越广场东门（地铁市桥）站","sni":"1000451","si":"10009978","bus_comming":{"bl":[],"bbl":[]}},{"i":"317459","n":"市桥汽车站西门站","sni":"2390","si":"10027158","bus_comming":{"bl":[],"bbl":[]}},{"i":"317468","n":"星海公园站","sni":"3093","si":"10000972","bus_comming":{"bl":[],"bbl":[{"i":"1730169","si":"976084","t":"1"}]}},{"i":"317460","n":"交通大厦站","sni":"646","si":"10005633","bus_comming":{"bl":[],"bbl":[]}},{"i":"317461","n":"沙墟村站","sni":"3647","si":"10010003","bus_comming":{"bl":[],"bbl":[]}},{"i":"317469","n":"沙墟市场站","sni":"3646","si":"10004241","bus_comming":{"bl":[],"bbl":[]}},{"i":"317462","n":"党校路口站","sni":"837","si":"10002385","bus_comming":{"bl":[],"bbl":[]}},{"i":"317463","n":"罗家村站","sni":"1000432","si":"10003395","bus_comming":{"bl":[],"bbl":[]}},{"i":"317464","n":"石岗西村站","sni":"4469","si":"10010952","bus_comming":{"bl":[],"bbl":[]}},{"i":"317465","n":"石岗东村站","sni":"4460","si":"10004415","bus_comming":{"bl":[],"bbl":[]}},{"i":"317466","n":"美心苑站","sni":"4803","si":"10003510","bus_comming":{"bl":[],"bbl":[]}},{"i":"317487","n":"城市花园路口站","sni":"1690","si":"10002129","bus_comming":{"bl":[],"bbl":[]}},{"i":"317488","n":"傍江西村站","sni":"794","si":"10009180","bus_comming":{"bl":[],"bbl":[]}},{"i":"317489","n":"傍江东村站","sni":"793","si":"10024163","bus_comming":{"bl":[{"i":"1730178","si":"976084","t":"1"}],"bbl":[]}},{"i":"317470","n":"番禺汽车客运站总站","sni":"4256","si":"2699","bus_comming":{"bl":[{"i":"1730166","si":"976084","t":"1"}],"bbl":[]}},{"i":"317490","n":"雁洲路口站","sni":"5717","si":"10024025","bus_comming":{"bl":[],"bbl":[]}},{"i":"317491","n":"东湖洲花园C站","sni":"1000351","si":"10024029","bus_comming":{"bl":[],"bbl":[]}},{"i":"317492","n":"东湖洲花园A站","sni":"1000709","si":"10024033","bus_comming":{"bl":[],"bbl":[{"i":"1730469","si":"976082","t":"2"}]}},{"i":"317493","n":"雁洲村总站","sni":"5716","si":"10205","bus_comming":{"bl":[],"bbl":[]}}]}}
     */

//    private int code;
//    private String msg;
//    private DataBean data;
//
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//    public DataBean getData() {
//        return data;
//    }
//
//    public void setData(DataBean data) {
//        this.data = data;
//    }

//    public static class DataBean {
        /**
         * bus : {"rn":"番97路","d":"1","c":"70970","ft":"0700","lt":"2030","l":[{"i":"317428","n":"北滘公园站","sni":"13028","si":"15653","bus_comming":{"bl":[],"bbl":[]}},{"i":"317429","n":"北滘医院站","sni":"13033","si":"15654","bus_comming":{"bl":[],"bbl":[]}},{"i":"317472","n":"林头西站","sni":"3223","si":"12791","bus_comming":{"bl":[],"bbl":[]}},{"i":"317430","n":"林头村站","sni":"13020","si":"15655","bus_comming":{"bl":[],"bbl":[]}},{"i":"317431","n":"君兰高尔夫生活村站","sni":"13034","si":"15656","bus_comming":{"bl":[],"bbl":[{"i":"1730417","si":"976084","t":"1"}]}},{"i":"317432","n":"碧桂园","sni":"11165","si":"15009","bus_comming":{"bl":[],"bbl":[]}},{"i":"317400","n":"陈村路口站","sni":"5699","si":"12133","bus_comming":{"bl":[],"bbl":[]}},{"i":"317433","n":"南涌站","sni":"1335","si":"13082","bus_comming":{"bl":[],"bbl":[]}},{"i":"317434","n":"顺联广场站","sni":"5768","si":"12789","bus_comming":{"bl":[],"bbl":[]}},{"i":"317401","n":"陈村医院(新君悦酒店)","sni":"5697","si":"13074","bus_comming":{"bl":[],"bbl":[]}},{"i":"317435","n":"陈村客运站","sni":"5698","si":"13073","bus_comming":{"bl":[],"bbl":[]}},{"i":"317436","n":"广珠路碧江立交站","sni":"2586","si":"13078","bus_comming":{"bl":[],"bbl":[]}},{"i":"317402","n":"广珠路碧江站","sni":"2587","si":"12795","bus_comming":{"bl":[],"bbl":[]}},{"i":"317437","n":"碧桂西苑站","sni":"4545","si":"13077","bus_comming":{"bl":[],"bbl":[]}},{"i":"317438","n":"碧桂园天玺湾站","sni":"4543","si":"12495","bus_comming":{"bl":[],"bbl":[{"i":"3001520","si":"976084","t":"1"}]}},{"i":"317495","n":"都那村站","sni":"5451","si":"10024516","bus_comming":{"bl":[],"bbl":[]}},{"i":"317403","n":"碧桂东苑站","sni":"4542","si":"10024519","bus_comming":{"bl":[],"bbl":[]}},{"i":"317439","n":"屏二村站","sni":"2292","si":"10024514","bus_comming":{"bl":[],"bbl":[]}},{"i":"317440","n":"钟村交警中队站","sni":"5540","si":"10024512","bus_comming":{"bl":[],"bbl":[]}},{"i":"317404","n":"屏一村站","sni":"2290","si":"10024507","bus_comming":{"bl":[],"bbl":[]}},{"i":"317441","n":"钟村文化广场（钟屏路）站","sni":"1000064","si":"10024504","bus_comming":{"bl":[],"bbl":[]}},{"i":"317442","n":"锦绣生态园南门站","sni":"5586","si":"10024501","bus_comming":{"bl":[],"bbl":[]}},{"i":"317443","n":"大夫山公园北门站","sni":"1836","si":"10002215","bus_comming":{"bl":[],"bbl":[]}},{"i":"317444","n":"锦绣生态园站","sni":"5587","si":"10005784","bus_comming":{"bl":[],"bbl":[]}},{"i":"317445","n":"钟村小学站","sni":"5541","si":"10011680","bus_comming":{"bl":[],"bbl":[]}},{"i":"317446","n":"钟韦路口站","sni":"5560","si":"10000156","bus_comming":{"bl":[],"bbl":[]}},{"i":"317405","n":"钟村市场站","sni":"5543","si":"10000138","bus_comming":{"bl":[],"bbl":[]}},{"i":"317447","n":"锦绣文化中心站","sni":"5584","si":"10009997","bus_comming":{"bl":[],"bbl":[]}},{"i":"317406","n":"钟村站","sni":"5547","si":"10000139","bus_comming":{"bl":[],"bbl":[]}},{"i":"317448","n":"汉溪路口站","sni":"3529","si":"10009992","bus_comming":{"bl":[],"bbl":[{"i":"1730992","si":"976084","t":"1"}]}},{"i":"317449","n":"钟二村站","sni":"5537","si":"11803","bus_comming":{"bl":[],"bbl":[]}},{"i":"317450","n":"隆辉站","sni":"5711","si":"10010000","bus_comming":{"bl":[],"bbl":[{"i":"1730485","si":"976082","t":"2"}]}},{"i":"317451","n":"祈福新村站","sni":"4562","si":"10010002","bus_comming":{"bl":[],"bbl":[]}},{"i":"317467","n":"金山谷花园站","sni":"5481","si":"10011205","bus_comming":{"bl":[],"bbl":[]}},{"i":"317452","n":"易兴工业区站","sni":"3070","si":"10001153","bus_comming":{"bl":[],"bbl":[]}},{"i":"317453","n":"富豪山庄站","sni":"2223","si":"10002818","bus_comming":{"bl":[],"bbl":[{"i":"1730183","si":"976084","t":"1"}]}},{"i":"317454","n":"左边村站","sni":"2357","si":"10010010","bus_comming":{"bl":[],"bbl":[]}},{"i":"317455","n":"大罗村（市广路）站","sni":"1000142","si":"10009980","bus_comming":{"bl":[],"bbl":[]}},{"i":"317456","n":"丹山村（桥兴大道）站","sni":"1000052","si":"10002374","bus_comming":{"bl":[],"bbl":[]}},{"i":"317457","n":"丹山桥站","sni":"470","si":"10002372","bus_comming":{"bl":[],"bbl":[]}},{"i":"317458","n":"百越广场东门（地铁市桥）站","sni":"1000451","si":"10009978","bus_comming":{"bl":[],"bbl":[]}},{"i":"317459","n":"市桥汽车站西门站","sni":"2390","si":"10027158","bus_comming":{"bl":[],"bbl":[]}},{"i":"317468","n":"星海公园站","sni":"3093","si":"10000972","bus_comming":{"bl":[],"bbl":[{"i":"1730169","si":"976084","t":"1"}]}},{"i":"317460","n":"交通大厦站","sni":"646","si":"10005633","bus_comming":{"bl":[],"bbl":[]}},{"i":"317461","n":"沙墟村站","sni":"3647","si":"10010003","bus_comming":{"bl":[],"bbl":[]}},{"i":"317469","n":"沙墟市场站","sni":"3646","si":"10004241","bus_comming":{"bl":[],"bbl":[]}},{"i":"317462","n":"党校路口站","sni":"837","si":"10002385","bus_comming":{"bl":[],"bbl":[]}},{"i":"317463","n":"罗家村站","sni":"1000432","si":"10003395","bus_comming":{"bl":[],"bbl":[]}},{"i":"317464","n":"石岗西村站","sni":"4469","si":"10010952","bus_comming":{"bl":[],"bbl":[]}},{"i":"317465","n":"石岗东村站","sni":"4460","si":"10004415","bus_comming":{"bl":[],"bbl":[]}},{"i":"317466","n":"美心苑站","sni":"4803","si":"10003510","bus_comming":{"bl":[],"bbl":[]}},{"i":"317487","n":"城市花园路口站","sni":"1690","si":"10002129","bus_comming":{"bl":[],"bbl":[]}},{"i":"317488","n":"傍江西村站","sni":"794","si":"10009180","bus_comming":{"bl":[],"bbl":[]}},{"i":"317489","n":"傍江东村站","sni":"793","si":"10024163","bus_comming":{"bl":[{"i":"1730178","si":"976084","t":"1"}],"bbl":[]}},{"i":"317470","n":"番禺汽车客运站总站","sni":"4256","si":"2699","bus_comming":{"bl":[{"i":"1730166","si":"976084","t":"1"}],"bbl":[]}},{"i":"317490","n":"雁洲路口站","sni":"5717","si":"10024025","bus_comming":{"bl":[],"bbl":[]}},{"i":"317491","n":"东湖洲花园C站","sni":"1000351","si":"10024029","bus_comming":{"bl":[],"bbl":[]}},{"i":"317492","n":"东湖洲花园A站","sni":"1000709","si":"10024033","bus_comming":{"bl":[],"bbl":[{"i":"1730469","si":"976082","t":"2"}]}},{"i":"317493","n":"雁洲村总站","sni":"5716","si":"10205","bus_comming":{"bl":[],"bbl":[]}}]}
         */

        private BusBean bus;

        public BusBean getBus() {
            return bus;
        }

        public void setBus(BusBean bus) {
            this.bus = bus;
        }

        public static class BusBean {
            /**
             * rn : 番97路
             * d : 1
             * c : 70970
             * ft : 0700
             * lt : 2030
             * l : [{"i":"317428","n":"北滘公园站","sni":"13028","si":"15653","bus_comming":{"bl":[],"bbl":[]}},{"i":"317429","n":"北滘医院站","sni":"13033","si":"15654","bus_comming":{"bl":[],"bbl":[]}},{"i":"317472","n":"林头西站","sni":"3223","si":"12791","bus_comming":{"bl":[],"bbl":[]}},{"i":"317430","n":"林头村站","sni":"13020","si":"15655","bus_comming":{"bl":[],"bbl":[]}},{"i":"317431","n":"君兰高尔夫生活村站","sni":"13034","si":"15656","bus_comming":{"bl":[],"bbl":[{"i":"1730417","si":"976084","t":"1"}]}},{"i":"317432","n":"碧桂园","sni":"11165","si":"15009","bus_comming":{"bl":[],"bbl":[]}},{"i":"317400","n":"陈村路口站","sni":"5699","si":"12133","bus_comming":{"bl":[],"bbl":[]}},{"i":"317433","n":"南涌站","sni":"1335","si":"13082","bus_comming":{"bl":[],"bbl":[]}},{"i":"317434","n":"顺联广场站","sni":"5768","si":"12789","bus_comming":{"bl":[],"bbl":[]}},{"i":"317401","n":"陈村医院(新君悦酒店)","sni":"5697","si":"13074","bus_comming":{"bl":[],"bbl":[]}},{"i":"317435","n":"陈村客运站","sni":"5698","si":"13073","bus_comming":{"bl":[],"bbl":[]}},{"i":"317436","n":"广珠路碧江立交站","sni":"2586","si":"13078","bus_comming":{"bl":[],"bbl":[]}},{"i":"317402","n":"广珠路碧江站","sni":"2587","si":"12795","bus_comming":{"bl":[],"bbl":[]}},{"i":"317437","n":"碧桂西苑站","sni":"4545","si":"13077","bus_comming":{"bl":[],"bbl":[]}},{"i":"317438","n":"碧桂园天玺湾站","sni":"4543","si":"12495","bus_comming":{"bl":[],"bbl":[{"i":"3001520","si":"976084","t":"1"}]}},{"i":"317495","n":"都那村站","sni":"5451","si":"10024516","bus_comming":{"bl":[],"bbl":[]}},{"i":"317403","n":"碧桂东苑站","sni":"4542","si":"10024519","bus_comming":{"bl":[],"bbl":[]}},{"i":"317439","n":"屏二村站","sni":"2292","si":"10024514","bus_comming":{"bl":[],"bbl":[]}},{"i":"317440","n":"钟村交警中队站","sni":"5540","si":"10024512","bus_comming":{"bl":[],"bbl":[]}},{"i":"317404","n":"屏一村站","sni":"2290","si":"10024507","bus_comming":{"bl":[],"bbl":[]}},{"i":"317441","n":"钟村文化广场（钟屏路）站","sni":"1000064","si":"10024504","bus_comming":{"bl":[],"bbl":[]}},{"i":"317442","n":"锦绣生态园南门站","sni":"5586","si":"10024501","bus_comming":{"bl":[],"bbl":[]}},{"i":"317443","n":"大夫山公园北门站","sni":"1836","si":"10002215","bus_comming":{"bl":[],"bbl":[]}},{"i":"317444","n":"锦绣生态园站","sni":"5587","si":"10005784","bus_comming":{"bl":[],"bbl":[]}},{"i":"317445","n":"钟村小学站","sni":"5541","si":"10011680","bus_comming":{"bl":[],"bbl":[]}},{"i":"317446","n":"钟韦路口站","sni":"5560","si":"10000156","bus_comming":{"bl":[],"bbl":[]}},{"i":"317405","n":"钟村市场站","sni":"5543","si":"10000138","bus_comming":{"bl":[],"bbl":[]}},{"i":"317447","n":"锦绣文化中心站","sni":"5584","si":"10009997","bus_comming":{"bl":[],"bbl":[]}},{"i":"317406","n":"钟村站","sni":"5547","si":"10000139","bus_comming":{"bl":[],"bbl":[]}},{"i":"317448","n":"汉溪路口站","sni":"3529","si":"10009992","bus_comming":{"bl":[],"bbl":[{"i":"1730992","si":"976084","t":"1"}]}},{"i":"317449","n":"钟二村站","sni":"5537","si":"11803","bus_comming":{"bl":[],"bbl":[]}},{"i":"317450","n":"隆辉站","sni":"5711","si":"10010000","bus_comming":{"bl":[],"bbl":[{"i":"1730485","si":"976082","t":"2"}]}},{"i":"317451","n":"祈福新村站","sni":"4562","si":"10010002","bus_comming":{"bl":[],"bbl":[]}},{"i":"317467","n":"金山谷花园站","sni":"5481","si":"10011205","bus_comming":{"bl":[],"bbl":[]}},{"i":"317452","n":"易兴工业区站","sni":"3070","si":"10001153","bus_comming":{"bl":[],"bbl":[]}},{"i":"317453","n":"富豪山庄站","sni":"2223","si":"10002818","bus_comming":{"bl":[],"bbl":[{"i":"1730183","si":"976084","t":"1"}]}},{"i":"317454","n":"左边村站","sni":"2357","si":"10010010","bus_comming":{"bl":[],"bbl":[]}},{"i":"317455","n":"大罗村（市广路）站","sni":"1000142","si":"10009980","bus_comming":{"bl":[],"bbl":[]}},{"i":"317456","n":"丹山村（桥兴大道）站","sni":"1000052","si":"10002374","bus_comming":{"bl":[],"bbl":[]}},{"i":"317457","n":"丹山桥站","sni":"470","si":"10002372","bus_comming":{"bl":[],"bbl":[]}},{"i":"317458","n":"百越广场东门（地铁市桥）站","sni":"1000451","si":"10009978","bus_comming":{"bl":[],"bbl":[]}},{"i":"317459","n":"市桥汽车站西门站","sni":"2390","si":"10027158","bus_comming":{"bl":[],"bbl":[]}},{"i":"317468","n":"星海公园站","sni":"3093","si":"10000972","bus_comming":{"bl":[],"bbl":[{"i":"1730169","si":"976084","t":"1"}]}},{"i":"317460","n":"交通大厦站","sni":"646","si":"10005633","bus_comming":{"bl":[],"bbl":[]}},{"i":"317461","n":"沙墟村站","sni":"3647","si":"10010003","bus_comming":{"bl":[],"bbl":[]}},{"i":"317469","n":"沙墟市场站","sni":"3646","si":"10004241","bus_comming":{"bl":[],"bbl":[]}},{"i":"317462","n":"党校路口站","sni":"837","si":"10002385","bus_comming":{"bl":[],"bbl":[]}},{"i":"317463","n":"罗家村站","sni":"1000432","si":"10003395","bus_comming":{"bl":[],"bbl":[]}},{"i":"317464","n":"石岗西村站","sni":"4469","si":"10010952","bus_comming":{"bl":[],"bbl":[]}},{"i":"317465","n":"石岗东村站","sni":"4460","si":"10004415","bus_comming":{"bl":[],"bbl":[]}},{"i":"317466","n":"美心苑站","sni":"4803","si":"10003510","bus_comming":{"bl":[],"bbl":[]}},{"i":"317487","n":"城市花园路口站","sni":"1690","si":"10002129","bus_comming":{"bl":[],"bbl":[]}},{"i":"317488","n":"傍江西村站","sni":"794","si":"10009180","bus_comming":{"bl":[],"bbl":[]}},{"i":"317489","n":"傍江东村站","sni":"793","si":"10024163","bus_comming":{"bl":[{"i":"1730178","si":"976084","t":"1"}],"bbl":[]}},{"i":"317470","n":"番禺汽车客运站总站","sni":"4256","si":"2699","bus_comming":{"bl":[{"i":"1730166","si":"976084","t":"1"}],"bbl":[]}},{"i":"317490","n":"雁洲路口站","sni":"5717","si":"10024025","bus_comming":{"bl":[],"bbl":[]}},{"i":"317491","n":"东湖洲花园C站","sni":"1000351","si":"10024029","bus_comming":{"bl":[],"bbl":[]}},{"i":"317492","n":"东湖洲花园A站","sni":"1000709","si":"10024033","bus_comming":{"bl":[],"bbl":[{"i":"1730469","si":"976082","t":"2"}]}},{"i":"317493","n":"雁洲村总站","sni":"5716","si":"10205","bus_comming":{"bl":[],"bbl":[]}}]
             */

            private String rn;
            private String d;
            private String c;
            private String ft;
            private String lt;
            private List<LBean> l;

            public String getRn() {
                return rn;
            }

            public void setRn(String rn) {
                this.rn = rn;
            }

            public String getD() {
                return d;
            }

            public void setD(String d) {
                this.d = d;
            }

            public String getC() {
                return c;
            }

            public void setC(String c) {
                this.c = c;
            }

            public String getFt() {
                return ft;
            }

            public void setFt(String ft) {
                this.ft = ft;
            }

            public String getLt() {
                return lt;
            }

            public void setLt(String lt) {
                this.lt = lt;
            }

            public List<LBean> getL() {
                return l;
            }

            public void setL(List<LBean> l) {
                this.l = l;
            }

            public static class LBean {
                /**
                 * i : 317428
                 * n : 北滘公园站
                 * sni : 13028
                 * si : 15653
                 * bus_comming : {"bl":[],"bbl":[]}
                 */

                private String i;
                private String n;
                private String sni;
                private String si;
                private BusCommingBean bus_comming;

                public String getI() {
                    return i;
                }

                public void setI(String i) {
                    this.i = i;
                }

                public String getN() {
                    return n;
                }

                public void setN(String n) {
                    this.n = n;
                }

                public String getSni() {
                    return sni;
                }

                public void setSni(String sni) {
                    this.sni = sni;
                }

                public String getSi() {
                    return si;
                }

                public void setSi(String si) {
                    this.si = si;
                }

                public BusCommingBean getBus_comming() {
                    return bus_comming;
                }

                public void setBus_comming(BusCommingBean bus_comming) {
                    this.bus_comming = bus_comming;
                }

                public static class BusCommingBean {
                    private List<?> bl;
                    private List<?> bbl;

                    public List<?> getBl() {
                        return bl;
                    }

                    public void setBl(List<?> bl) {
                        this.bl = bl;
                    }

                    public List<?> getBbl() {
                        return bbl;
                    }

                    public void setBbl(List<?> bbl) {
                        this.bbl = bbl;
                    }
                }
            }
//        }
    }
}
