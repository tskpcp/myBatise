package com.myBatise.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.myBatise.Interface.CmsCodeMapperI;
import com.myBatise.common.myBatiseUtil;
import com.myBatise.model.CMS_CODE;
import com.myBatise.model.SMS_Code;

public class testMain {
	private static Logger logger=Logger.getLogger(testMain.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add();
		sel();
		//selforCodeId("A");
		//selforCodeName("中");
		//updateforCodeId();
		//selforCodeId("A");
		//deleteforCodeId("A");
		//selCode();
		//batchsetSMSCode();
		//batchdelSMSCode();
		//addCmsCode();
		//selCmsCode();
		//selCmsCodeById();
		// 记录debug级别的信息  
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message."); 
	}
	public static void add(){
			SqlSession session=myBatiseUtil.getSqlSession(true);
			SMS_Code sc=new SMS_Code();
			sc.setCodeID("A");
			sc.setCodeIndex(1);
			sc.setCodeName("AA");
			sc.setCodeParent("");
			sc.setCodeValue1("A1");
			sc.setCodeValue2("A2");
			sc.setCodeValue3("A3");
			int flog=session.insert("com.myBatise.model.SMS_Code.setSMSCode",sc);	
			System.out.print(flog);
            session.close(); 
			
		
	}
	public static void addCmsCode(){
		SqlSession session=myBatiseUtil.getSqlSession(true);
		CmsCodeMapperI mapper=session.getMapper(CmsCodeMapperI.class);
		CMS_CODE cc=new CMS_CODE();
		cc.setCODE_ID("D");
		cc.setCODE_NAME("DD");
		cc.setCODE_TYPE("DD");
		cc.setCODE_VALUE1("");
		cc.setCODE_VALUE2("");
		cc.setCODE_VALUE3("");
		int add=mapper.addCmsCode(cc);
		session.clearCache();
		session.close();
		System.out.print(add);
	}
	public static void batchsetSMSCode(){
		
			SqlSession session=myBatiseUtil.getSqlSession(true);
			List<SMS_Code> lsc=new ArrayList<SMS_Code>();
			for(int i=0;i<6;i++){
				SMS_Code sc=new SMS_Code();
				sc.setCodeID("A"+i);
				sc.setCodeIndex(1+i);
				sc.setCodeName("AA"+i);
				sc.setCodeParent("");
				sc.setCodeValue1("A1"+i);
				sc.setCodeValue2("A2"+i);
				sc.setCodeValue3("A3"+i);
				lsc.add(sc);
			}
			
			int flog=session.insert("com.myBatise.model.SMS_Code.batchsetSMSCode",lsc);
			System.out.print(flog);
		
            session.close(); 
            lsc.clear();
            
			
		
	}
	public static void sel(){
		
			SqlSession session=myBatiseUtil.getSqlSession();
			List<SMS_Code> lsc=session.selectList("com.myBatise.model.SMS_Code.getSMSCodeList");
			for(SMS_Code code:lsc){
				System.out.println(code.getCodeID()+"|"+code.getCodeName());
			}
			
            session.close(); 
			
		
		
	}
	public static void selCmsCode(){
		SqlSession session=myBatiseUtil.getSqlSession();
		CmsCodeMapperI mapper=session.getMapper(CmsCodeMapperI.class);
		List<CMS_CODE> lcc=mapper.getAllCmsCode();
        for(CMS_CODE cc:lcc){
        	System.out.println(cc.getCODE_ID()+"|"+cc.getCODE_NAME()+"|"+cc.getCODE_TYPE());
        }
        session.close();
	}
	public static void selCmsCodeById(){
		SqlSession session=myBatiseUtil.getSqlSession();
		CmsCodeMapperI mapper=session.getMapper(CmsCodeMapperI.class);
		CMS_CODE cc=mapper.getCmsCodeById("D");
		session.clearCache();
		session.close();
		System.out.print(cc.getCODE_NAME());
		
	}
    public static void selforCodeId(String CodeId){
			SqlSession session=myBatiseUtil.getSqlSession();
			SMS_Code sc=new SMS_Code();
			sc.setCodeID(CodeId);
			SMS_Code scg=session.selectOne("com.myBatise.model.SMS_Code.getSMSCodeforCodeID",sc);
			System.out.println(scg.getCodeID()+"|"+scg.getCodeName());
			
            session.close(); 
			
		
	}
	public static void selforCodeName(String CodeName){
		    SqlSession session=myBatiseUtil.getSqlSession();
			SMS_Code sc=new SMS_Code();
			sc.setCodeName(CodeName);
			List<SMS_Code> lsc=session.selectList("com.myBatise.model.SMS_Code.getSMSCodeforLikeCodeName",sc);
			for(SMS_Code code:lsc){
				System.out.println(code.getCodeID()+"|"+code.getCodeName());
			}
			
            session.close(); 
			
		
	}
	public static void updateforCodeId(){
			SqlSession session=myBatiseUtil.getSqlSession(true);
			SMS_Code sc=new SMS_Code();
			sc.setCodeID("A");
			sc.setCodeName("DD");
			sc.setCodeValue1("DD");			
			int flog=session.update("com.myBatise.model.SMS_Code.upSMSCode",sc);
			System.out.print(flog);			
            session.close(); 

	}
	public static void deleteforCodeId(String CodeId){
			SqlSession session=myBatiseUtil.getSqlSession(true);
			SMS_Code sc=new SMS_Code();
			sc.setCodeID(CodeId);
			int flog=session.delete("com.myBatise.model.SMS_Code.delSMSCode",sc);
			System.out.print(flog);			
            session.close(); 
			
		
	}
	public static void batchdelSMSCode(){
			SqlSession session=myBatiseUtil.getSqlSession(true);
			List<String> ls=new ArrayList<String>();
			for(int i=0;i<6;i++){
				ls.add("A"+i);
			}			
			int flog=session.delete("com.myBatise.model.SMS_Code.batchdelSMSCode",ls);
			System.out.print(flog);			
            session.close(); 
			
		
	}
	public static void selCode(){
			SqlSession session=myBatiseUtil.getSqlSession();
			CMS_CODE cc=new CMS_CODE();
			cc.setCODE_ID("SN");
			cc.setCODE_TYPE("ADMIN");
			List<CMS_CODE> lcc=session.selectList("com.myBatise.model.CMS_CODE.CB_CODE_GET",cc);
			for(CMS_CODE code:lcc){
				System.out.println(code.getCODE_ID()+"|"+code.getCODE_NAME());
			}
			
            session.close(); 
	}
	/*
	 * 多结果集返回
	 *未完成
	 */
	public static void selCodePage(){
			SqlSession session=myBatiseUtil.getSqlSession();
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("PAGE", 1);
			map.put("UNIT", 10);
			map.put("NAV_MAX", 10);
			map.put("CODE_TYPE", "ADMIN");
			//List<List<?>> results=session.selectList(arg0, arg1)
			
            session.close(); 
			
		
	}
}
