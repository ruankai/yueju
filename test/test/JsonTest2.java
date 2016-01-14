package test;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

//排除自包含
public class JsonTest2 {
	/** 
    * 这里测试如果含有自包含的时候需要CycleDetectionStrategy 
    */  
   public static void testCycleObject() {  
       CycleObject object = new CycleObject();  
       object.setMemberId("yajuntest");  
       object.setSex("male");  
       JsonConfig jsonConfig = new JsonConfig();  
       jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);  
  
       JSONObject json = JSONObject.fromObject(object, jsonConfig);  
       System.out.println(json);  
   }  
  
   public static void main(String[] args) {  
              JsonTest2.testCycleObject();  
   }  
}
