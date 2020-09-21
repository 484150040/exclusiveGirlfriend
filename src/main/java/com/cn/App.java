package com.cn;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.cn.exclusiveGirlfriend.utiles.EncryptUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
    *@Description: 自定义加密解密
    *@Param: [args]
    *@return: void
    *@Author: Yang Fang Hong
    *@date: 2020/9/19
    */
    public static void main( String[] args )
    {
       /* *//**
     *@Description: 加密
     *@Param: [args]
     *@return: void
     *@Author: Yang Fang Hong
     *@date: 2020/9/19
     *//*
        String str= EncryptUtil.Base64Encode("Hello World!");
        char[] ii=str.toCharArray();
        System.out.println(ii);
        StringBuilder stringBuilder=new StringBuilder("");
        for (char c : ii) {
            String bt=EncryptUtil.Base64Encode(c+"");
//            System.out.println(bt);
            String bb[]=bt.split("==");
            for (String s : bb) {
                stringBuilder.append(s);
            }

        }
//        System.out.println(stringBuilder.toString());
        *//**
     *@Description: 解密
     *@Param: [args]
     *@return: void
     *@Author: Yang Fang Hong
     *@date: 2020/9/19
     *//*
//---------------------------------------------------------------------------------------
        char[] ii1=stringBuilder.toString().toCharArray();
        StringBuilder stringBuilder1=new StringBuilder("");
        int count=0;
      for (int i=0;i<ii1.length;i++){
          if (count==1){
              stringBuilder1.append(ii1[i]);
              stringBuilder1.append("==");
              count=0;
              continue;
          }
          stringBuilder1.append(ii1[i]);
          count++;
      }
        System.out.println(stringBuilder1.toString());
      char[] dd=stringBuilder1.toString().toCharArray();
      List list=new ArrayList();
      StringBuilder stringBuilder2=new StringBuilder();
      int count1=1;
      for (int i=0;i<dd.length;i++){
          if (count1==4){
              stringBuilder2.append(dd[i]);
              list.add(stringBuilder2.toString());
              stringBuilder2.replace(0,stringBuilder2.length(),"");
              count1=1;
              continue;
          }
          stringBuilder2.append(dd[i]);
          count1++;
      }
      StringBuilder stringBuilder3=new StringBuilder();
        for (Object o : list) {
            stringBuilder3.append(EncryptUtil.Base64Decode(o.toString()));
        }
        System.out.println(EncryptUtil.Base64Decode(stringBuilder3.toString()));
        Optional.ofNullable(stringBuilder3).ifPresent(u-> System.out.println(u));
*/

    }
}
