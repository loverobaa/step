#!/usr/bin/python
# -*- coding: UTF-8 -*-
#urllib2 在py3中已经拆分成: urllib.request urllib.error等其它单独模块
#urllib5 据说已经拥有所有模块,但是未测试成功
#https://www.cnblogs.com/feng18/p/5749045.html
# from urllib.request import urlopen
import urllib.request
import urllib.parse

# 对req请求添加header和参数
req = urllib.request.Request("http://www.baidu.com")
# req.add_header("user-agent", "Mozilla/5.0")
req.add_header("Referer", "http://www.python.org/")
rep = urllib.request.urlopen(req)
page = rep.read()
print(rep.getcode())
print(len(page))
print(page.decode("utf8"))

# print
# "第三种方法"
# cookie = cookielib.CookieJar()
# # 加入urllib处理cookie的能力
# opener = urllib.build_opener(urllib.HTTPCookieProcessor(cookie))
# urllib.install_opener(opener)
# response3 = urllib.urlopen(url)
# print
# response3.getcode()
# print
# len(response3.read())
# print
# cookie