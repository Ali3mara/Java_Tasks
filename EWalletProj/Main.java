package EWalletProj;

import EWalletProj.Service.*;

public class Main {
    public static void main(String[] args) {
        AppService appService = new Service.Impl.AppServiceImpl();
        appService.start();
    }
}