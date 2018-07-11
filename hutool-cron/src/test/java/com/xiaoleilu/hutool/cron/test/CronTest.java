package com.xiaoleilu.hutool.cron.test;

import org.junit.Assert;
import org.junit.Test;

import com.xiaoleilu.hutool.cron.pattern.CronPattern;
import com.xiaoleilu.hutool.date.DateUtil;

/**
 * 定时任务单元测试类
 * @author Looly
 *
 */
public class CronTest {
	
	@Test
	public void CronPatternTest(){
		CronPattern pattern;
		
		//任何时间匹配
		pattern = new CronPattern("* * * * *");
		Assert.assertTrue(pattern.match(DateUtil.current(false), false, false));
		
		//12:11匹配
		pattern = new CronPattern("11 12 * * *");
		assertMatch(pattern, "12:11:39");
		
		//每5分钟匹配，匹配分钟为：[0,5,10,15,20,25,30,35,40,45,50,55]
		pattern = new CronPattern("*/5 * * * *");
		assertMatch(pattern, "12:00:39");
		assertMatch(pattern, "12:05:39");
		assertMatch(pattern, "12:10:39");
		assertMatch(pattern, "12:15:39");
		assertMatch(pattern, "12:20:39");
		assertMatch(pattern, "12:25:39");
		assertMatch(pattern, "12:30:39");
		assertMatch(pattern, "12:35:39");
		assertMatch(pattern, "12:40:39");
		assertMatch(pattern, "12:45:39");
		assertMatch(pattern, "12:50:39");
		assertMatch(pattern, "12:55:39");
		
		//2:01,3:01,4:01
		pattern = new CronPattern("1 2-4 * * *");
		assertMatch(pattern, "02:01:39");
		assertMatch(pattern, "03:01:39");
		assertMatch(pattern, "04:01:39");
		
		//2:01,3:01,4:01
		pattern = new CronPattern("1 2,3,4 * * *");
		assertMatch(pattern, "02:01:39");
		assertMatch(pattern, "03:01:39");
		assertMatch(pattern, "04:01:39");
		
		//08-07, 08-06
		pattern = new CronPattern("0 0 6,7 8 *");
		assertMatch(pattern, "2016-08-07 00:00:39");
		assertMatch(pattern, "2016-08-06 00:00:39");
		
		//别名忽略大小写
		pattern = new CronPattern("0 0 6,7 Aug *");
		assertMatch(pattern, "2016-08-06 00:00:39");
		assertMatch(pattern, "2016-08-07 00:00:39");
		pattern = new CronPattern("0 0 7 aug *");
		assertMatch(pattern, "2016-08-07 00:00:39");
		
		//星期四
		pattern = new CronPattern("0 0 * * Thu");
		assertMatch(pattern, "2017-02-09 00:00:39");
		assertMatch(pattern, "2017-02-09 00:00:39");
		
	}
	
	@Test
	public void quartzPatternTest() {
		CronPattern pattern = new CronPattern("0 4 * * ?");
		assertMatch(pattern, "2017-02-09 04:00:00");
		assertMatch(pattern, "2017-02-19 04:00:33");
		
		//对于6位Quartz风格表达式，默认忽略第一位秒部分
		pattern = new CronPattern("0 0 4 * * ?");
		assertMatch(pattern, "2017-02-09 04:00:00");
		assertMatch(pattern, "2017-02-19 04:00:33");
	}
	
	/**
	 * 表达式是否匹配日期
	 * @param pattern 表达式
	 * @param date 日期，标准日期时间字符串
	 */
	private void assertMatch(CronPattern pattern, String date){
		Assert.assertTrue(pattern.match(DateUtil.parse(date).getTime(), false, false));
	}
}
