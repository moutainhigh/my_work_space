import bishijie_kuaixun
import jinse_kuaixun
import niurenshuo_weibo
import niurenshuo_twitter
import qukuaiwang_news
import time

if __name__ == "__main__":
    qukuaiwanginstance = qukuaiwang_news.qukuaiwang()
    kuaixun = jinse_kuaixun.Kuaixun()
    twitterinstance = niurenshuo_twitter.twitter()
    weiboInstance = niurenshuo_weibo.weibo()
    bishijieinstance = bishijie_kuaixun.bishijie()
    while True:
        qukuaiwanginstance.update()
        kuaixun.update()
        twitterinstance.update()
        weiboInstance.update()
        bishijieinstance.update()
        time.sleep(300)
