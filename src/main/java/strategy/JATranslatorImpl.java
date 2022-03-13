package strategy;

public class JATranslatorImpl implements TranslateStrategy {
    @Override
    public String sayHello() {
        return "Konichiwa";
    }

    @Override
    public boolean support(String language) {
        return "ja".equals(language);
    }
}
