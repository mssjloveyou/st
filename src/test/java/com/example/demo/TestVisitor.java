package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.asm.*;

import java.util.ArrayList;
import java.util.List;

public class TestVisitor extends ClassVisitor {
    private List<String> methodList =  new ArrayList<>();
    private List<String> annotationOnClass =  new ArrayList<>();

    public TestVisitor(){
        super(Opcodes.ASM6);
    }

    public TestVisitor(int api) {
        super(api);
    }

    public TestVisitor(int api, ClassVisitor classVisitor) {
        super(api, classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name,
                                     String desc, String signature,
                                     String[] exceptions) {
        //每访问到一个方法，加入到field中
        System.out.println("visitMethod: " + name);
        methodList.add(name);

        return super.visitMethod(access, name, desc, signature, exceptions);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
        // 访问到类上注解，加入field
        System.out.println("visitAnnotation:"+descriptor);
        annotationOnClass.add(descriptor);
        return super.visitAnnotation(descriptor, visible);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        System.out.println("field:" + name);
        return super.visitField(access, name, descriptor, signature, value);
    }

    public List<String> getMethodList() {
        return methodList;
    }

    public List<String> getAnnotationOnClass() {
        return annotationOnClass;
    }
}
