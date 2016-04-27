package com.myBatise.Interface;

import java.util.List;

import com.myBatise.model.CMS_CODE;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
public interface CmsCodeMapperI {
	   @Insert("insert into CMS_CODE(CODE_ID,CODE_NAME,CODE_TYPE,CODE_VALUE1,CODE_VALUE2,CODE_VALUE3) values(#{CODE_ID},#{CODE_NAME},#{CODE_TYPE},#{CODE_VALUE1},#{CODE_VALUE2},#{CODE_VALUE3})")
	   public int addCmsCode(CMS_CODE cc);
	   
	   @Select("select * from CMS_CODE")
	   public List<CMS_CODE> getAllCmsCode(); 
	   
	   @Select("select * from CMS_CODE where CODE_ID=#{CodeID}")
	   public CMS_CODE getCmsCodeById(String CodeID);
	   
	   @Update("Update CMS_CODE set CODE_NAME=#{CODE_NAME} where CODE_ID=#{CODE_ID}")
	   public int updateCmsCode(CMS_CODE cc);
	   
	   @Delete("delete from CMS_CODE where CODE_ID=#{CodeID}")
	   public int deleteCmsCode(String CodeID);
}
