# coding:utf-8 #
import json
import re
import time
import urllib.parse
import urllib.request

from bs4 import BeautifulSoup


def timeToStampe(dt):
    timeArray = time.strptime(dt, "%Y-%m-%d %H:%M:%S")
    # 转换成时间戳
    timestamp = time.mktime(timeArray)
    return timestamp


def getTimeFromStampe(timestamp):
    time_local = time.localtime(timestamp)
    # 转换成新的时间格式(2016-05-05 20:28:54)
    dt = time.strftime("%Y-%m-%d %H:%M:%S", time_local)
    return dt


def getDatas(index):
    url = 'http://www.jinse.com/ajax/twitters/getList?flag=down&id='+str(index)
    response_result = urllib.request.urlopen(url).read()
    tmp = json.loads(response_result)
    # 循环div获取详细信息
    all_div = None
    try:
        all_div = tmp['data']#['2018-02-04']['data']
    except KeyError:
        return False
    lastId=None
    for item in all_div:
        print(item['id'])
        print(item['created_at'])
        content = item['content']
        # content = re.sub(r'<br.*>|<a.*>', "", content)
        print(re.sub("\n", "", content))
        content = item['chinese']
        # content = re.sub(r'<br.*>|<a.*>', "", content)
        print(re.sub("\n", "", content))
    return int(item['id'])




if __name__ == "__main__":
    flag = True
    first=getDatas(0)
    while True:
        flag = getDatas(first)
        if flag == False:
            break
        time.sleep(5)
        first=flag
        # http: // www.jinse.com / weibo
        # http: // www.jinse.com / twitter


