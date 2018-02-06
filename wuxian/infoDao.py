import pymysql


class infoDao:
    # 打开数据库连接

    def __init__(self, dbename='test', username='root', password='', host='localhost'):
        self.dbname = dbename
        self.db = pymysql.connect(host, username, password, self.dbname)

    def getVersion(self):
        # 使用 cursor() 方法创建一个游标对象 cursor
        cursor = self.db.cursor()
        # 使用 execute()  方法执行 SQL 查询
        cursor.execute("show tables")

        # 使用 fetchall() 方法获取全部数据.
        data = cursor.fetchall()
        for entry in data:
            print("Database version----- : %s " % entry)

    def saveInfo(self, tableName, columesName, values):
        # 使用cursor()方法获取操作游标
        cursor = self.db.cursor()

        # SQL 插入语句
        sql = """insert into  {} ( {} )values({})""".format(tableName, columesName, values)
        try:
            # 执行sql语句
            cursor.execute(sql)
            # 提交到数据库执行
            self.db.commit()
        except:
            # 如果发生错误则回滚
            self.db.rollback()

    def __del__(self):
        # 关闭数据库连接
        self.db.close()


if __name__ == "__main__":
    dao = infoDao();
    # dao.getVersion()
    dao.saveInfo(tableName='test', columesName='id,times,content', values="""1,"10:22:33","shibushi" """)
