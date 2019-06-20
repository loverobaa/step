# https://www.cnblogs.com/mmbbflyer/p/6340375.html
# https://www.cnblogs.com/jjj-fly/p/6855924.html

import urllib.request
import urllib.parse

class TbSpider:
    def __init__(self,tieba_name):
        self.tieba_name = tieba_name
        self.url_tmp = "http://tieba.baidu.com/f?kw=" + tieba_name + "&ie=utf-8&pn={}"

    def get_url_list(self):
        # url_list = []
        # for i in range(2):
        #     url_list.append(self.url_tmp.format(i * 50))
        # return url_list
        return [self.url_tmp.format(i * 50) for i in range(6)]

    def get_url_content(self,url):
        req = urllib.request.Request(url)
        req.add_header("user-agent", "Mozilla/5.0")
        rep = urllib.request.urlopen(req)
        # 默认read返回byte,所以要转成str才能保存
        content = rep.read().decode("utf-8")
        rep.close()
        return content

    def post_url_content(self,html_str,page_num):
        file_path = "{}-第{}页.html".format(self.tieba_name,page_num)
        # 写到本地
        with open(file_path, "w", encoding="utf-8") as file:
            file.write(html_str)
            file.close()

    def run(self):
        url_list= self.get_url_list()
        for url in url_list:
            html_str = self.get_url_content(url)
            page_num = url_list.index(url) + 1
            self.post_url_content(html_str,page_num)

if __name__ == '__main__':
    tb_spider = TbSpider("java")
    tb_spider.run()
