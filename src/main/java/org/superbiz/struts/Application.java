package org.superbiz.struts;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;
import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

/*@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public FilterRegistrationBean sitemeshFilterRegistration() {
        FilterRegistrationBean frb = new FilterRegistrationBean();
        SiteMeshFilter siteMeshFilter = new SiteMeshFilter();
        frb.setFilter(siteMeshFilter);
        frb.setOrder(0);
        return frb;
    }

    @Bean
    public FilterRegistrationBean struts2FilterRegistration() {
        FilterRegistrationBean frb = new FilterRegistrationBean();
        StrutsPrepareAndExecuteFilter spae = new StrutsPrepareAndExecuteFilter();
        frb.setFilter(spae);
        frb.setUrlPatterns(Collections.singleton("/*"));
        frb.setOrder(1);
        return frb;
    }
}
*/

@SpringBootApplication
public class Application {    public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
}    @Bean
public FilterRegistrationBean SiteMeshFilter() {
    FilterRegistrationBean registration = new FilterRegistrationBean();
    registration.setFilter(new SiteMeshFilter());
    registration.addUrlPatterns("/*");
    //registration.addInitParameter("paramName", "paramValue");
    registration.setName("SiteMeshFilter");
    registration.setOrder(0);
    return registration;
}    @Bean
public FilterRegistrationBean StrutsPrepareAndExecuteFilter() {
    FilterRegistrationBean registration = new FilterRegistrationBean();
    registration.setFilter(new StrutsPrepareAndExecuteFilter());
    registration.addUrlPatterns("/*");
    //registration.addInitParameter("paramName", "paramValue");
    registration.setName("StrutsPrepareAndExecuteFilter");
    registration.setOrder(1);
    return registration;
}}
