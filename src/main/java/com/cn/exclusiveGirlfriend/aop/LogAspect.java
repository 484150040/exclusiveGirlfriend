package com.cn.exclusiveGirlfriend.aop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cn.exclusiveGirlfriend.mapper.OperationrecordsMapper;
import com.cn.exclusiveGirlfriend.pojo.Login;
import com.cn.exclusiveGirlfriend.pojo.Operationrecords;

import com.cn.exclusiveGirlfriend.pojo.OperationrecordsExample;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.Optional;


@Component
@Aspect
@Service
@Transactional
public class LogAspect {

    @Autowired
    private OperationrecordsMapper operationrecordsMapper;

    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);


    @Pointcut("@annotation(com.cn.exclusiveGirlfriend.aop.OperationLog)")
    public void controllerAspect(){
    }
    @AfterReturning(value = "controllerAspect()", returning = "res")
    public void after(JoinPoint joinPoint, Object res) throws NoSuchMethodException {
         String userName = getStaff().getUsername();
         String loginIp = getStaff().getLoginIp();
         String className = joinPoint.getTarget().getClass().getName();
         String name = joinPoint.getSignature().getName();
         Object[] params = joinPoint.getArgs();
         String paramsData ="";
        for (Object param : params) {

            paramsData+= JSON.toJSONString(param);
        }
        //logger.info("ServiceImpl:"+str);
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        // getMethod
        Method method = methodSignature.getMethod();
        // get note
        OperationLog logAnno = method.getAnnotation(OperationLog.class);
        // params
        String operateRemark = logAnno.operteContent();
        String operateType = logAnno.operteType();
        //logger.info("操作:" + operateType);

        Operationrecords operationLog =new Operationrecords();
        operationLog.setCreatetime(new Date());
        operationLog.setOperationip(loginIp);
        operationLog.setOperationname(userName);
        operationLog.setOperationservice(className + "---" + name); //操作service
        operationLog.setOperationremark(operateRemark);
        operationLog.setOperationdata(paramsData);
        operationLog.setOperationresult("返回值："+ JSONObject.toJSONString(res));
        operationLog.setOperationtype(operateType);

        Optional<Integer> optionalInteger=Optional.ofNullable(operationrecordsMapper.insertSelective(operationLog));
        optionalInteger.ifPresent(c-> System.out.println(optionalInteger.get()));
    }
    /**
     * 得到用户信息
     *
     * @return
     */
    public static Login getStaff() {
        //HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        // 获取session
        Subject subject = SecurityUtils.getSubject();
        Login login =(Login)subject.getPrincipal();
        Optional<Login> optionalUser=Optional.ofNullable(login);
        if (optionalUser.isPresent()){
            return login;
        }
        return null;
    }

}
