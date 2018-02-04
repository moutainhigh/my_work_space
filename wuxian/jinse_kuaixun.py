# coding:utf-8 #
import json
import re
import time
import urllib.parse
import urllib.request

from bs4 import BeautifulSoup


# def getHtml(url, values):
#     user_agent = 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.82 Safari/537.36'
#     headers = {'User-Agent': user_agent}
#     data = urllib.parse.urlencode(values)
#     response_result = urllib.request.urlopen(url + '?' + data).read()
#     html = response_result.decode('utf-8')
#     return html

#
# # 获取数据
# def requestCnblogs(index):
#     print('请求数据')
#     url = 'http://www.jinse.com/ajax/lives/getList?search=&id=11252&flag=down'
#     # url = 'http://www.jinse.com/ajax/lives/getList?search=&id=11242&flag=down'
#     # url = 'http://www.jinse.com/ajax/lives/getList?search=&id=12000&flag=down'
#
#     value= {
#          'CategoryId':808,
#          'CategoryType' : 'SiteHome',
#          'ItemListActionName' :'PostList',
#          'PageIndex' : index,
#          'ParentCategoryId' : 0,
#         'TotalPostCount' : 4000
#     }
#     result = getHtml(url, value)
#     print(result)
#     return result


def getDatas(index):
    url = 'http://www.jinse.com/ajax/lives/getList?search=&id=' + index + '&flag=down'
    response_result = urllib.request.urlopen(url).read()
    tmp = json.loads(response_result)
    # 循环div获取详细信息
    all_div = None
    try:
        all_div = tmp['data']['2018-02-03']
    except KeyError:
        return False

    for item in all_div:
        print(item['id'])
        print(item['created_at'])
        content = item['content']
        content = re.sub(r'<.*>', "", content)
        print(re.sub("\n", "", content))


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
    first = int(getFirstIndex())
    flag = True
    for i in range(first, 0, -10):
        flag = getDatas(str(i))
        if flag == False:
            break
        time.sleep(5)
