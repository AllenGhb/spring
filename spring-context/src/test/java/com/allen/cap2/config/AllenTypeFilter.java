package com.allen.cap2.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author 周何圳 2020/3/20 新建
 * @description config
 */
public class AllenTypeFilter implements TypeFilter {

    private ClassMetadata classMetadata;

    /**
     * @param metadataReader        元数据，读取到当前正在扫描类的信息
     * @param metadataReaderFactory 可以获取到其他任何类的信息
     * @return
     * @throws
     * @author 周何圳 2020年03月20日 新建
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取当前正在扫描的类信息
        classMetadata = metadataReader.getClassMetadata();
        // 获取当前类资源(类的路径)
        Resource resource = metadataReader.getResource();
        // 获取正在扫描的类
        String className = classMetadata.getClassName();
        //System.out.println("------>" + resource);
        System.out.println("------>" + className);
        if (className.contains("ce")) {
            return true;
        }
        return false;
    }
}
