package io.swagger.api.factories;

import io.swagger.api.AccountApiService;
import io.swagger.api.impl.AccountApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-03-30T07:20:49.594Z")
public class AccountApiServiceFactory {
    private final static AccountApiService service = new AccountApiServiceImpl();

    public static AccountApiService getAccountApi() {
        return service;
    }
}
