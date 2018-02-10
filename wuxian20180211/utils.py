import time
webo_tbl="vt_info_niuren"
weibo_columes="id,name,createtime,content,source"

twitter_tbl="vt_info_niuren"
twitter_columes="id,name,createtime,content,source"

kuaixun_tbl="vt_info_news"
kuaixun_columes="id,createtime,content,sourceurl,source"



toutiao_tbl="vt_info_block_news"
toutiao_columes=""title,author,newstime,newsuri",insertStr"

host='localhost'
user='root'
passwd=''
database='test'


def gettoday():
    return time.strftime('%Y-%m-%d', time.localtime())


if __name__=="__main__":
    print(gettoday())