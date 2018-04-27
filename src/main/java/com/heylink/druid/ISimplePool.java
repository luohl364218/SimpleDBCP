package main.java.com.heylink.druid;

/*
 * introductions:面向接口编程
 * 抽取连接池架构的接口
 * created by Heylink on 2018/4/23 21:13
 */
public interface ISimplePool {

    //获取连接
    PoolConnection getConnection();
    //创建连接
    void createConnection(int count);
}
