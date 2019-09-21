### Spring Cloud Config Server 端

### 步骤一：创建项目
1. 选择 Spring Web、Config Server

### 步骤二：server端相关配置
1. 启动类添加 @EnableConfigServer，激活对配置中心的支持
2. 编写 src/main/resources/application.yml
3. 启动项目后，测试server端是否可以读取到github上面的配置信息，直接访问：http://localhost:8001/neo-config/dev
4. 直接查看配置文件中的配置信息可访问：http://localhost:8001/neo-config-dev.properties

### 参考
参考资料 | 网址
--- | ---
springcloud(六)：配置中心git示例 | http://www.ityouknow.com/springcloud/2017/05/22/springcloud-config-git.html