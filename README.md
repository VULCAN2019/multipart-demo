# 该仓库用于展示Springboot项目集成的fastdfs-client-java做文件上传的两种实现方式

> 依赖
> 
> ```properties
> <!-- Commons -->

> <dependency>
> 	<groupId>commons-fileupload</groupId>
> 	<artifactId>commons-fileupload</artifactId>
> 	<version>1.4</version>
> </dependency>
> 
> <!-- fdfs -->

> <dependency>
> 	<groupId>org.csource</groupId>
> 	<artifactId>fastdfs-client-java</artifactId>
> 	<version>1.29-SNAPSHOT</version>
> 	<!-- 排除 log4j12 否侧与springboot自带的冲突-->
> 	<exclusions>
> 		<exclusion>
> 			<groupId>org.slf4j</groupId>
> 			<artifactId>slf4j-log4j12</artifactId>
> 		</exclusion>
> 	</exclusions>
> </dependency>
> 
> <dependency>
> 	<groupId>org.springframework.boot</groupId>
> 	<artifactId>spring-boot-starter-web</artifactId>
> </dependency>
> 
> <!-- thymeleaf -->

> <dependency>
> 	<groupId>org.springframework.boot</groupId>
> 	<artifactId>spring-boot-starter-thymeleaf</artifactId>
> </dependency>
> ```
> 
> 
