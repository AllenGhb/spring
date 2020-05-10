package com.allen.cap6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 周何圳 2020/3/22 新建
 * @description
 */
public class AllenImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        // 返回全类名的bean
        return new String[]{"com.allen.cap6.bean.Pig","com.allen.cap6.bean.Tiger"};
    }
}
