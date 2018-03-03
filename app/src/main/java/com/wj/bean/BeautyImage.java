package com.wj.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/3/3.
 */

public class BeautyImage {
    /**
     * showapi_res_error :
     * showapi_res_code : 0
     * showapi_res_body : {"newslist":[{"title":"☆成熟女人\u2026\u2026[小楼听雨 林楼雨（告别篇） 56p]\u2026\u2026第968辑","picUrl":"http://image.hnol.net/c/2018-03/03/13/201803031312083571-1559530.jpg","description":"华声美女","ctime":"2018-03-03 14:00","url":"http://bbs.voc.com.cn/mm/meinv-8255100-0-1.html"},{"title":"☆成熟女人\u2026\u2026[我的小紫 简嘉莹 95p]\u2026\u2026第969辑","picUrl":"http://image.hnol.net/c/2018-03/03/13/20180303133337751-1559530.jpg","description":"华声美女","ctime":"2018-03-03 14:00","url":"http://bbs.voc.com.cn/mm/meinv-8255114-0-1.html"},{"title":"美女656","picUrl":"http://image.hnol.net/c/2018-03/03/10/20180303100521871-3030167.jpg","description":"华声美女","ctime":"2018-03-03 11:00","url":"http://bbs.voc.com.cn/mm/meinv-8254939-0-1.html"},{"title":"I邻家女孩\u2026\u2026[元宵佳节 张菁菁 133p]\u2026\u2026第1091辑","picUrl":"http://image.hnol.net/c/2018-03/02/22/201803022211582551-1559530.jpg","description":"华声美女","ctime":"2018-03-02 23:00","url":"http://bbs.voc.com.cn/mm/meinv-8254689-0-1.html"},{"title":"小陶虹散发优雅气质卷发知性迷人 [贴图]","picUrl":"http://image.hnol.net/c/2018-03/02/19/20180302194736631-3194050.jpg","description":"华声美女","ctime":"2018-03-02 20:00","url":"http://bbs.voc.com.cn/mm/meinv-8254570-0-1.html"},{"title":"清纯","picUrl":"http://image.hnol.net/c/2018-03/02/16/201803021640428311-3030167.jpg","description":"华声美女","ctime":"2018-03-02 18:00","url":"http://bbs.voc.com.cn/mm/meinv-8254371-0-1.html"},{"title":"诗画情歌","picUrl":"http://image.hnol.net/c/2018-03/02/09/201803020957231971-239867.jpg","description":"华声美女","ctime":"2018-03-02 11:00","url":"http://bbs.voc.com.cn/mm/meinv-8253702-0-1.html"},{"title":"☆成熟女人\u2026\u2026[再作TD GoGo 125p]\u2026\u2026第967辑","picUrl":"http://image.hnol.net/c/2018-03/01/23/201803012335376121-1559530.jpg","description":"华声美女","ctime":"2018-03-02 00:00","url":"http://bbs.voc.com.cn/mm/meinv-8253484-0-1.html"},{"title":"☆成熟女人\u2026\u2026[阳光佳丽 庄晴雅 160p]\u2026\u2026第966辑","picUrl":"http://image.hnol.net/c/2018-03/01/21/201803012149565451-1559530.jpg","description":"华声美女","ctime":"2018-03-01 23:00","url":"http://bbs.voc.com.cn/mm/meinv-8253438-0-1.html"},{"title":"☆成熟女人\u2026\u2026[跳丸日月 王小丸 165p]\u2026\u2026第965辑","picUrl":"http://image.hnol.net/c/2018-03/01/21/201803012110499591-1559530.jpg","description":"华声美女","ctime":"2018-03-01 22:00","url":"http://bbs.voc.com.cn/mm/meinv-8253408-0-1.html"}],"code":200,"msg":"success"}
     */

    private String showapi_res_error;
    private int showapi_res_code;
    private ShowapiResBodyBean showapi_res_body;

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * newslist : [{"title":"☆成熟女人\u2026\u2026[小楼听雨 林楼雨（告别篇） 56p]\u2026\u2026第968辑","picUrl":"http://image.hnol.net/c/2018-03/03/13/201803031312083571-1559530.jpg","description":"华声美女","ctime":"2018-03-03 14:00","url":"http://bbs.voc.com.cn/mm/meinv-8255100-0-1.html"},{"title":"☆成熟女人\u2026\u2026[我的小紫 简嘉莹 95p]\u2026\u2026第969辑","picUrl":"http://image.hnol.net/c/2018-03/03/13/20180303133337751-1559530.jpg","description":"华声美女","ctime":"2018-03-03 14:00","url":"http://bbs.voc.com.cn/mm/meinv-8255114-0-1.html"},{"title":"美女656","picUrl":"http://image.hnol.net/c/2018-03/03/10/20180303100521871-3030167.jpg","description":"华声美女","ctime":"2018-03-03 11:00","url":"http://bbs.voc.com.cn/mm/meinv-8254939-0-1.html"},{"title":"I邻家女孩\u2026\u2026[元宵佳节 张菁菁 133p]\u2026\u2026第1091辑","picUrl":"http://image.hnol.net/c/2018-03/02/22/201803022211582551-1559530.jpg","description":"华声美女","ctime":"2018-03-02 23:00","url":"http://bbs.voc.com.cn/mm/meinv-8254689-0-1.html"},{"title":"小陶虹散发优雅气质卷发知性迷人 [贴图]","picUrl":"http://image.hnol.net/c/2018-03/02/19/20180302194736631-3194050.jpg","description":"华声美女","ctime":"2018-03-02 20:00","url":"http://bbs.voc.com.cn/mm/meinv-8254570-0-1.html"},{"title":"清纯","picUrl":"http://image.hnol.net/c/2018-03/02/16/201803021640428311-3030167.jpg","description":"华声美女","ctime":"2018-03-02 18:00","url":"http://bbs.voc.com.cn/mm/meinv-8254371-0-1.html"},{"title":"诗画情歌","picUrl":"http://image.hnol.net/c/2018-03/02/09/201803020957231971-239867.jpg","description":"华声美女","ctime":"2018-03-02 11:00","url":"http://bbs.voc.com.cn/mm/meinv-8253702-0-1.html"},{"title":"☆成熟女人\u2026\u2026[再作TD GoGo 125p]\u2026\u2026第967辑","picUrl":"http://image.hnol.net/c/2018-03/01/23/201803012335376121-1559530.jpg","description":"华声美女","ctime":"2018-03-02 00:00","url":"http://bbs.voc.com.cn/mm/meinv-8253484-0-1.html"},{"title":"☆成熟女人\u2026\u2026[阳光佳丽 庄晴雅 160p]\u2026\u2026第966辑","picUrl":"http://image.hnol.net/c/2018-03/01/21/201803012149565451-1559530.jpg","description":"华声美女","ctime":"2018-03-01 23:00","url":"http://bbs.voc.com.cn/mm/meinv-8253438-0-1.html"},{"title":"☆成熟女人\u2026\u2026[跳丸日月 王小丸 165p]\u2026\u2026第965辑","picUrl":"http://image.hnol.net/c/2018-03/01/21/201803012110499591-1559530.jpg","description":"华声美女","ctime":"2018-03-01 22:00","url":"http://bbs.voc.com.cn/mm/meinv-8253408-0-1.html"}]
         * code : 200
         * msg : success
         */

        private int code;
        private String msg;
        private List<NewslistBean> newslist;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public List<NewslistBean> getNewslist() {
            return newslist;
        }

        public void setNewslist(List<NewslistBean> newslist) {
            this.newslist = newslist;
        }

        public static class NewslistBean {
            /**
             * title : ☆成熟女人……[小楼听雨 林楼雨（告别篇） 56p]……第968辑
             * picUrl : http://image.hnol.net/c/2018-03/03/13/201803031312083571-1559530.jpg
             * description : 华声美女
             * ctime : 2018-03-03 14:00
             * url : http://bbs.voc.com.cn/mm/meinv-8255100-0-1.html
             */

            private String title;
            private String picUrl;
            private String description;
            private String ctime;
            private String url;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getCtime() {
                return ctime;
            }

            public void setCtime(String ctime) {
                this.ctime = ctime;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
