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
    url = 'http://www.jinse.com/lives'
    # url = 'http://www.qukuaiwang.com.cn/News/index/p/'+str(index)+'.html'
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
    all_div = soup.find_all('li', attrs={'class': 'clearfix'})

    blogs = []
    f = open("/home/fangqing/git-home/wuxian/info.txt", "a+")
    print(all_div[0]['data-id'])
    # 循环div获取详细信息
    for item in all_div:
        # blog = analyzeBlog(item)
        # blogs.append(blog)
        f.write(item.find(attrs={'class': 'live-time'}).text)
        # print(item.find(attrs={'class':'live-date'}).text)
        f.write(item.find(attrs={'class': 'live-info'}).text)
        # x=webdriver('http://www.jinse.com/ajax/lives/getList?search=&id=11044&flag=down')
        # return blogs
        # print(x)
    f.close()


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
    print(getFirstIndex())
    # while True:
    #     flush()
    #     time.sleep(3600)

