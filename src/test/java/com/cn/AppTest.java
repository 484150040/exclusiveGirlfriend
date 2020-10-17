package com.cn;

import static org.junit.Assert.assertTrue;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.cn.exclusiveGirlfriend.utiles.EncryptUtil;
import com.google.common.base.Joiner;
import com.google.common.collect.*;
import org.junit.Test;

import java.util.*;

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

   /* public static void main(String[] args) {

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

    }*/


    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();
        Set<String> set = Sets.newHashSet();
        Map<String, String> map = Maps.newHashMap();
        ImmutableList<String> iList = ImmutableList.of("a", "b", "c");
        ImmutableSet<String> iSet = ImmutableSet.of("e1", "e2");
        ImmutableMap<String, String> iMap = ImmutableMap.of("k1", "v1", "k2", "v2");
        //key-value  key可以重复
        Multimap<String,Integer> map1 = ArrayListMultimap.create();
        map1.put("aa", 1);
        map1.put("aa", 2);
        map1.put("aa", 2);
        System.out.println(map1.get("aa"));  //[1, 2]
        //双向Map(Bidirectional Map) 键与值都不能重复     (当键相同时,值会被覆盖,当键不同时值相同或者键不同会报错)
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("aa", "1");
        biMap.put("aa", "2");
        biMap.put("aa", "2");
        System.out.println(biMap.get("aa"));
        //集合转换为特定规则的字符串
        String result = Joiner.on("-").join(iList);
        System.out.println(result);
    }
}
