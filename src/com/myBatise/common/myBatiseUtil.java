package com.myBatise.common;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class myBatiseUtil {
	/*
	 * ��ȡSqlSessionFactory
	 * @return SqlSessionFactory
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		String resource="myBatise-config.xml";
		InputStream is=myBatiseUtil.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		return factory;
		
	}
	/*
	 * ��ȡSqlSession
	 * @return SqlSession
	 */
	public static SqlSession getSqlSession(){
		return getSqlSessionFactory().openSession();
	}
	 /*
      * ��ȡSqlSession
      * @param isAutoCommit 
      *         true ��ʾ������SqlSession������ִ����SQL֮����Զ��ύ����
      *         false ��ʾ������SqlSession������ִ����SQL֮�󲻻��Զ��ύ������ʱ����Ҫ�����ֶ�����sqlSession.commit()�ύ����
      * @return SqlSession
      */
     public static SqlSession getSqlSession(boolean isAutoCommit) {
        return getSqlSessionFactory().openSession(isAutoCommit);
     }
}
