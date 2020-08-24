#Java runtime compile process

##参考资料
https://www.cnblogs.com/hbuwdx/p/9489177.html

##fat jar 无法加载到依赖
###https://gitee.com/fhs-opensource/fhs-framework/blob/v2.x/fhs_extends/fhs_pagex/src/main/java/com/fhs/pagex/loader/MemoryClassLoader.java
###需要重写ForwardingJavaFileManager的相关方法。
1.list，返回文件的某一依赖集合。
2.inferBinaryName, 根据位置及名称推断class文件名
3.getJavaFileForOutput 编译完成后输出的文件。
###自己实现加载依赖jar的内容，给ForwardingJavaFileManager调用

##扩张 javassit动态生成类