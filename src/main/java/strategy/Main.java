package strategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TranslateStrategy> translateStrategyList = List.of(new EnTranslatorImpl(), new FRTranslatorImpl(), new JATranslatorImpl(), new VNTranslatorImpl(), new ESTranslatorImpl());
        TranslateService translateService = new TranslateServiceImpl(translateStrategyList);
        List<String> languages = List.of("en", "fr", "ja", "vn", "es");
        languages.forEach(s -> printIt(translateService, s));
    }

    private static void printIt(TranslateService translateService, String s) {
        System.out.println(translateService.sayHello(s));
    }
}
