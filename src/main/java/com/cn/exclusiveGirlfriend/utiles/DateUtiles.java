package com.cn.exclusiveGirlfriend.utiles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;



/**
 * @program: up
 * @description: 时间格式转换
 * @author: Yang Fang Hong
 * @create: 2020-08-01 11:54
 */
public class DateUtiles {


    public static String FILE_NAME = "MMddHHmmssSSS";
    public static String DEFAULT_PATTERN = "yyyy-MM-dd";
    public static String DIR_PATTERN = "yyyy/MM/dd/";
    public static String TIMESTAMP_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static String TIMES_PATTERN = "HH:mm:ss";
    public static String NOCHAR_PATTERN = "yyyyMMddHHmmss";
    /**
     * 获取当前时间戳
     *
     *
     * @return
     */
    public static String formatDefaultFileName() {
        return formatDateByFormat(new Date(), FILE_NAME);
    }
    /**
     * 日期转换为字符串
     *
     * @param date
     * 日期
     * @param format
     * 日期格式
     * @return 指定格式的日期字符串
     */
    public static String formatDateByFormat(Date date, String format) {
        String result = "";
        if (date != null) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                result = sdf.format(date);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
    /**
     * 转换为默认格式(yyyy-MM-dd)的日期字符串
     *
     * @param date
     *
     * @return
     */
    public static String formatDefaultDate(Date date) {
        return formatDateByFormat(date, DEFAULT_PATTERN);
    }
    /**
     * 转换为目录格式(yyyy/MM/dd/)的日期字符串
     *
     * @param date
     *
     * @return
     */
    public static String formatDirDate(Date date) {
        return formatDateByFormat(date, DIR_PATTERN);
    }
    /**
     * 转换为完整格式(yyyy-MM-dd HH:mm:ss)的日期字符串
     *
     * @param date
     *
     * @return
     */
    public static String formatTimesTampDate(Date date) {
        return formatDateByFormat(date, TIMESTAMP_PATTERN);
    }
    /**
     * 转换为时分秒格式(HH:mm:ss)的日期字符串
     *
     * @param date
     *
     * @return
     */
    public static String formatTimesDate(Date date) {
        return formatDateByFormat(date, TIMES_PATTERN);
    }
    /**
     * 转换为时分秒格式(HH:mm:ss)的日期字符串
     *
     * @param date
     *
     * @return
     */
    public static String formatNoCharDate(Date date) {
        return formatDateByFormat(date, NOCHAR_PATTERN);
    }
    /**
     * 日期格式字符串转换为日期对象
     *
     * @param strDate
     * 日期格式字符串
     * @param pattern
     * 日期对象
     * @return
     */
    public static Date parseDate(String strDate, String pattern) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            Date nowDate = format.parse(strDate);
            return nowDate;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 字符串转换为默认格式(yyyy-MM-dd)日期对象
     *
     * @param date
     *
     * @return
     *
     * @throws Exception
     */
    public static Date parseDefaultDate(String date) {
        return parseDate(date, DEFAULT_PATTERN);
    }
    /**
     * 字符串转换为完整格式(yyyy-MM-dd HH:mm:ss)日期对象
     *
     * @param date
     *
     * @return
     *
     * @throws Exception
     */
    public static Date parseTimesTampDate(String date) {
        return parseDate(date, TIMESTAMP_PATTERN);
    }
    /**
     * 获得当前时间
     *
     * @return
     */
    public static Date getCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }
    /**
     * sql Date 转 util Date
     *
     * @param date
     * java.sql.Date日期
     * @return java.util.Date
     */
    public static Date parseUtilDate(java.sql.Date date) {
        return date;
    }
    /**
     * util Date 转 sql Date
     *
     * @param date
     * java.sql.Date日期
     * @return
     */
    public static java.sql.Date parseSqlDate(Date date) {
        return new java.sql.Date(date.getTime());
    }
    /**
     * 获取年份
     *
     * @param date
     *
     * @return
     */
    public static int getYear(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.YEAR);
    }
    /**
     * 获取月份
     *
     * @param date
     *
     * @return
     */
    public static int getMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MONTH) + 1;
    }
    /**
     * 获取星期
     *
     * @param date
     *
     * @return
     */
    public static int getWeek(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        dayOfWeek = dayOfWeek - 1;
        if (dayOfWeek == 0) {
            dayOfWeek = 7;
        }
        return dayOfWeek;
    }
    /**
     * 获取日期(多少号)
     *
     * @param date
     *
     * @return
     */
    public static int getDay(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_MONTH);
    }
    /**
     * 获取当前时间(小时)
     *
     * @param date
     *
     * @return
     */
    public static int getHour(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.HOUR_OF_DAY);
    }
    /**
     * 获取当前时间(分)
     *
     * @param date
     *
     * @return
     */
    public static int getMinute(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MINUTE);
    }
    /**
     * 获取当前时间(秒)
     *
     * @param date
     *
     * @return
     */
    public static int getSecond(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.SECOND);
    }
    /**
     * 获取当前毫秒
     *
     * @param date
     *
     * @return
     */
    public static long getMillis(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.getTimeInMillis();
    }
    /**
     * 日期增加
     *
     * @param date
     * Date
     *
     * @param day
     * int
     *
     * @return Date
     */
    public static Date addDate(Date date, int day) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(getMillis(date) + ((long) day) * 24 * 3600 * 1000);
        return c.getTime();
    }
    /**
     * 日期相减(返回天数)
     *
     * @param date
     * Date
     *
     * @param date1
     * Date
     *
     * @return int 相差的天数
     */
    public static int diffDate(Date date, Date date1) {
        return (int) ((getMillis(date) - getMillis(date1)) / (24 * 3600 * 1000));
    }
    /**
     * 日期相减(返回秒值)
     *
     * @param date
     * Date
     * @param date1
     * Date
     * @return int
     * @author
     */
    public static Long diffDateTime(Date date, Date date1) {
        return (Long) ((getMillis(date) - getMillis(date1)) / 1000);
    }
    private static String[] randomValues = new String[] { "0", "1", "2", "3",
            "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g",
            "h", "i", "j", "k", "l", "m", "n", "u", "t", "s", "o", "x", "v",
            "p", "q", "r", "w", "y", "z" };
    public static String getRandomNumber(int lenght) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < lenght; i++) {
            Double number = Math.random() * (randomValues.length - 1);
            str.append(randomValues[number.intValue()]);
        }
        return str.toString();
    }

    /**
     * 获取上周末的时间
     */
    public static Date lastZM(Integer day) {

        //作用防止周日得到本周日期
        Calendar calendar = Calendar.getInstance();
        while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            calendar.add(Calendar.DAY_OF_WEEK, -1);
        }
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int offset = 7 - dayOfWeek;
        calendar.add(Calendar.DATE, offset - 7);
//        System.out.println(calendar.getTime());
        return addDate(calendar.getTime(),day);//这是从上周日开始数的到本周五为6

    }
    /**
    *@Description: 本月第一天时间
    *@Param: []
    *@return: java.util.Date
    *@Author: Yang Fang Hong
    *@date: 2020/8/4
    */
    public static String nowOpenAlan(String format1){
        SimpleDateFormat format=new SimpleDateFormat(format1);
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        String monthStart = format.format(c.getTime())+" 00:00:00";
        return monthStart;
    }
    /**
    *@Description: 本月最后一天
    *@Param: [format1]
    *@return: java.lang.String
    *@Author: Yang Fang Hong
    *@date: 2020/8/4
    */
    public static String nowOpenAlanend(String format1){
        SimpleDateFormat format=new SimpleDateFormat(format1);
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        String monthEnd = format.format(ca.getTime())+" 23:59:59";
        return monthEnd;
    }

        /**
        *@Description: 上月最后一天
        *@Param: [format1]
        *@return: java.util.Date
        *@Author: Yang Fang Hong
        *@date: 2020/8/4
        */
    public static Date startAlanend(String format1){
        String date=DateUtiles.nowOpenAlanend(DateUtiles.TIMESTAMP_PATTERN);
        SimpleDateFormat format = new SimpleDateFormat(format1);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtiles.parseTimesTampDate(date));
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        String mon = format.format(m);
        System.out.println("过去一个月："+mon);
        return parseTimesTampDate(mon);
    }
    /**
     *@Description: 上月第一天
     *@Param: [format1]
     *@return: java.util.Date
     *@Author: Yang Fang Hong
     *@date: 2020/8/4
     */
    public static Date startAlan(String format1){
        String date=DateUtiles.nowOpenAlan(DateUtiles.TIMESTAMP_PATTERN);
        SimpleDateFormat format = new SimpleDateFormat(format1);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtiles.parseTimesTampDate(date));
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        String mon = format.format(m);
        System.out.println("过去一个月："+mon);
        return parseTimesTampDate(mon);
    }



    /**
     * 生成账号
     *
     * @param acount
     * @return
     */
    public static String nextAcounnt(String acount) {
        String newAcc = "";
        if (Integer.parseInt(acount) < 10000) {
            Integer newAc = Integer.parseInt(acount) + 1;
            if (newAc < 1000) {
                int count = String.valueOf(newAc).length();
                if (count == 1) {
                    newAcc = "000" + newAc;
                } else if (count == 2) {
                    newAcc = "00" + newAc;
                } else if (count == 3) {
                    newAcc = "0" + newAc;
                }
            } else {
                newAcc = String.valueOf(newAc);
            }
        } else {
            newAcc = acount;
        }
        return newAcc;
    }
    public static boolean isNumeric1(String str) {
        if (str != null && !"".equals(str) && str.length()<=9) {
            Pattern pattern = Pattern.compile("[0-9]*");
            return pattern.matcher(str).matches();
        } else {
            return false;
        }
    }

    /**
     * 生成流水号
     *
     * @param t
     * 流水号位数
     * @return 流水号
     */
    public static String getSequenceNumber(int t) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        String str = sdf.format(d);
        String haomiao = String.valueOf(System.nanoTime());
        str = str + haomiao.substring(haomiao.length() - 6, haomiao.length());
        return str.substring(str.length() - t, str.length());
    }
    /**
    * @Description: 根据时间范围字符串转时间
    * @Param: 2020-08-01~2020-09-01
    * @return: Map<String,Date>
    * @Author: qgy
    * @Date: 2020/8/3 0003
    */
    public static Map<String,Date>  getSelectDate(String selectDate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Map<String,Date> map = new HashMap<String,Date>();
        if(selectDate!=null&&selectDate!=""){
            String[]  strs = selectDate.split("~");
            Date startDate =  new Date(); //会员到期时间
            Date lastDate =  new Date(); //会员到期时间

            startDate = format.parse(strs[0]+" 00:00:00");
            lastDate = format.parse(strs[1]+" 00:00:00");
            lastDate = addDate(lastDate,1);
            map.put("beginDate",startDate);
            map.put("endDate",lastDate);
        }
        return map;
    }

}
