package strategy;

public class EnTranslatorImpl implements TranslateStrategy {
    @Override
    public String sayHello() {
        return "Hello";
    }

    @Override
    public boolean support(String language) {
        return "en".equals(language);
    }
}
