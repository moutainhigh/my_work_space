# # coding:utf-8 #
# import json
# import re
# import time
# import urllib.parse
# import urllib.request
#
# from bs4 import BeautifulSoup
#
#
# def timeToStampe(dt):
#     timeArray = time.strptime(dt, "%Y-%m-%d %H:%M:%S")
#     # 转换成时间戳
#     timestamp = time.mktime(timeArray)
#     return timestamp
#
#
# def getTimeFromStampe(timestamp):
#     time_local = time.localtime(timestamp)
#     # 转换成新的时间格式(2016-05-05 20:28:54)
#     dt = time.strftime("%Y-%m-%d %H:%M:%S", time_local)
#     return dt
#
#
# def getDatas(index):
#     url = 'http://www.qukuaiwang.com.cn/News/index/p/'+str(index)+'.html'
#     response_result = urllib.request.urlopen(url).read()
#     tmp = json.loads(response_result)
#     # 循环div获取详细信息
#     all_div = None
#     try:
#         all_div = tmp['data']#['2018-02-04']['data']
#     except KeyError:
#         return False
#     lastId=None
#     for item in all_div:
#         print(item['id'])
#         print(item['created_at'])
#         content = item['content']
#         # content = re.sub(r'<br.*>|<a.*>', "", content)
#         print(re.sub("\n", "", content))
#         content = item['chinese']
#         # content = re.sub(r'<br.*>|<a.*>', "", content)
#         print(re.sub("\n", "", content))
#     return int(item['id'])
#
#
#
#
# if __name__ == "__main__":
#     flag = True
#     first=getDatas(0)
#     while True:
#         flag = getDatas(first)
#         if flag == False:
#             break
#         time.sleep(5)
#         first=flag
        # http: // www.jinse.com / weibo
        # http: // www.jinse.com / twitter


import urllib.parse
import urllib.request
from bs4 import BeautifulSoup
import os
import time
import re
from selenium import webdriver
import time


def getHtml(url, values):
    user_agent = 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.82 Safari/537.36'
    headers = {'User-Agent': user_agent}
    data = urllib.parse.urlencode(values)
    response_result = urllib.request.urlopen(url + '?' + data).read()
    html = response_result.decode('utf-8')
    return html


# 获取数据
def requestCnblogs(index):
    print('请求数据')
    # url = 'http://www.cnblogs.com/mvc/AggSite/PostList.aspx'
    # url = 'http://www.jinse.com/lives'
    url = 'http://www.qukuaiwang.com.cn/News/index/p/'+str(index)+'.html'
    # url = 'http://www.jinse.com/ajax/lives/getList?search=&id=11044&flag=down'

    value= {
         'CategoryId':808,
         'CategoryType' : 'SiteHome',
         'ItemListActionName' :'PostList',
         'PageIndex' : index,
         'ParentCategoryId' : 0,
        'TotalPostCount' : 4000
    }
    result = getHtml(url, value)
    print(result)
    return result


def flush():
    cnblogs = requestCnblogs(1)
    soup = BeautifulSoup(cnblogs, 'html.parser')
    all_div = soup.find_all('div', attrs={'class': 'list-art clear'})
    # all_div[0].find_all('div', attrs={'class': 'data-art'})[0].a['href']
    # all_div[2].a['href']
    # blogs = []
    # print(all_div[0]['data-id'])
    # 循环div获取详细信息
    for item in all_div:
        print('http://www.qukuaiwang.com.cn'+item.a['href'])
        print(re.sub("\n+",";",item.text))
        pass
        # blog = analyzeBlog(item)
        # blogs.append(blog)
        # f.write(item.find(attrs={'class': 'live-time'}).text)
        # print(item.find(attrs={'class':'live-date'}).text)
        # f.write(item.find(attrs={'class': 'live-info'}).text)
        # x=webdriver('http://www.jinse.com/ajax/lives/getList?search=&id=11044&flag=down')
        # return blogs
        # print(x)
    # f.close()


def getFirstIndex():
    url = 'http://www.jinse.com/lives'
    user_agent = 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.82 Safari/537.36'
    headers = {'User-Agent': user_agent}
    data = urllib.parse.urlencode(headers)
    response_result = urllib.request.urlopen(url + '?' + data).read()
    html = response_result.decode('utf-8')
    soup = BeautifulSoup(html, 'html.parser')
    all_div = soup.find_all('li', attrs={'class': 'clearfix'})
    return all_div[0]['data-id']

if __name__ == "__main__":
    # print(requestCnblogs(1))
    # print(getFirstIndex())
    while True:
        flush()
        time.sleep(3600)

