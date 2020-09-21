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
}
