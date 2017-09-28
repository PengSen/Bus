package com.ob.bus.model;

import java.util.List;

/**
 * Created by pengs on 2017/8/23.
 */

public class DataBean {

    /**
     * bus : {"rn":"番97路","d":"0","c":"70970","ft":"0600","lt":"2030","l":[{"i":"317367","n":"雁洲村总站","sni":"5716","si":"10205","bus_comming":{"bl":[],"bbl":[]}},{"i":"317368","n":"东湖洲花园A站","sni":"1000709","si":"10024032","bus_comming":{"bl":[],"bbl":[]}},{"i":"317369","n":"东湖洲花园C站","sni":"1000351","si":"10024027","bus_comming":{"bl":[],"bbl":[]}},{"i":"317370","n":"雁洲路口站","sni":"5717","si":"10024024","bus_comming":{"bl":[],"bbl":[]}},{"i":"317387","n":"番禺汽车客运站","sni":"4255","si":"10002697","bus_comming":{"bl":[],"bbl":[]}},{"i":"317371","n":"傍江西村站","sni":"794","si":"10009786","bus_comming":{"bl":[],"bbl":[{"i":"1730183","si":"976085","t":"1"}]}},{"i":"317372","n":"城市花园路口站","sni":"1690","si":"10002128","bus_comming":{"bl":[],"bbl":[]}},{"i":"317373","n":"美心苑站","sni":"4803","si":"10003509","bus_comming":{"bl":[],"bbl":[]}},{"i":"317374","n":"石岗东村站","sni":"4460","si":"10004414","bus_comming":{"bl":[],"bbl":[]}},{"i":"317388","n":"石岗西村站","sni":"4469","si":"10010953","bus_comming":{"bl":[],"bbl":[]}},{"i":"317389","n":"罗家村站","sni":"1000432","si":"10003396","bus_comming":{"bl":[],"bbl":[]}},{"i":"317375","n":"党校路口站","sni":"837","si":"10002386","bus_comming":{"bl":[],"bbl":[]}},{"i":"317376","n":"沙墟市场站","sni":"3646","si":"10004240","bus_comming":{"bl":[],"bbl":[]}},{"i":"317377","n":"沙墟村站","sni":"3647","si":"10024795","bus_comming":{"bl":[],"bbl":[]}},{"i":"317378","n":"交通大厦站","sni":"646","si":"10005632","bus_comming":{"bl":[],"bbl":[]}},{"i":"317379","n":"星海公园站","sni":"3093","si":"10000973","bus_comming":{"bl":[],"bbl":[]}},{"i":"317390","n":"番禺宾馆站","sni":"4252","si":"10021212","bus_comming":{"bl":[],"bbl":[]}},{"i":"317380","n":"市桥汽车站西门站","sni":"2390","si":"10010005","bus_comming":{"bl":[],"bbl":[]}},{"i":"317381","n":"百越广场东门（地铁市桥）站","sni":"1000451","si":"10009977","bus_comming":{"bl":[],"bbl":[{"i":"1730343","si":"976085","t":"1"}]}},{"i":"317382","n":"丹山桥站","sni":"470","si":"10002371","bus_comming":{"bl":[],"bbl":[]}},{"i":"317383","n":"丹山村（桥兴大道）站","sni":"1000052","si":"10002373","bus_comming":{"bl":[],"bbl":[]}},{"i":"317384","n":"大罗村（市广路）站","sni":"1000142","si":"10024814","bus_comming":{"bl":[],"bbl":[]}},{"i":"317385","n":"左边村站","sni":"2357","si":"10010009","bus_comming":{"bl":[],"bbl":[]}},{"i":"317386","n":"富豪山庄站","sni":"2223","si":"10002817","bus_comming":{"bl":[],"bbl":[]}},{"i":"317391","n":"金山谷花园站","sni":"5481","si":"10011419","bus_comming":{"bl":[],"bbl":[]}},{"i":"317392","n":"祈福新村站","sni":"4562","si":"10010001","bus_comming":{"bl":[],"bbl":[]}},{"i":"317407","n":"隆辉站","sni":"5711","si":"10009999","bus_comming":{"bl":[],"bbl":[]}},{"i":"317408","n":"汉溪路口站","sni":"3529","si":"10009991","bus_comming":{"bl":[],"bbl":[]}},{"i":"317409","n":"钟村站","sni":"5547","si":"10000140","bus_comming":{"bl":[{"i":"1730482","si":"976083","t":"2"}],"bbl":[]}},{"i":"317410","n":"锦绣文化中心站","sni":"5584","si":"10009998","bus_comming":{"bl":[],"bbl":[]}},{"i":"317393","n":"钟村市场站","sni":"5543","si":"10000137","bus_comming":{"bl":[],"bbl":[]}},{"i":"317411","n":"钟韦路口站","sni":"5560","si":"10000157","bus_comming":{"bl":[],"bbl":[]}},{"i":"317412","n":"锦绣生态园站","sni":"5587","si":"10005785","bus_comming":{"bl":[],"bbl":[]}},{"i":"317413","n":"大夫山公园北门站","sni":"1836","si":"10002215","bus_comming":{"bl":[],"bbl":[]}},{"i":"317414","n":"锦绣生态园南门站","sni":"5586","si":"10024501","bus_comming":{"bl":[],"bbl":[]}},{"i":"317415","n":"钟村文化广场（钟屏路）站","sni":"1000064","si":"10024503","bus_comming":{"bl":[],"bbl":[{"i":"1730178","si":"976085","t":"1"}]}},{"i":"317416","n":"屏一村站","sni":"2290","si":"10026686","bus_comming":{"bl":[],"bbl":[]}},{"i":"317394","n":"钟村交警中队站","sni":"5540","si":"10026688","bus_comming":{"bl":[],"bbl":[]}},{"i":"317417","n":"屏二村站","sni":"2292","si":"10026690","bus_comming":{"bl":[],"bbl":[{"i":"1730469","si":"976083","t":"2"}]}},{"i":"317418","n":"碧桂东苑站","sni":"4542","si":"10024519","bus_comming":{"bl":[],"bbl":[]}},{"i":"317494","n":"都那村站","sni":"5451","si":"10024517","bus_comming":{"bl":[],"bbl":[]}},{"i":"317419","n":"碧桂园天玺湾站","sni":"4543","si":"12495","bus_comming":{"bl":[],"bbl":[]}},{"i":"317420","n":"广珠城轨碧江站","sni":"2583","si":"13989","bus_comming":{"bl":[],"bbl":[{"i":"3000845","si":"976085","t":"1"}]}},{"i":"317421","n":"广珠路碧江站","sni":"2587","si":"12787","bus_comming":{"bl":[],"bbl":[]}},{"i":"317422","n":"广珠路碧江立交站","sni":"2586","si":"13079","bus_comming":{"bl":[],"bbl":[]}},{"i":"317395","n":"陈村客运站","sni":"5698","si":"13072","bus_comming":{"bl":[],"bbl":[]}},{"i":"317396","n":"陈村医院(新君悦酒店)","sni":"5697","si":"13075","bus_comming":{"bl":[],"bbl":[]}},{"i":"317423","n":"顺联广场站","sni":"5768","si":"12790","bus_comming":{"bl":[],"bbl":[]}},{"i":"317424","n":"南涌站","sni":"1335","si":"13083","bus_comming":{"bl":[],"bbl":[]}},{"i":"317425","n":"陈村路口站","sni":"5699","si":"12134","bus_comming":{"bl":[],"bbl":[]}},{"i":"317426","n":"碧桂园","sni":"11165","si":"15010","bus_comming":{"bl":[],"bbl":[]}},{"i":"317397","n":"君兰高尔夫生活村站","sni":"13034","si":"15650","bus_comming":{"bl":[],"bbl":[]}},{"i":"317427","n":"林头村站","sni":"13020","si":"15651","bus_comming":{"bl":[],"bbl":[]}},{"i":"317471","n":"林头西站","sni":"3223","si":"12792","bus_comming":{"bl":[],"bbl":[]}},{"i":"317398","n":"北滘医院站","sni":"13033","si":"15652","bus_comming":{"bl":[],"bbl":[]}},{"i":"317399","n":"北滘公园站","sni":"13028","si":"15653","bus_comming":{"bl":[],"bbl":[]}}]}
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
         * d : 0
         * c : 70970
         * ft : 0600
         * lt : 2030
         * l : [{"i":"317367","n":"雁洲村总站","sni":"5716","si":"10205","bus_comming":{"bl":[],"bbl":[]}},{"i":"317368","n":"东湖洲花园A站","sni":"1000709","si":"10024032","bus_comming":{"bl":[],"bbl":[]}},{"i":"317369","n":"东湖洲花园C站","sni":"1000351","si":"10024027","bus_comming":{"bl":[],"bbl":[]}},{"i":"317370","n":"雁洲路口站","sni":"5717","si":"10024024","bus_comming":{"bl":[],"bbl":[]}},{"i":"317387","n":"番禺汽车客运站","sni":"4255","si":"10002697","bus_comming":{"bl":[],"bbl":[]}},{"i":"317371","n":"傍江西村站","sni":"794","si":"10009786","bus_comming":{"bl":[],"bbl":[{"i":"1730183","si":"976085","t":"1"}]}},{"i":"317372","n":"城市花园路口站","sni":"1690","si":"10002128","bus_comming":{"bl":[],"bbl":[]}},{"i":"317373","n":"美心苑站","sni":"4803","si":"10003509","bus_comming":{"bl":[],"bbl":[]}},{"i":"317374","n":"石岗东村站","sni":"4460","si":"10004414","bus_comming":{"bl":[],"bbl":[]}},{"i":"317388","n":"石岗西村站","sni":"4469","si":"10010953","bus_comming":{"bl":[],"bbl":[]}},{"i":"317389","n":"罗家村站","sni":"1000432","si":"10003396","bus_comming":{"bl":[],"bbl":[]}},{"i":"317375","n":"党校路口站","sni":"837","si":"10002386","bus_comming":{"bl":[],"bbl":[]}},{"i":"317376","n":"沙墟市场站","sni":"3646","si":"10004240","bus_comming":{"bl":[],"bbl":[]}},{"i":"317377","n":"沙墟村站","sni":"3647","si":"10024795","bus_comming":{"bl":[],"bbl":[]}},{"i":"317378","n":"交通大厦站","sni":"646","si":"10005632","bus_comming":{"bl":[],"bbl":[]}},{"i":"317379","n":"星海公园站","sni":"3093","si":"10000973","bus_comming":{"bl":[],"bbl":[]}},{"i":"317390","n":"番禺宾馆站","sni":"4252","si":"10021212","bus_comming":{"bl":[],"bbl":[]}},{"i":"317380","n":"市桥汽车站西门站","sni":"2390","si":"10010005","bus_comming":{"bl":[],"bbl":[]}},{"i":"317381","n":"百越广场东门（地铁市桥）站","sni":"1000451","si":"10009977","bus_comming":{"bl":[],"bbl":[{"i":"1730343","si":"976085","t":"1"}]}},{"i":"317382","n":"丹山桥站","sni":"470","si":"10002371","bus_comming":{"bl":[],"bbl":[]}},{"i":"317383","n":"丹山村（桥兴大道）站","sni":"1000052","si":"10002373","bus_comming":{"bl":[],"bbl":[]}},{"i":"317384","n":"大罗村（市广路）站","sni":"1000142","si":"10024814","bus_comming":{"bl":[],"bbl":[]}},{"i":"317385","n":"左边村站","sni":"2357","si":"10010009","bus_comming":{"bl":[],"bbl":[]}},{"i":"317386","n":"富豪山庄站","sni":"2223","si":"10002817","bus_comming":{"bl":[],"bbl":[]}},{"i":"317391","n":"金山谷花园站","sni":"5481","si":"10011419","bus_comming":{"bl":[],"bbl":[]}},{"i":"317392","n":"祈福新村站","sni":"4562","si":"10010001","bus_comming":{"bl":[],"bbl":[]}},{"i":"317407","n":"隆辉站","sni":"5711","si":"10009999","bus_comming":{"bl":[],"bbl":[]}},{"i":"317408","n":"汉溪路口站","sni":"3529","si":"10009991","bus_comming":{"bl":[],"bbl":[]}},{"i":"317409","n":"钟村站","sni":"5547","si":"10000140","bus_comming":{"bl":[{"i":"1730482","si":"976083","t":"2"}],"bbl":[]}},{"i":"317410","n":"锦绣文化中心站","sni":"5584","si":"10009998","bus_comming":{"bl":[],"bbl":[]}},{"i":"317393","n":"钟村市场站","sni":"5543","si":"10000137","bus_comming":{"bl":[],"bbl":[]}},{"i":"317411","n":"钟韦路口站","sni":"5560","si":"10000157","bus_comming":{"bl":[],"bbl":[]}},{"i":"317412","n":"锦绣生态园站","sni":"5587","si":"10005785","bus_comming":{"bl":[],"bbl":[]}},{"i":"317413","n":"大夫山公园北门站","sni":"1836","si":"10002215","bus_comming":{"bl":[],"bbl":[]}},{"i":"317414","n":"锦绣生态园南门站","sni":"5586","si":"10024501","bus_comming":{"bl":[],"bbl":[]}},{"i":"317415","n":"钟村文化广场（钟屏路）站","sni":"1000064","si":"10024503","bus_comming":{"bl":[],"bbl":[{"i":"1730178","si":"976085","t":"1"}]}},{"i":"317416","n":"屏一村站","sni":"2290","si":"10026686","bus_comming":{"bl":[],"bbl":[]}},{"i":"317394","n":"钟村交警中队站","sni":"5540","si":"10026688","bus_comming":{"bl":[],"bbl":[]}},{"i":"317417","n":"屏二村站","sni":"2292","si":"10026690","bus_comming":{"bl":[],"bbl":[{"i":"1730469","si":"976083","t":"2"}]}},{"i":"317418","n":"碧桂东苑站","sni":"4542","si":"10024519","bus_comming":{"bl":[],"bbl":[]}},{"i":"317494","n":"都那村站","sni":"5451","si":"10024517","bus_comming":{"bl":[],"bbl":[]}},{"i":"317419","n":"碧桂园天玺湾站","sni":"4543","si":"12495","bus_comming":{"bl":[],"bbl":[]}},{"i":"317420","n":"广珠城轨碧江站","sni":"2583","si":"13989","bus_comming":{"bl":[],"bbl":[{"i":"3000845","si":"976085","t":"1"}]}},{"i":"317421","n":"广珠路碧江站","sni":"2587","si":"12787","bus_comming":{"bl":[],"bbl":[]}},{"i":"317422","n":"广珠路碧江立交站","sni":"2586","si":"13079","bus_comming":{"bl":[],"bbl":[]}},{"i":"317395","n":"陈村客运站","sni":"5698","si":"13072","bus_comming":{"bl":[],"bbl":[]}},{"i":"317396","n":"陈村医院(新君悦酒店)","sni":"5697","si":"13075","bus_comming":{"bl":[],"bbl":[]}},{"i":"317423","n":"顺联广场站","sni":"5768","si":"12790","bus_comming":{"bl":[],"bbl":[]}},{"i":"317424","n":"南涌站","sni":"1335","si":"13083","bus_comming":{"bl":[],"bbl":[]}},{"i":"317425","n":"陈村路口站","sni":"5699","si":"12134","bus_comming":{"bl":[],"bbl":[]}},{"i":"317426","n":"碧桂园","sni":"11165","si":"15010","bus_comming":{"bl":[],"bbl":[]}},{"i":"317397","n":"君兰高尔夫生活村站","sni":"13034","si":"15650","bus_comming":{"bl":[],"bbl":[]}},{"i":"317427","n":"林头村站","sni":"13020","si":"15651","bus_comming":{"bl":[],"bbl":[]}},{"i":"317471","n":"林头西站","sni":"3223","si":"12792","bus_comming":{"bl":[],"bbl":[]}},{"i":"317398","n":"北滘医院站","sni":"13033","si":"15652","bus_comming":{"bl":[],"bbl":[]}},{"i":"317399","n":"北滘公园站","sni":"13028","si":"15653","bus_comming":{"bl":[],"bbl":[]}}]
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
             * i : 317367
             * n : 雁洲村总站
             * sni : 5716
             * si : 10205
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
    }

}
