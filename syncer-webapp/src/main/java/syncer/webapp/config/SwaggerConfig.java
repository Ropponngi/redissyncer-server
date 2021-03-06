// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// See the License for the specific language governing permissions and
// limitations under the License.

package syncer.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//import syncer.syncerpluswebapp.config.swagger.ModelCache;
//import syncer.syncerpluswebapp.config.swagger.model.GlobalString;


/**
 * @author zhanenqiang
 * @Description 描述
 * @Date 2020/6/8
 *
 *
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("syncer.webapp.controller.v2.api"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("RedisSyncer RESTful APIs")
                .description("RedisSyncer RESTful APIs")
                .termsOfServiceUrl("https://github.com/TraceNature/redissyncer-server")
//                .contact("developer@mail.com")
                .version("3.1")
                .build();
    }
}
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    @Bean
//    public Docket createRestApi() {
//
//        ParameterBuilder aParameterBuilder = new ParameterBuilder();
//        aParameterBuilder.name("Syncer-Token").description("登陆令牌").modelRef(new ModelRef("string")).parameterType("header").required(true).build();
//
//
//        List<Parameter> aParameters = Lists.newArrayList();
//        aParameters.add(aParameterBuilder.build());
////        ModelCache.getInstance().setParamClass(GlobalString.class);
//        return new Docket(DocumentationType.SWAGGER_2)
//                .pathMapping("/")
////                .globalOperationParameters(aParameters)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("syncer.syncerpluswebapp.controller.v2"))
//                .paths(PathSelectors.any())
//                .build().apiInfo(new ApiInfoBuilder()
//                        .title("Redis Syncer Swagger")
//                        .description("Redis Syncer Swagger")
//                        .version("3.0")
////                        .contact( new Contact("啊啊啊啊","blog.csdn.net","aaa@gmail.com"))
////                        .license("The Apache License")
////                        .licenseUrl("http://www.jdcloud.com")
//                        .build());
//    }
//}
