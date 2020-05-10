package com.allen.cap2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



/**
 * 配置类===配置文件
 * @author 周何圳 2020/3/20 新建
 * @description config
 */
@Configuration
/*@ComponentScan(value = "com.allen.cap2",includeFilters = {
        @Filter(type = FilterType.CUSTOM,classes = {AllenTypeFilter.class})
},useDefaultFilters = false)*/
/*@ComponentScan(value="com.allen.cap2",includeFilters={
		@Filter(type= FilterType.ANNOTATION,classes={Controller.class}),
		@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={OrderService.class})
},useDefaultFilters=false)*/
/*@ComponentScan(value="com.allen.cap2",excludeFilters={
		@Filter(type= FilterType.ANNOTATION,classes={Controller.class}),
		@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={OrderService.class})
},useDefaultFilters=false)*/
@ComponentScan(value = "com.allen.cap2")
public class MainConfig {


}
