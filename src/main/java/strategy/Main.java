package strategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TranslateService translateService = new TranslateServiceImpl();
        List<String> languages = List.of("en", "fr", "ja", "vn", "es");
        languages.forEach(s -> System.out.println(translateService.sayHello(s)));
    }
}
