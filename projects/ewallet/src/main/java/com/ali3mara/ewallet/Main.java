package com.ali3mara.ewallet;

import com.ali3mara.ewallet.service.AppService;
import com.ali3mara.ewallet.service.impl.AppServiceImpl;

public class Main {
    public static void main(String[] args) {
        AppService appService = new AppServiceImpl();
        appService.start();
    }
}
