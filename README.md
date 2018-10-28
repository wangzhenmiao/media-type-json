# media-type-json
1、在https://start.spring.io/网站新建项目，maven项目，依赖中添加web
点击生成项目
2、添加controller和domain包，分别添加两个类文件
3、浏览器中访问：http://localhost:8080/users/22
显示：{"id":22,"name":"waylau","email":"waylau521@gmail.com"}

总结：添加@RestController注解的类，会呈现json格式的数据响应
