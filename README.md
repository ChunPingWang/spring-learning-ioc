1.  Spring 可以使用下列 annotation，將 Bean 放入 Spring Container
```
@Configuration
@Componenet
@Service
@Repository   
```
2. 透過測試觀察 Spring IoC
a. 測試全部
```Gherkin=
./mvnw test
```
b. 測試 Component
```Gherkin=
./mvnw -Dtest=SpringIoCComponentTests test
```
c. 測試 Configuration
```Gherkin=
./mvnw -Dtest=SpringIoCConfigurationTests test
```
d. 測試 Repository
```Gherkin=
./mvnw -Dtest=SpringIoCRepositoryTests test
```
e. 測試 Service
```Gherkin=
./mvnw -Dtest=SpringIoCServiceTests test
```

