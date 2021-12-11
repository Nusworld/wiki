//package cn.edu.ncu.erlys.liu.config;
//
//import cn.edu.ncu.erlys.liu.interceptor.LogInterceptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class SpringMvcConfig implements WebMvcConfigurer {
//
//    @Autowired
//    LogInterceptor logInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(logInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/login");
//    }
//
//}
