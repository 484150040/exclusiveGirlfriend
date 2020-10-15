package com.cn;

import static org.junit.Assert.assertTrue;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.cn.exclusiveGirlfriend.utiles.EncryptUtil;
import org.junit.Test;

import java.util.Optional;
import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    @Test
    public void shouldAnswerWithTrue()
    {

    }
/*

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入整数");
        Integer T=scanner.nextInt();
        while (T!=1){
//            System.out.println("请输入次数");
            Integer n=scanner.nextInt();
//            System.out.println("请输入打卡记录");
            String ai=scanner.next();
            if (T>=1 && T<=100){
                if (n>=3&&n<=50){
                    char[] ss=ai.toCharArray();
                    boolean a=false;
                    for (int i=0;i<ss.length;i++){
//                        System.out.println(ss[i]);
                        if (i==0){
                            a=true;
                        }
                        if (i>0&&i<=ss.length){
                            if (ss[i]!=ss[i-1]){
                                a=true;
                            }else{
                                a=false;
                                break;
                            }
                        }
                        if (ss[i]>=0&&ss[i]<=1){
                            a=true;
                        }
                    }
                    if (a&&ai.length()==n){
                        System.out.println("yes");
                    }else{
                        System.out.println("no");
                    }
                }
            }
        }

    }
*/

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入六件套数量");
        //九件套12
        // 六件套13+50【预定】校园六件套+1水洗棉六件套【预定】
        //三件套179+1校园三件套+1校园水洗棉【三件套】
        //  校园五件套五件套1
        //【预定】校园七件套3
        // 寝居大礼包【基础版】1
        // 床帘
        //床帘架
        // 床垫
        //被芯
        //枕芯
        Integer sun=scanner.nextInt();
        System.out.println("请输入九件套数量");
        Integer sun1=scanner.nextInt();
        Double str=0.0;//六件套价格
        Double str1=0.0;//九件套价格
        Integer sum=sun+sun1;
        if (sum<40){
            str=sum*70*1.0;
            str1=sum*92.5;
        }
        if (sum>=40&&sum<80){
            str=40*70*1.0;
            str+=(sum-40)*80*1.0;
            //九件套
            str1=40*92.5;
            str1+=(sum-40)*102.5*1.0;
        }
        if (sum>=80){
            str=40*70*1.0;
            str+=(80-40)*80*1.0;
            str+=(sum-80)*85*1.0;

            str1=40*92.5;
            str1+=(80-40)*102.5;
            str1+=(sum-80)*107.5;
        }

        System.out.println("六件套价格："+str+"元");
        System.out.println("九件套价格："+str1+"元");
///------------------------
    /*    if (sun<40){
            str=sun*70*1.0;

        }
        if (sun>=40&&sun<80){
            str=40*70*1.0;
            str+=(sun-40)*80*1.0;

        }
        if (sun>=80){
            str=40*70*1.0;
            str+=(80-40)*80*1.0;
            str+=(sun-80)*85*1.0;

        }
        if (sun1<40){
            str1=sun1*92.5;
        }
        if (sun1>=40&&sun1<80){

            //九件套
            str1=40*92.5;
            str1+=(sun1-40)*102.5*1.0;
        }
        if (sun1>=80){
            str1=40*92.5;
            str1+=(80-40)*102.5;
            str1+=(sun1-80)*107.5;
        }
        System.out.println("六件套价格："+str+"元");
        System.out.println("九件套价格："+str1+"元");*/
    }
}
